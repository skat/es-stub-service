
package dk.skat.begrebsmodel._2009._01._15;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RegistreringForholdBevillingHent_FejlIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistreringForholdBevillingHent_FejlIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdGyldigFra" minOccurs="0"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer" minOccurs="0"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode" minOccurs="0"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingTypeKode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistreringForholdBevillingHent_FejlIdType", propOrder = {
    "bevillingForholdGyldigFra",
    "virksomhedSENummer",
    "pligtKode",
    "bevillingTypeKode"
})
public class RegistreringForholdBevillingHentFejlIdType {

    @XmlElement(name = "BevillingForholdGyldigFra")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bevillingForholdGyldigFra;
    @XmlElement(name = "VirksomhedSENummer")
    protected BigInteger virksomhedSENummer;
    @XmlElement(name = "PligtKode")
    protected String pligtKode;
    @XmlElement(name = "BevillingTypeKode")
    protected BigInteger bevillingTypeKode;

    /**
     * Gets the value of the bevillingForholdGyldigFra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBevillingForholdGyldigFra() {
        return bevillingForholdGyldigFra;
    }

    /**
     * Sets the value of the bevillingForholdGyldigFra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBevillingForholdGyldigFra(XMLGregorianCalendar value) {
        this.bevillingForholdGyldigFra = value;
    }

    /**
     * Gets the value of the virksomhedSENummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVirksomhedSENummer() {
        return virksomhedSENummer;
    }

    /**
     * Sets the value of the virksomhedSENummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVirksomhedSENummer(BigInteger value) {
        this.virksomhedSENummer = value;
    }

    /**
     * Gets the value of the pligtKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPligtKode() {
        return pligtKode;
    }

    /**
     * Sets the value of the pligtKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPligtKode(String value) {
        this.pligtKode = value;
    }

    /**
     * Gets the value of the bevillingTypeKode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBevillingTypeKode() {
        return bevillingTypeKode;
    }

    /**
     * Sets the value of the bevillingTypeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBevillingTypeKode(BigInteger value) {
        this.bevillingTypeKode = value;
    }

}
