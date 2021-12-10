package dk.skat.es.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Node;

/*import com.logica.mansvc.model.DokumentHistorik;
import dk.skat.eori.util.DocumentType;
*/
/**
 * Part of the handler chain for web services. Don't rename the class - it is
 * referenced from both HandlerConfig.xml and ws-build.xml.
 * 
 * @author hedegaardo
 */
public class SOAPMessageHandler implements SOAPHandler<SOAPMessageContext> {
	
	private static Log log = null;

    public static Log getLogger() {
        if (log == null) {
            log = LogFactory.getLog(SOAPMessageHandler.class);
        }
        return log;
    }
    
    public boolean handleMessage(SOAPMessageContext  context) {
    	getLogger().debug("Entering handleMessage");
    	final SOAPMessage message = context.getMessage();
    	boolean outboundProperty = (Boolean) context.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if(!outboundProperty){
        	try {
    			RequestHelper.clearThreadLocalData("handleRequest");
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    		// Save the input message if it must be logged into document history
    		try {
    			ByteArrayOutputStream baos = new ByteArrayOutputStream();
    			message.writeTo(baos);
    			String xml = baos.toString();
    			RequestHelper.setInputMessage(xml);
    			
    			String logStr = " SERVICE REQUEST - " + Thread.currentThread().getId() + " {"+xml+"\n } SERVICE REQUEST";
    			getLogger().info(logStr);
    			System.out.println(logStr);
            } catch (SOAPException e) {
                e.printStackTrace();
                getLogger().error("SOAPException in handleRequest", e);
            } catch (IOException e) {
                e.printStackTrace();
                getLogger().error("IOException in handleRequest", e);
            }
    		getLogger().debug("Leaving handleMessage");
    		return true;
        }else if (outboundProperty){
        	if (RequestHelper.logInput()) {
    			String inputMessage = RequestHelper.getInputMessage();
    			Date inputMessageTimestamp = RequestHelper.getInputMessageTimestamp();
    			DocumentType inputDocType = RequestHelper.getInputDocType();
    			RequestHelper.addHistoryEntry(inputMessage, inputDocType, MessageType.INBOUND_REQUEST, inputMessageTimestamp);
    		} else
    		{
    		    getLogger().info("logInput is false so not adding input to history: " + RequestHelper.getInputDocType());
    		}
    		
    		ByteArrayOutputStream baos = new ByteArrayOutputStream();
    		try {
    			if (message != null) message.writeTo(baos);
    		} catch (Exception e) {
    			getLogger().warn("Error reading service response to BAOS", e);
    		}
    		String outputMessage = baos.toString();
    		
            String logStr = "\nSERVICE RESPONSE - " + Thread.currentThread().getId() + " {\n"+outputMessage+"\n } SERVICE RESPONSE";
    		getLogger().info(logStr);
    		System.out.println(logStr);
    		
    		if (RequestHelper.logOutput()) {
    			DocumentType outputDocType = RequestHelper.getOutputDocType();
    			RequestHelper.addHistoryEntry(outputMessage, outputDocType, MessageType.INBOUND_RESPONSE, new Date());
    		}

    		//flushDocumentHistoryToQueue();
    		getLogger().debug("Leaving handleMessage");
    		return true;
        }
        else{
        	getLogger().debug("Leaving handleMessage - not outbound or inbound!");
        	return false;
        }
    }
    

	/*public static void flushDocumentHistoryToQueue() {
		try {
			DocumentHistoryJMSSender jmsSender = new DocumentHistoryJMSSender();
			ArrayList<DokumentHistorik> dokumentHistorik = RequestHelper.getDokumentHistorik();
			if (dokumentHistorik != null && dokumentHistorik.size() > 0) {
				jmsSender.send(dokumentHistorik);
			}
		} catch (Exception e) {
			getLogger().error("Error sending to JMS on SOAP document history", e);
		}
	}*/
	
	/**
	 * Look up the transactionId value in the SOAP header. It is assumed to be placed in a structure
	 * like one of these:
	 * 
	 * <n1:IPMessageHeader xmlns:n1="http://skat.dk/ip/xml/schemas/system/2008/11/24/">
	 *   <n1:ip>
	 *     <n1:messageId>msgId-BEA JRockit(R)-e9172e12-478c-417c-a18b-55b28410db0a</n1:messageId>
	 *     <n1:transactionId>txId-4176@wmli026191-123464f6-3714-4a97-b26a-93336f91becf</n1:transactionId>
	 *   </n1:ip>
	 *   <n1:external>
	 *     <n1:messageId>msgId-4176@wmli026191-9415d28e-c5d7-4bbd-8992-9ff6edbbe17f</n1:messageId>
	 *     <n1:clientId>Portal</n1:clientId>
	 *   </n1:external>
	 *   <n1:general>
	 *     <n1:serviceName>GetEntityInformation</n1:serviceName>
	 *   </n1:general>
	 *   <n1:timestamps>
	 *     <n1:created>2010-06-02T11:46:47.584+02:00</n1:created>
	 *     <n1:processed>2010-06-02T11:46:47.998+02:00</n1:processed>
	 *   </n1:timestamps>
	 * </n1:IPMessageHeader>
	 * 
	 * or 
	 * 
	 * <IPMessageHeader xmlns="http://skat.dk/ip/xml/schemas/system/2008/11/24/">
	 *   <ip>
	 *     <messageId>msgId-4176@wmli026191-5f9360e1-22d5-4c8c-8ecd-66c6b82c97be</messageId>
	 *     <transactionId>txId-4176@wmli026191-ca2416a8-8670-4f78-8cbe-d33b2b6e59c9</transactionId>
	 *   </ip>
	 *   <external>
	 *     <messageId>msgId-4176@wmli026191-5beedf11-9860-4626-848a-71f56a52bc5b</messageId>
	 *     <clientId>Portal</clientId>
	 *   </external>
	 *   <general>
	 *     <serviceName>SummariskIndgangsangivelseSamlingHentService</serviceName>
	 *   </general>
	 *   <timestamps>
	 *     <created>2010-06-02T11:46:48.209+02:00</created>
	 *   </timestamps>
	 *   </IPMessageHeader>
	 *   
	 * @param header
	 * @return
	 */
	private String getTransactionId(SOAPHeader header) {
		if (header == null) return null;
		return evaluateXPath(header, new String[]{"IPMessageHeader","ip","transactionId"});
	}

	private String evaluateXPath(SOAPHeader header, String[] xpath) {
		Node current = header;
		for (String s : xpath) {
			current = getChild(current, s);
			if (current == null) return null;
		}
		Node firstChild = current.getFirstChild();
		if (firstChild == null) return null;
		return firstChild.getNodeValue();
	}
	
	private Node getChild(Node n, String name) {
		if (n == null) return null;
		Node firstChild = n.getFirstChild();
		if (firstChild == null) return null;
		String localName = firstChild.getLocalName();
		if (nodeMatch(firstChild, name)) return firstChild;
		Node nextSibling = firstChild.getNextSibling();
		while (nextSibling != null) {
			if (nodeMatch(nextSibling, name)) {
				return nextSibling;
			} else {
				nextSibling = nextSibling.getNextSibling();
			}
		}
		// couldn't find a child node with that name
		return null;
	}
	
	private boolean nodeMatch(Node n, String name) {
		if (n == null) return false;
		if (n.getLocalName() != null && n.getLocalName().equals(name)) return true;
		return false;
	}

	public Set<QName> getHeaders() {
        return Collections.emptySet();
    }
	
	public void close(MessageContext mc) {
    }
	
	public boolean handleFault(SOAPMessageContext mc) {
        return true;
    }

}
