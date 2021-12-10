
package dk.skat.es.exceptions;

//import javax.xml.ws.WebFault;


/**
 * This class was generated 
 * Tue Oct 08 16:17:18 IST 2021
 * Generated source version: 1.0
 * 
 */

//@WebFault(name = "EORINumberNotFound", targetNamespace = "http://ws.begrebsmodel.skat.dk")
public class EORINumberNotFoundException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EORINumberNotFoundException() {
        super();
    }
    
    public EORINumberNotFoundException(String message) {
        super(message);
    }
    
    public EORINumberNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
