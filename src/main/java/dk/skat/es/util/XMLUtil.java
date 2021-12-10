package dk.skat.es.util;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Element;

import org.w3c.dom.Node;

public class XMLUtil {
	
	private static Log log = LogFactory.getLog(XMLUtil.class);
    
    private static String indentStr(int idx) {
        if (idx <= 0)
            return "";

        return "                                               ".substring(0, idx);
    }

    public static void convertClassToXML(Object clz, int indent, StringBuffer xmlText) throws IllegalArgumentException,
                    IllegalAccessException, InvocationTargetException {
        Method[] mets = clz.getClass().getMethods();
        for (Method method : mets) {
            String mname = method.getName();
            if (mname.startsWith("get") && (!mname.equalsIgnoreCase("getBytes"))
                            && (!mname.equalsIgnoreCase("getClass"))) {
                Class<?>[] paras = method.getParameterTypes();
                if (paras.length == 0) {
                    String elemName = mname.substring(3);
                    method.setAccessible(true);
                    Object[] params = new Object[0];
                    Object obj = method.invoke(clz, params);
                    if (obj != null) {
                        String objClz = obj.getClass().getName();
                        if ((!obj.getClass().isArray()) && (!objClz.startsWith("noNamespace"))
                                        && (!objClz.startsWith("dk.skat"))) {
                        	if(obj instanceof XMLGregorianCalendar)
                        		obj = ((XMLGregorianCalendar)obj).toGregorianCalendar();
                            String val = obj.toString();
                            if (obj instanceof Calendar) {
                                Date dt = ((Calendar) obj).getTime();
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                                val = sdf.format(dt);
                            }
                            if ((val != null) && (val.length() > 0)) {
                                if (!elemName.startsWith("_"))
                                {
                                    xmlText.append(indentStr(indent) + "<ns:" + elemName + ">");
                                    xmlText.append(val);
                                    xmlText.append("</ns:" + elemName + ">");
                                } else
                                {
                                    xmlText.append(indentStr(indent) + val);
                                }
                                xmlText.append("\r\n");
                            }
                        } else {
                            if (obj.getClass().isArray()) {
                                Object[] objArr = (Object[]) obj;
                                for (Object object : objArr) {
                                    xmlText.append(indentStr(indent) + "<ns:" + elemName + ">\r\n");
                                    convertClassToXML(object, indent + 2, xmlText);
                                    xmlText.append(indentStr(indent) + "</ns:" + elemName + ">\r\n");
                                }
                            } else {
                                int locIdt = indent;
                                xmlText.append(indentStr(indent) + "<ns:" + elemName + ">");
                                if (objClz.startsWith("noNamespace"))
                                {
                                    xmlText.append(obj.toString().trim());
                                    locIdt = 0;
                                } else
                                {
                                    xmlText.append("\r\n");
                                    convertClassToXML(obj, indent + 2, xmlText);
                                }
                                xmlText.append(indentStr(locIdt) + "</ns:" + elemName + ">\r\n");
                            }
                        }
                    }
                }
            }
        }
    }

    public static String getIEDocumentAsXmlString(Object ieDoc) {
        if (ieDoc == null) return "";
    	String clz = ieDoc.getClass().getName();
        int dx = clz.lastIndexOf('.');
        if (dx > 0) {
            clz = clz.substring(dx + 1);
        }
        StringBuffer xml = new StringBuffer(4096);
        xml.append("<ns:" + clz + ">\r\n");
        try {
            convertClassToXML(ieDoc, 2, xml);
        } catch (Exception e) {
            xml.append(e);
        }
        xml.append("</ns:" + clz + ">\r\n");

        return xml.toString();
    }

    public static void writeToFile(String xml, String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            fos.write(xml.getBytes("UTF-8"));
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public static String evaluateXPath(Element header, String[] xpath) {
		Node current = header;
		for (String s : xpath) {
			current = getChild(current, s);
			if (current == null) return null;
		}
		Node firstChild = current.getFirstChild();
		if (firstChild == null) return null;
		return firstChild.getNodeValue();
	}
	
	public static Node getChild(Node n, String name) {
		if (n == null) return null;
		Node firstChild = n.getFirstChild();
		if (firstChild == null) return null;
		firstChild.getLocalName();
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
	
	public static boolean nodeMatch(Node n, String name) {
		if (n == null) return false;
		if (n.getLocalName() != null && n.getLocalName().equals(name)) return true;
		return false;
	}
	
	public static XMLGregorianCalendar toXMLCalendar(Date date){
    	if(date==null)
    		return null;
    	GregorianCalendar c = new GregorianCalendar();
        c.setTime(date);
        XMLGregorianCalendar xmlCal = null;
		try {
			xmlCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			log.debug("Error parsing Date to XMLGregorianCalendar",e);
		}
		
		return xmlCal;
    }
}
