
package dk.skat.begrebsmodel.kontakt._2009._01._15;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * OSB Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VirksomhedKontaktOplysningSamlingHentService", targetNamespace = "http://skat.dk/begrebsmodel/2009/01/15/", wsdlLocation = "http://sktudv01esb01:8011/PS_VirksomhedKontaktOplysningSamlingHent?wsdl")
public class VirksomhedKontaktOplysningSamlingHentService
    extends Service
{

    private final static URL VIRKSOMHEDKONTAKTOPLYSNINGSAMLINGHENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException VIRKSOMHEDKONTAKTOPLYSNINGSAMLINGHENTSERVICE_EXCEPTION;
    private final static QName VIRKSOMHEDKONTAKTOPLYSNINGSAMLINGHENTSERVICE_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "VirksomhedKontaktOplysningSamlingHentService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://sktudv01esb01:8011/PS_VirksomhedKontaktOplysningSamlingHent?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VIRKSOMHEDKONTAKTOPLYSNINGSAMLINGHENTSERVICE_WSDL_LOCATION = url;
        VIRKSOMHEDKONTAKTOPLYSNINGSAMLINGHENTSERVICE_EXCEPTION = e;
    }

    public VirksomhedKontaktOplysningSamlingHentService() {
        super(__getWsdlLocation(), VIRKSOMHEDKONTAKTOPLYSNINGSAMLINGHENTSERVICE_QNAME);
    }

    public VirksomhedKontaktOplysningSamlingHentService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VIRKSOMHEDKONTAKTOPLYSNINGSAMLINGHENTSERVICE_QNAME, features);
    }

    public VirksomhedKontaktOplysningSamlingHentService(URL wsdlLocation) {
        super(wsdlLocation, VIRKSOMHEDKONTAKTOPLYSNINGSAMLINGHENTSERVICE_QNAME);
    }

    public VirksomhedKontaktOplysningSamlingHentService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VIRKSOMHEDKONTAKTOPLYSNINGSAMLINGHENTSERVICE_QNAME, features);
    }

    public VirksomhedKontaktOplysningSamlingHentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VirksomhedKontaktOplysningSamlingHentService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VirksomhedKontaktOplysningSamlingHentServicePortType
     */
    @WebEndpoint(name = "VirksomhedKontaktOplysningSamlingHentPort")
    public VirksomhedKontaktOplysningSamlingHentServicePortType getVirksomhedKontaktOplysningSamlingHentPort() {
        return super.getPort(new QName("http://skat.dk/begrebsmodel/2009/01/15/", "VirksomhedKontaktOplysningSamlingHentPort"), VirksomhedKontaktOplysningSamlingHentServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VirksomhedKontaktOplysningSamlingHentServicePortType
     */
    @WebEndpoint(name = "VirksomhedKontaktOplysningSamlingHentPort")
    public VirksomhedKontaktOplysningSamlingHentServicePortType getVirksomhedKontaktOplysningSamlingHentPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://skat.dk/begrebsmodel/2009/01/15/", "VirksomhedKontaktOplysningSamlingHentPort"), VirksomhedKontaktOplysningSamlingHentServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VIRKSOMHEDKONTAKTOPLYSNINGSAMLINGHENTSERVICE_EXCEPTION!= null) {
            throw VIRKSOMHEDKONTAKTOPLYSNINGSAMLINGHENTSERVICE_EXCEPTION;
        }
        return VIRKSOMHEDKONTAKTOPLYSNINGSAMLINGHENTSERVICE_WSDL_LOCATION;
    }

}
