///CLOVER:OFF
package dk.skat.es.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//import java.util.HashMap;
//import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

import org.apache.axis.message.MessageElement;
import org.apache.axis.utils.XMLUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import weblogic.utils.StringUtils;

//import com.logica.mansvc.services.SecurityHelper;
//import com.logica.mansvc.validation.DocumentType;
//import com.logica.mansvc.validation.StringConstants;
import com.logica.skatutil.objectpath.OPS;
import com.logica.skatutil.objectpath.OPU;

import dk.skat.es.util.DocumentType;

import org.w3c.dom.Element;

/**
 * Utility class with various methods for general request-handling functionality
 * 
 * @author Ole Hedegaard, ole.hedegaard@logica.com
 */
public class RequestHelper {

	private static Log log = null;


    private static final String PH_START = "";
    private static final String PH_END = "";
    private static final String PLACEHOLDER_TRANSACTIONID = PH_START + "transaktionsid-placeholder" + PH_END;
    private static final String PLACEHOLDER_SERVICEID = PH_START + "serviceid-placeholder" + PH_END;
    private static final String PLACEHOLDER_TRANSAKTIONTID = PH_START + "transaktionstid-placeholder" + PH_END;
    //private static final String PLACEHOLDER_FEJLBEGRUNDELSE = PH_START + "fejlbegrundelse-placeholder" + PH_END;
    //private static final String PLACEHOLDER_ERRORPOINTER = PH_START + "errorpointer-placeholder" + PH_END;
    //private static final String PLACEHOLDER_ORIGINALVALUE = PH_START + "originalvalue-placeholder" + PH_END;
    private static final String PLACEHOLDER_FEJLLISTE = PH_START + "fejlliste-placeholder" + PH_END;
    
    private static final String PLACEHOLDER_FEJLBEGRUNDELSE = PH_START + "10006" + PH_END;
    

    private static final String PLACEHOLDER_ORIGINALVALUE = PH_START + "ESVirksomhedStamOplysningStubService" + PH_END;

    private static String PLACEHOLDER_EORI_NUMBER=null;

    private static final String PLACEHOLDER_ERRORPOINTER = PH_START + "The company with EORI number "+ PLACEHOLDER_EORI_NUMBER +" does not exist in the whitelisted list." + PH_END;


    private static ThreadLocal<RequestHelperInfo> tlRequestInfo = new ThreadLocal<RequestHelperInfo>() {
        protected synchronized RequestHelperInfo initialValue() {
            getLogger().info("Creating a new helper() for this thread: " + Thread.currentThread().getName());
            return new RequestHelperInfo();
        }
    };
    
    static String hovedOplysningerSvarTemplate = 
        	"<HovedOplysningerSvar xmlns=\"http://skat.dk/begrebsmodel/xml/schemas/kontekst/2007/05/31/\">\r\n" + 
        	"	<TransaktionsID>" + PLACEHOLDER_TRANSACTIONID + "</TransaktionsID>\r\n" + 
        	"	<ServiceID>" + PLACEHOLDER_SERVICEID + "</ServiceID>\r\n" + 
        	"	<TransaktionsTid>" + PLACEHOLDER_TRANSAKTIONTID + "</TransaktionsTid>\r\n" + 
        	"	" + PLACEHOLDER_FEJLLISTE + "\r\n" + 
        	"</HovedOplysningerSvar>\r\n";


    public static String svarReaktionTemplate = 
        "	<SvarReaktion>\r\n" + 
        "		<Fejl>\r\n" + 
        "			<FejlNummer>" + PLACEHOLDER_FEJLBEGRUNDELSE + "</FejlNummer>\r\n" + // v�rdi fra FunktionelFejlBegrundelse
        "			<FejlTekst>" + PLACEHOLDER_ERRORPOINTER + "</FejlTekst>\r\n" + // error pointer
        "			<ServiceID>" + PLACEHOLDER_ORIGINALVALUE + "</ServiceID>\r\n" + // oprindelig attributv�rdi
        "			<Identifikation>\r\n" + 
        "				<VirksomhedSENummer xmlns=\"http://skat.dk/begrebsmodel/2009/01/15/\">" + PLACEHOLDER_EORI_NUMBER + "</VirksomhedSENummer>\r\n" + 
        "			</Identifikation>\r\n" + 
        "		</Fejl>\r\n" + 
        "	</SvarReaktion>\r\n";

    static String hoTemplate1 = 
    	"<HovedOplysninger xmlns=\"http://skat.dk/begrebsmodel/xml/schemas/kontekst/2007/05/31/\">\r\n" + 
    	"  <TransaktionsID>";
    static String hoTemplate2 = 
    	"</TransaktionsID>\r\n" + 
    	"  <TransaktionsTid>";
    static String hoTemplate3 = 
    	"</TransaktionsTid>\r\n" + 
    	"</HovedOplysninger>";

    static String hoTemplate4 = 
    	"</TransaktionsTid>\r\n" + 
    	"<RolleKode>2</RolleKode>\r\n" + 
    	"</HovedOplysninger>";
    
    private static RequestHelperInfo helper() {
    	return tlRequestInfo.get();
    }
    
	public static Log getLogger() {
        if (log == null) {
            log = LogFactory.getLog(RequestHelper.class);
        }
        return log;
    }
    
    public static void clearThreadLocalData(String whom) {
        helper().clear();
        //SecurityHelper.clearThreadLocalData();
    }
    
    /**
     * Set the SOAP request message as a ThreadLocal parameter. 
     * 
     * @param message
     */
    public static void setInputMessage(String message) {
    	helper().setInputMessage(message);
    }
    
    public static void addHovedOplysningerToOutboundRequest(Object kontekstOrDocType, DocumentType dtype) {
    	getLogger().debug("Entering addHovedOplysningerToOutboundRequest");
    	if (kontekstOrDocType == null) return;
    	SOAPElement hovedOplysninger = getHovedOplysninger();
    	// input may both be a kontekst or message type - so try both setters
    	OPS.seti(kontekstOrDocType, "any", hovedOplysninger);
    	OPS.seti(kontekstOrDocType, "kontekst.any", hovedOplysninger);
    	getLogger().debug("Leaving addHovedOplysningerToOutboundRequest");
    }

    public static void addICSHovedOplysningerToOutboundRequest(Object kontekstOrDocType, DocumentType dtype) {
    	if (kontekstOrDocType == null) return;
    	SOAPElement hovedOplysninger = getHovedOplysningerWithSystemUser();
    	// input may both be a kontekst or message type - so try both setters
    	OPS.seti(kontekstOrDocType, "any", hovedOplysninger);
    	OPS.seti(kontekstOrDocType, "kontekst.any", hovedOplysninger);
    }
    
	public static SOAPElement getHovedOplysninger() {
    	try {
    		String ho = getHovedOplysningerAsString();
    		return createSoapBodyElement(ho);
    	} catch (Exception e) {
    		e.printStackTrace();
    		return null;
    	}
	}

	public static SOAPElement getHovedOplysningerWithSystemUser() {
		try {
			String ho = getHovedOplysningerWithSystemUserAsString();
			return createSoapBodyElement(ho);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static String suffixTrans(String trkId)
	{
	    if (StringUtils.isEmptyString(trkId)) return "";
	    
	    return "_" + trkId;
	}
	
	private static String getHovedOplysningerAsString() {
		String transaktionId = getTransactionId();
		String transaktionsTid = getTransactionTid();
		
    	if (StringUtils.isEmptyString(transaktionId) || (transaktionId.length()<5)) {
    		transaktionId = "MAN_" + System.currentTimeMillis() + suffixTrans(transaktionId); 
    	}
    	
    	if (StringUtils.isEmptyString(transaktionsTid) || (transaktionsTid.length()<10)) {
    		transaktionsTid = generateXmlDateTime();
    	}

		String ho = hoTemplate1 + transaktionId + hoTemplate2 + transaktionsTid + hoTemplate3;
		return ho;
	}

	private static String getHovedOplysningerWithSystemUserAsString() {
		String transaktionId = getTransactionId();
		String transaktionsTid = getTransactionTid();
        
        if (StringUtils.isEmptyString(transaktionId) || (transaktionId.length()<5)) {
            transaktionId = "MAN_" + System.currentTimeMillis() + suffixTrans(transaktionId); 
        }
        
        if (StringUtils.isEmptyString(transaktionsTid) || (transaktionsTid.length()<10)) {
            transaktionsTid = generateXmlDateTime();
        }

		String ho = hoTemplate1 + transaktionId + hoTemplate2 + transaktionsTid + hoTemplate4;
		return ho;
	}
	
	private static String generateXmlDateTime() {
		 SimpleDateFormat iso8601Local = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		 TimeZone timeZone = TimeZone.getDefault(); //local JVM time zone
		 iso8601Local.setTimeZone(timeZone);
		 DecimalFormat twoDigits = new DecimalFormat("00");

		 Date now = new Date();
		 int offset = iso8601Local.getTimeZone().getOffset(now.getTime());
		 String sign = "+";
		 if (offset < 0) {
			 offset = -offset;
			 sign = "-";
		 }
		 int hours = offset / 3600000;
		 int minutes = (offset - hours * 3600000) / 60000;
		 String ISO8601Now = iso8601Local.format(now) + sign +
		 twoDigits.format(hours) + ":" + twoDigits.format(minutes);
		 return ISO8601Now;
	}
   
	private static SOAPElement createSoapBodyElement(String ho) throws SAXException, IOException, ParserConfigurationException, SOAPException 
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		InputStream bis = new ByteArrayInputStream(ho.getBytes());
		Document xdoc = XMLUtils.newDocument(bis);
        SOAPElement element = new MessageElement(xdoc.getDocumentElement()); 
		return element;
	}
    
    public static void assignHovedOplysningerAttributes(Element any) {
    	String transactionId = getHovedOplysningerAttribute(any, "TransaktionsID");
    	if (transactionId == null || "".equals(transactionId)) {
    		transactionId = getHovedOplysningerAttribute(any, "TransaktionIdentifikator");
    	}
    	String transactionTid = getHovedOplysningerAttribute(any, "TransaktionTid");
    	String rolleKode = getHovedOplysningerAttribute(any, "RolleKode");
    	if (rolleKode == null || rolleKode.length() == 0) rolleKode = "0";
    	String brugerKode = getHovedOplysningerAttribute(any, "BrugerKode");
    	if (brugerKode != null) {
			brugerKode = trimPrefix(brugerKode, "CVR_");
			brugerKode = trimPrefix(brugerKode, "EORI_");
			if (brugerKode.indexOf(":") != -1) {
				// Then BrugerKode contains the certificate CommonName attribute
				// The format is '[CVR_|EORI_]{id}:{CommonName}'
				String commonName = brugerKode.substring(brugerKode.indexOf(":") + 1);
				setCommonName(commonName);
				brugerKode = brugerKode.substring(0, brugerKode.indexOf(":"));
			}
    	}
    	String stedKode = getHovedOplysningerAttribute(any, "StedKode");
    	setTransactionId(transactionId);
    	setTransactionTid(transactionTid);
    	setCallerBrugerKode(brugerKode);
    	setCallerRolleKode(rolleKode);
    	// 1 = Portal, 2 = FTP-GW, 3=External
    	if ("1".equals(stedKode)) {
			sourceIsPortal();
    	} else if ("2".equals(stedKode)) {
    		sourceIsFtpGw();
    	} else {
    		sourceIsExternal();
    	}
    }

    public static void addHovedOplysningerSvar(Object kontekst, Object outputDocument) {
    	Object[] funktionelFejlArray = null;
    	if (outputDocument != null) {
    		funktionelFejlArray = extractFunktionelFejlArray(outputDocument);
    	}
    	if (kontekst == null) return;

    	SOAPElement hovedOplysningerSvar = getHovedOplysningerSvar(funktionelFejlArray, getTransactionId(), getTransactionTid());
    	try {
    		OPS.set(kontekst, "any", hovedOplysningerSvar);
    	} catch (ClassNotFoundException e) {
    		getLogger().warn("Error assigning HovedOplysningerSvar to response Kontekst", e);
    		//e.printStackTrace();
    	}
    }
    
    
    public static void addHovedOplysningerSvarForholdBevilling(Object kontekst, Object outputDocument,String seNummer,List<String> listOfErrorCVRs) {
    	Object[] funktionelFejlArray = null;
    	if (outputDocument != null) {
    		funktionelFejlArray = extractFunktionelFejlArray1(outputDocument);
    	}
    	if (kontekst == null) return;
    	SOAPElement hovedOplysningerSvar = getHovedOplysningerSvarForholdBevilling(funktionelFejlArray, getTransactionId(), getTransactionTid(),seNummer, listOfErrorCVRs);
    	try {
    		OPS.set(kontekst, "any", hovedOplysningerSvar);
    	} catch (ClassNotFoundException e) {
    		getLogger().warn("Error assigning HovedOplysningerSvar to response Kontekst", e);
    		//e.printStackTrace();
    	}
    }
    
    
    private static Object[] extractFunktionelFejlArray1(Object outputDocument) {
		getLogger().debug("Entering extractFunktionelFejlArray"+outputDocument);
		if (outputDocument == null) return null;
		getLogger().debug(outputDocument.getClass().getName());
		Object[] funktionelFejlArray = null;
    	try {
    		Object object = OPU.get(outputDocument, "FunktionelFejlListe.FunktionelFejl");
    		if (object == null) {
    			object = OPU.get(outputDocument, "EORIVirksomhedSamling.FunktionelFejlListe.FunktionelFejl");
    		}
    		if (object != null && object instanceof Object[]) {
    			funktionelFejlArray = (Object[]) object;
    		}
    	} catch (Exception e) {
    		System.out.println(" private static Object[] extractFunktionelFejlArray(Object outputDocument) Exception Caught--------->");
    		funktionelFejlArray = null;
    	}
		return funktionelFejlArray;
	}
    
    
    public static SOAPElement getHovedOplysningerSvarForholdBevilling(Object[] funktionelFejlArray, String transaktionId, String transaktionsTid,String seNummer,List<String> listOfErrorCVRs) {
    	String hovedOplysninger = hovedOplysningerSvarTemplate;

    	if (transaktionId == null) transaktionId = "";
    	if (transaktionsTid == null) {
    		transaktionsTid = generateXmlDateTime();
    	}
    	
    	DocumentType inputType = getInputDocType();
    	//String useCase = getUseCaseByInputDocument(inputType);
    	
		hovedOplysninger = hovedOplysninger.replace(PLACEHOLDER_TRANSACTIONID, transaktionId);
		hovedOplysninger = hovedOplysninger.replace(PLACEHOLDER_TRANSAKTIONTID, transaktionsTid);
		//String serviceId = "MAN-" + useCase + "-" + (inputType != null ? inputType.toString() : "Unknown");
		String serviceId = "EORIStubService";
		hovedOplysninger = hovedOplysninger.replace(PLACEHOLDER_SERVICEID, serviceId);

    	StringBuffer svarReaktionListe = new StringBuffer();
    	
    	for(String listOfErrorCVR : listOfErrorCVRs) {
    		
    		svarReaktionListe.append("<SvarReaktion>\r\n"); 
			svarReaktionListe.append("		<Fejl>\r\n" ); 
			svarReaktionListe.append("			<FejlNummer>" + PLACEHOLDER_FEJLBEGRUNDELSE + "</FejlNummer>\r\n");
			svarReaktionListe.append("			<FejlTekst>").append("The company with EORI number ").append(listOfErrorCVR).append(" does not exist in the whitelisted list.").append("</FejlTekst>\r\n");
			svarReaktionListe.append("			<ServiceID>" + PLACEHOLDER_ORIGINALVALUE + "</ServiceID>\r\n");
			svarReaktionListe.append("			<Identifikation>\r\n" ); 
			svarReaktionListe.append("				<VirksomhedSENummer xmlns=\"http://skat.dk/begrebsmodel/2009/01/15/\">" + listOfErrorCVR + "</VirksomhedSENummer>\r\n"); 
			svarReaktionListe.append("			</Identifikation>\r\n" );
			svarReaktionListe.append("		</Fejl>\r\n" );
			svarReaktionListe.append("	</SvarReaktion>\r\n");
    		
    	}
    			
    	hovedOplysninger = hovedOplysninger.replace(PLACEHOLDER_FEJLLISTE, svarReaktionListe.toString());
    	
    	try {
			SOAPElement element = createSoapBodyElement(hovedOplysninger);
			return element;
		} catch (Exception e) {
			getLogger().debug("Exception creating SOAP element: ",e);
			getLogger().warn("Unable to create SOAP element", e);
			//e.printStackTrace();
			return null;
		}
    }
    
    public static void addHovedOplysningerSvar1(Object kontekst, Object outputDocument,String seNumber) {
    	Object[] funktionelFejlArray = null;
    	if (outputDocument != null) {
    		funktionelFejlArray = extractFunktionelFejlArray(outputDocument);
    	}
    	if (kontekst == null) return;
		


    	SOAPElement hovedOplysningerSvar = getHovedOplysningerSvar1(funktionelFejlArray, getTransactionId(), getTransactionTid(),seNumber);
    	try {
    		OPS.set(kontekst, "any", hovedOplysningerSvar);
    	} catch (ClassNotFoundException e) {
    		getLogger().warn("Error assigning HovedOplysningerSvar to response Kontekst", e);
    		//e.printStackTrace();
    	}
    }
    
	private static Object[] extractFunktionelFejlArray(Object outputDocument) {
		getLogger().debug("Entering extractFunktionelFejlArray"+outputDocument);
		if (outputDocument == null) return null;
		getLogger().debug(outputDocument.getClass().getName());
		Object[] funktionelFejlArray = null;
    	try {
    		Object object = OPU.get(outputDocument, "FunktionelFejlListe.FunktionelFejl");
    		System.out.println("Object object = OPU.get(outputDocument, \"FunktionelFejlListe.FunktionelFejl\")#####################---->"+object);
    		if (object == null) {
    			object = OPU.get(outputDocument, "Ankomstdeklaration.FunktionelFejlListe.FunktionelFejl");
    		}
    		if (object == null) {
    			object = OPU.get(outputDocument, "Afgangsdeklaration.FunktionelFejlListe.FunktionelFejl");
    		}
    		if (object != null && object instanceof Object[]) {
    			funktionelFejlArray = (Object[]) object;
    		}
    	} catch (Exception e) {
    		System.out.println(" private static Object[] extractFunktionelFejlArray(Object outputDocument) Exception Caught--------->");
    		funktionelFejlArray = null;
    	}
		return funktionelFejlArray;
	}
	
    public static SOAPElement getHovedOplysningerSvar(Object[] funktionelFejlArray, String transaktionId, String transaktionsTid) {
    	String hovedOplysninger = hovedOplysningerSvarTemplate;

    	if (transaktionId == null) transaktionId = "";
    	if (transaktionsTid == null) {
    		transaktionsTid = generateXmlDateTime();
    	}
    	
    	DocumentType inputType = getInputDocType();
    	//String useCase = getUseCaseByInputDocument(inputType);
    	
		hovedOplysninger = hovedOplysninger.replace(PLACEHOLDER_TRANSACTIONID, transaktionId);
		hovedOplysninger = hovedOplysninger.replace(PLACEHOLDER_TRANSAKTIONTID, transaktionsTid);
		//String serviceId = "MAN-" + useCase + "-" + (inputType != null ? inputType.toString() : "Unknown");
		String serviceId = "ESVirksomhedStamOplysningStub";
		hovedOplysninger = hovedOplysninger.replace(PLACEHOLDER_SERVICEID, serviceId);
    	
    	StringBuffer svarReaktionListe = new StringBuffer();
//    	if (MANProperties.isTKT()) {	// isTKT removed from MANProperties
    		/*System.out.println("Printout of funktionelfejl array:");
    		if (funktionelFejlArray != null) {
    			for (Object funktionelFejl : funktionelFejlArray) {
    				if (funktionelFejl == null) continue;
    				System.out.println(createSvarReaktion(funktionelFejl));
    			}
    		}*/
//    	} else {
    		if (funktionelFejlArray != null) {
    			for (Object funktionelFejl : funktionelFejlArray) {
    				if (funktionelFejl == null) continue;
    				svarReaktionListe.append(createSvarReaktion(funktionelFejl));
    			}
    		}
//    	}
    	
    	hovedOplysninger = hovedOplysninger.replace(PLACEHOLDER_FEJLLISTE, svarReaktionListe.toString());
    	
    	try {
			SOAPElement element = createSoapBodyElement(hovedOplysninger);
			return element;
		} catch (Exception e) {
			getLogger().debug("Exception creating SOAP element: ",e);
			getLogger().warn("Unable to create SOAP element", e);
			//e.printStackTrace();
			return null;
		}
    }
    
    
    
    public static SOAPElement getHovedOplysningerSvar1(Object[] funktionelFejlArray, String transaktionId, String transaktionsTid,String økonomiskOperatørEORINummer) {
    	String hovedOplysninger = hovedOplysningerSvarTemplate;

    	if (transaktionId == null) transaktionId = "";
    	if (transaktionsTid == null) {
    		transaktionsTid = generateXmlDateTime();
    	}
    	
    	DocumentType inputType = getInputDocType();
    	//String useCase = getUseCaseByInputDocument(inputType);
    	
		hovedOplysninger = hovedOplysninger.replace(PLACEHOLDER_TRANSACTIONID, transaktionId);
		hovedOplysninger = hovedOplysninger.replace(PLACEHOLDER_TRANSAKTIONTID, transaktionsTid);
		//String serviceId = "MAN-" + useCase + "-" + (inputType != null ? inputType.toString() : "Unknown");
		String serviceId = "ESVirksomhedStamOplysningStubService";
		hovedOplysninger = hovedOplysninger.replace(PLACEHOLDER_SERVICEID, serviceId);

    	StringBuffer svarReaktionListe = new StringBuffer();
    	
    	

    	
//    	if (MANProperties.isTKT()) {	// isTKT removed from MANProperties
    		/*System.out.println("Printout of funktionelfejl array:");
    		if (funktionelFejlArray != null) {
    			for (Object funktionelFejl : funktionelFejlArray) {
    				if (funktionelFejl == null) continue;
    				System.out.println(createSvarReaktion(funktionelFejl));
    			}
    		}*/
//    	} else {
    		//if (funktionelFejlArray != null) {
    			
    			
    			svarReaktionListe.append("<SvarReaktion>\r\n"); 
    			svarReaktionListe.append("		<Fejl>\r\n" ); 
    			svarReaktionListe.append("			<FejlNummer>" + PLACEHOLDER_FEJLBEGRUNDELSE + "</FejlNummer>\r\n");
    			svarReaktionListe.append("			<FejlTekst>").append("The company with ES number ").append(økonomiskOperatørEORINummer).append(" does not exist in the whitelisted list.").append("</FejlTekst>\r\n");
    			svarReaktionListe.append("			<ServiceID>" + PLACEHOLDER_ORIGINALVALUE + "</ServiceID>\r\n");
    			svarReaktionListe.append("			<Identifikation>\r\n" ); 
    			//svarReaktionListe.append("			<ØkonomiskOperatørEORINummer xmlns=\"http://skat.dk/begrebsmodel/2009/01/15/\">" + økonomiskOperatørEORINummer + "</ØkonomiskOperatørEORINummer>\r\n"); 
    			//svarReaktionListe.append("				<OkonomiskOperatorEORINummer xmlns=\"http://skat.dk/begrebsmodel/2009/01/15/\">" + økonomiskOperatørEORINummer + "</OkonomiskOperatorEORINummer>\r\n"); 
    			svarReaktionListe.append("			</Identifikation>\r\n" );
    			svarReaktionListe.append("		</Fejl>\r\n" );
    			svarReaktionListe.append("	</SvarReaktion>\r\n");

    			
    			
    			//for (Object funktionelFejl : funktionelFejlArray) {
    				//if (funktionelFejl == null) continue;
    				//svarReaktionListe.append(svarReaktionTemplate);
    			//}
    		//}
//    	}
    	
    	hovedOplysninger = hovedOplysninger.replace(PLACEHOLDER_FEJLLISTE, svarReaktionListe.toString());
    	
    	try {
			SOAPElement element = createSoapBodyElement(hovedOplysninger);
			return element;
		} catch (Exception e) {
			getLogger().debug("Exception creating SOAP element: ",e);
			getLogger().warn("Unable to create SOAP element", e);
			//e.printStackTrace();
			return null;
		}
    }

    // Create one SvarReaktion structure represented as a String
    private static String createSvarReaktion(Object funktionelFejl) {
    	if (funktionelFejl == null) return "";
    	String begrundelse = getAttributeFromFunktionelFejl(funktionelFejl, "FunktionelFejlBegrundelse");
    	String oprindeligVaerdi = getAttributeFromFunktionelFejl(funktionelFejl, "FunktionelFejlOprindeligAttributV�rdi");
    	if (StringUtils.isEmptyString(oprindeligVaerdi)) oprindeligVaerdi = "unknown error";

    	String fejlPointer = getAttributeFromFunktionelFejl(funktionelFejl, "FunktionelFejlPointer");
    	//String fejlType = getAttributeFromFunktionelFejl(funktionelFejl, "FunktionelFejlType"); // not used
    	
    	String returnValue = svarReaktionTemplate;
		returnValue = returnValue.replace(PLACEHOLDER_FEJLBEGRUNDELSE, URLEncoder.encode(begrundelse));
		returnValue = returnValue.replace(PLACEHOLDER_ERRORPOINTER, URLEncoder.encode(fejlPointer));
		returnValue = returnValue.replace(PLACEHOLDER_ORIGINALVALUE, URLEncoder.encode(oprindeligVaerdi));
    	
		return returnValue;
	}
    
    private static String getAttributeFromFunktionelFejl(Object funktionelFejl, String attribute) {
    	if (funktionelFejl == null) return "";
    	Object tmp = OPU.get(funktionelFejl, attribute);
    	if (tmp == null) return "";
    	if (tmp instanceof String) {
    		return (String) tmp;
    	} else {
    		return tmp.toString();
    	}
    }

    public static void setRuleEngineVariable(String varname, Object varValue)
    {
        helper().getRuleEngineVars().put(varname, varValue);
    }
    
    public static Object getRuleEngineVariable(String varname)
    {
        return helper().getRuleEngineVars().get(varname);
    }
    
	public static void sourceIsExternal() {
		setSource("FTP");
	}

	public static void sourceIsFtpGw() {
		setSource("FTP");
	}

	public static void sourceIsPortal() {
		setSource("FTP");
	}
    
	private static String getHovedOplysningerAttribute(Element any, String attribute) {
		String value;
		try {
			value = XMLUtil.evaluateXPath(any, new String[]{attribute});
    	} catch (Exception e) {
    		e.printStackTrace();
    		value = "";
    	}
    	getLogger().info(attribute + " from request[" + Thread.currentThread().getId() + "]: " + value);
		return value;
	}
    
	private static String trimPrefix(String brugerKode, String prefix) {
		if (brugerKode.startsWith(prefix)) {
			brugerKode = brugerKode.substring(prefix.length());
		}
		return brugerKode;
	}
	
    public static void setTransactionId(String transactionId) {
    	helper().setHoTransactionId(transactionId);
    }
    
    public static String getTransactionId() {
    	return helper().getHoTransactionId();
    }
    
    public static void setTransactionTid(String tid) {
    	helper().setHoTransactionTid(tid);
    }
    
    public static String getTransactionTid() {
    	return helper().getHoTransactionTid();
    }
	
	public static void setCommonName(String commonName) {
		helper().setCommonName(commonName);
	}
	
	public static String getCommonName() {
		return helper().getCommonName();
	}

    public static void setCallerBrugerKode(String brugerKode) {
    	helper().setCallerBrugerKode(brugerKode);
    }
    
    public static String getCallerBrugerKode() {
    	return helper().getCallerBrugerKode();
    }

    public static void setSource(String source) {
    	helper().setSource(source);
    }
    
    public static String getSource() {
    	return helper().getSource();
    }
    
    public static void setCallerRolleKode(String rolleKode) {
    	helper().setCallerRolleKode(rolleKode);
    }
    
    public static String getCallerRolleKode() {
    	return helper().getCallerRolleKode();
    }
    
    // #####################################################
    // ########## D O C U M E N T   H I S T O R Y ########## 
    // #####################################################
    
    /**
     * Add a new ENS history entry for callout request. Assumes that the MRN number, CalloutRequestDocType, and registrator TIN has 
     * been set on the ThreadLocal
     */
    public static void addHistoryRequestEntryForClientCall(String xml, Date timestamp) {
        String refs = helper().getCalloutReferenceIds();
        if (StringUtils.isEmptyString(refs))
            addHistoryEntry(xml, RequestHelper.getCalloutRequestDocType(), MessageType.OUTBOUND_REQUEST, timestamp);
        else
            addHistoryEntryWithRefs(xml, RequestHelper.getCalloutRequestDocType(), MessageType.OUTBOUND_REQUEST, timestamp, refs);
		setLogNextCalloutRequest(false);
    }
    
    /**
     * Add a new ENS history entry for callout response. Assumes that the MRN number, CalloutResponseDocType, and registrator TIN has 
     * been set on the ThreadLocal
     */
    public static void addHistoryResponseEntryForClientCall(String xml, Date timestamp) {
    	addHistoryEntry(xml, RequestHelper.getCalloutResponseDocType(), MessageType.OUTBOUND_RESPONSE, timestamp);
		setLogNextCalloutResponse(false);
    }
    
    public static void addHistoryResponseEntryWithRefs(String xml, Date timestamp, String refs) {
        addManualHistoryEntry(refs, xml, RequestHelper.getCalloutResponseDocType(), MessageType.OUTBOUND_RESPONSE, timestamp);
        setLogNextCalloutResponse(false);
    }
    
	public static void addHistoryEntry(String xml, DocumentType documentType, MessageType messageType, Date timestamp) {
	    String refs = RequestHelper.getReferenceIds();
	    getLogger().info(Thread.currentThread().getId() + " - Now adding history for docType: " + documentType + " with refs: " + refs);
		addHistoryEntry(refs, xml, documentType, messageType, timestamp);
	}
	
    public static void addHistoryEntryWithRefs(String xml, DocumentType documentType, MessageType messageType, Date timestamp, String refs) {
        if (refs==null) refs = RequestHelper.getReferenceIds();
        getLogger().info(Thread.currentThread().getId() + " - Now adding history for docType: " + documentType + " with refs: " + refs);
        addHistoryEntry(refs, xml, documentType, messageType, timestamp);
    }
    
    public static void addManualHistoryEntry(String refs, String xml, DocumentType documentType, MessageType messageType, Date timestamp) {
        try
        {
            if (refs==null) refs = RequestHelper.getReferenceIds();
            getLogger().info(Thread.currentThread().getId() + " - Now adding manual history for docType: " + documentType + " with refs: " + refs);
            addHistoryEntry(refs, xml, documentType, messageType, timestamp);
        } catch (Exception e) {
            // this method may never throw exception - better that the history entry is not created then
            getLogger().info("Trying to manually add History entry failed",e);
        }
    }
    
    private static void addHistoryEntry(String referenceNumbers, String xml, DocumentType documentType, MessageType messageType, Date timestamp) {
        if (referenceNumbers == null || referenceNumbers.length() == 0) {
            getLogger().info("Trying to add History entry without reference id on docType: " + documentType);
            return;
        }
        // referenceNumbers contains a comma separated list of reference numbers - log an history entry for each
        String omits = "";
        StringTokenizer st = new StringTokenizer(referenceNumbers, ",");
        while (st.hasMoreTokens()) {
            String referenceNumber = st.nextToken();
            if (referenceNumber == null || referenceNumber.length() == 0) continue;
            if (filterOutHistoryReference(referenceNumber,documentType))
            {
                omits = omits + referenceNumber + ",";
            } else
               // addHistoryEntrySingle(referenceNumber, xml, documentType, messageType, timestamp);
            omits = omits + referenceNumber + ",";
        }
        if (omits.length()>0)
            getLogger().info("Skipping an addHistory with an odd refId: " + omits + " or docType: " + documentType);
    }

	private static boolean filterOutHistoryReference(String refNum, DocumentType docType) {
	    // never add IEI78/79, IEA62/63 on MIO documents - only on TD's
	    if (
	            (docType==DocumentType.IEI78) || (docType==DocumentType.IEI79) || 
	            (docType==DocumentType.IEA62) || (docType==DocumentType.IEA63)
	       )
	    {
	        if (!StringConstants.isTRNNumber(refNum)) return true;
	    }
	    
	    return false;
    }
	
    private static boolean omitDocumentTypeInHistory(DocumentType documentType) {
		if (documentType == null) return true;
		if (DocumentType.EORI_SH == documentType) return true;
		if (DocumentType.EORI_VV == documentType) return true;
		return false;
	}

	public static String messageTypeToActivity(MessageType messageType) {
		if (messageType == MessageType.INBOUND_REQUEST) {
			return "";
		} else if (messageType == MessageType.OUTBOUND_RESPONSE) {
			return "";
		} else if (messageType == MessageType.INBOUND_RESPONSE) {
			return "";
		} else if (messageType == MessageType.OUTBOUND_REQUEST) {
			return "";
		} else return "";
	}
	
    private static String decideAction(DocumentType documentType) {
		if (documentType == null) {
			getLogger().info("Could not decide History 'action'/'h�ndelse' for null DocumentType");
			return "";
		}
		
		return documentType.toString();
	}

    public static void setInputDocType(DocumentType inputDocType) {
		helper().setInputDocType(inputDocType);
	}

    private static void setCalloutRequestDocType(DocumentType calloutRequestDocType) {
    	helper().setCalloutRequestDocType(calloutRequestDocType);
    }
    
    public static DocumentType getCalloutRequestDocType() {
    	return helper().getCalloutRequestDocType();
    }
    
    private static void setCalloutResponseDocType(DocumentType calloutResponseDocType) {
    	helper().setCalloutResponseDocType(calloutResponseDocType);
    }
    
    public static DocumentType getCalloutResponseDocType() {
    	return helper().getCalloutResponseDocType();
    }
    
    public static void setOutputErrorDocument(Object doc)
    {
        helper().setOutputErrorDocument(doc);
    }
    
    public static Object getOutputErrorDocument()
    {
        return helper().getOutputErrorDocument();
    }

	public static DocumentType getOutputDocType() {
		return helper().getOutputDocType();
	}

	public static void setOutputDocType(DocumentType outputDocType) {
		helper().setOutputDocType(outputDocType);
	}
	
	public static Boolean getLogNextCalloutRequest() {
		return helper().getLogNextCalloutRequest();
	}

    public static void logNextCallout(DocumentType req, DocumentType res, String keys)
    {
        helper().setCalloutReferenceIds(keys);
        if (req != null) logNextCalloutRequest(req);
        if (res != null) logNextCalloutResponse(res);
    }
    
	public static void logNextCalloutRequest(DocumentType documentType) {
	    // do NOT change 'setLogNextCalloutRequest' as we may be on our way into a recursive EORI loop then !
	    if (!documentType.equals(DocumentType.EORI_VV)) 
	        helper().setLogNextCalloutRequest(true);
		setCalloutRequestDocType(documentType);
	}
	
	public static void logNextCalloutResponse(DocumentType documentType) {
		helper().setLogNextCalloutResponse(true);
		setCalloutResponseDocType(documentType);
	}
	
	public static void setLogNextCalloutRequest(Boolean logNextCalloutRequest) {
		if (logNextCalloutRequest != null && logNextCalloutRequest.booleanValue()) {
			// We need to look up the TIN now to avoid cyclic SoapClientMessageHandler behaviour
			//SecurityHelper.getCallerTIN(); // TIN is then saved on ThreadLocal variable, and not looked up again
		}
		helper().setLogNextCalloutRequest(logNextCalloutRequest);
	}

	public static Boolean getLogNextCalloutResponse() {
		return helper().getLogNextCalloutResponse();
	}

	public static void setLogNextCalloutResponse(Boolean logNextCalloutResponse) {
		helper().setLogNextCalloutResponse(logNextCalloutResponse);
	}
	
	
	public static void logOutputWithType(DocumentType documentType) {
		helper().setLogOutput(true);
		if (documentType != null) {
			setOutputDocType(documentType);
		}
	}

	public static boolean logInput() {
		return helper().getLogInput();
	}
	
	public static boolean logOutput() {
		return helper().getLogOutput();
	}
	
    /**
     * Look up the SOAP request message stored on the ThreadLocal object
     * @return SOAP request
     */
    public static String getInputMessage() {
        return helper().getInputMessage();
    }

    public static Date getInputMessageTimestamp() {
    	return helper().getInputMessageTimestamp();
    }
    
    public static boolean isNotificationRequest()
    {
        return (DocumentType.IEA62.equals(RequestHelper.getInputDocType()) || DocumentType.IED51.equals(RequestHelper.getInputDocType()));
    }
    
	public static DocumentType getInputDocType() {
		return helper().getInputDocType();
	}

	/*public static ArrayList<DokumentHistorik> getDokumentHistorik() {
    	return helper().getDokumentHistorik();
    }*/
	
    public static void setReferenceIds(String referenceIds) {
    	helper().setReferenceIds(referenceIds);
    }
    
    public static void addReferenceId(String referenceId) {
        if (!StringUtils.isEmptyString(referenceId))
            helper().addReferenceId(referenceId);
    }
    
    public static String getReferenceIds() {
    	return helper().getReferenceIds();
    }
    
    public static String getUseCase() {
    	return helper().getUseCase();
    }
    
    public static void setUseCase(String useCase) {
    	helper().setUseCase(useCase);
    }
    
	public static Boolean getNotifyScenario() {
		return helper().getNotifyScenario();
	}

	public static void setNotifyScenario(Boolean notifyScenario) {
		helper().setNotifyScenario(notifyScenario);
	}

    public static String getNotifyScenarioReceivers() {
        return helper().getNotifyScenarioReceivers();
    }

    public static void setNotifyScenarioReceivers(String recs) {
        helper().setNotifyScenarioReceivers(recs);
    }

	
	public static String getLastCalloutResponse() {
		return helper().getLastCalloutResponse();
	}

	public static void setLastCalloutResponse(String lastCalloutResponse) {
		helper().setLastCalloutResponse(lastCalloutResponse);
	}
	
	/**
	 * For logging callout response to document history in cases where we don't know the reference
	 * ids until the response has been parsed and set... then, this method can be invoked to log
	 * the proper document history entries.
	 */
	public static void logResponseEntriesManually(String refs) {
		String lastCalloutResponse = RequestHelper.getLastCalloutResponse();
		if (refs==null) refs = RequestHelper.getReferenceIds();
		RequestHelper.addHistoryResponseEntryWithRefs(lastCalloutResponse, new Date(), refs);
	}
}
