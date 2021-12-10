
package dk.skat.begrebsmodel._2009._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.HovedOplysningerSvarType;


/**
 * <p>Java class for KontekstType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KontekstType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='skip' namespace='##other'/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KontekstType", propOrder = {
    "any"
	//,"hovedOplysningerSvarType"
})
public class KontekstType {

    @XmlAnyElement
    protected Element any;
    
    /*@XmlElement
    protected HovedOplysningerSvarType hovedOplysningerSvarType;*/

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setAny(Element value) {
        this.any = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
//    public HovedOplysningerSvarType getHovedOplysningerSvar() {
//        return hovedOplysningerSvarType;
//    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
/*    public void setHovedOplysningerSvar(HovedOplysningerSvarType value) {
        this.hovedOplysningerSvarType = value;
    }
*/

}
