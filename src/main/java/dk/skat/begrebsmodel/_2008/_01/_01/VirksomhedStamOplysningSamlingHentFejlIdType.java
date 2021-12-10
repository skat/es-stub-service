
package dk.skat.begrebsmodel._2008._01._01;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VirksomhedStamOplysningSamlingHent_FejlIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirksomhedStamOplysningSamlingHent_FejlIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedSENummer" minOccurs="0"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormForholdStartDato" minOccurs="0"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafForholdStartDato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirksomhedStamOplysningSamlingHent_FejlIdType", propOrder = {
    "virksomhedSENummer",
    "driftFormForholdStartDato",
    "beskatningParagrafForholdStartDato"
})
public class VirksomhedStamOplysningSamlingHentFejlIdType {

    @XmlElement(name = "VirksomhedSENummer")
    protected BigInteger virksomhedSENummer;
    @XmlElement(name = "DriftFormForholdStartDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar driftFormForholdStartDato;
    @XmlElement(name = "BeskatningParagrafForholdStartDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beskatningParagrafForholdStartDato;

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
     * Gets the value of the driftFormForholdStartDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDriftFormForholdStartDato() {
        return driftFormForholdStartDato;
    }

    /**
     * Sets the value of the driftFormForholdStartDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDriftFormForholdStartDato(XMLGregorianCalendar value) {
        this.driftFormForholdStartDato = value;
    }

    /**
     * Gets the value of the beskatningParagrafForholdStartDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeskatningParagrafForholdStartDato() {
        return beskatningParagrafForholdStartDato;
    }

    /**
     * Sets the value of the beskatningParagrafForholdStartDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeskatningParagrafForholdStartDato(XMLGregorianCalendar value) {
        this.beskatningParagrafForholdStartDato = value;
    }

}
