
package dk.skat.begrebsmodel._2008._01._01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VirksomhedStamOplysningSamlingHent_IType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirksomhedStamOplysningSamlingHent_IType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}Kontekst"/>
 *         &lt;element name="VirksomhedStamOplysningSamling">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VirksomhedStamOplysning" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedSENummer"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormForholdStartDato" minOccurs="0"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafForholdStartDato" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirksomhedStamOplysningSamlingHent_IType", propOrder = {
    "kontekst",
    "virksomhedStamOplysningSamling"
})
@XmlSeeAlso({
    VirksomhedStamOplysningSamlingHentI.class
})
public class VirksomhedStamOplysningSamlingHentIType {

    @XmlElement(name = "Kontekst", required = true)
    protected KontekstType kontekst;
    @XmlElement(name = "VirksomhedStamOplysningSamling", required = true)
    protected VirksomhedStamOplysningSamlingHentIType.VirksomhedStamOplysningSamling virksomhedStamOplysningSamling;

    /**
     * Gets the value of the kontekst property.
     * 
     * @return
     *     possible object is
     *     {@link KontekstType }
     *     
     */
    public KontekstType getKontekst() {
        return kontekst;
    }

    /**
     * Sets the value of the kontekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link KontekstType }
     *     
     */
    public void setKontekst(KontekstType value) {
        this.kontekst = value;
    }

    /**
     * Gets the value of the virksomhedStamOplysningSamling property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedStamOplysningSamlingHentIType.VirksomhedStamOplysningSamling }
     *     
     */
    public VirksomhedStamOplysningSamlingHentIType.VirksomhedStamOplysningSamling getVirksomhedStamOplysningSamling() {
        return virksomhedStamOplysningSamling;
    }

    /**
     * Sets the value of the virksomhedStamOplysningSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedStamOplysningSamlingHentIType.VirksomhedStamOplysningSamling }
     *     
     */
    public void setVirksomhedStamOplysningSamling(VirksomhedStamOplysningSamlingHentIType.VirksomhedStamOplysningSamling value) {
        this.virksomhedStamOplysningSamling = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="VirksomhedStamOplysning" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedSENummer"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormForholdStartDato" minOccurs="0"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafForholdStartDato" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "virksomhedStamOplysning"
    })
    public static class VirksomhedStamOplysningSamling {

        @XmlElement(name = "VirksomhedStamOplysning", required = true)
        protected List<VirksomhedStamOplysningSamlingHentIType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning> virksomhedStamOplysning;

        /**
         * Gets the value of the virksomhedStamOplysning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the virksomhedStamOplysning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVirksomhedStamOplysning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VirksomhedStamOplysningSamlingHentIType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning }
         * 
         * 
         */
        public List<VirksomhedStamOplysningSamlingHentIType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning> getVirksomhedStamOplysning() {
            if (virksomhedStamOplysning == null) {
                virksomhedStamOplysning = new ArrayList<VirksomhedStamOplysningSamlingHentIType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning>();
            }
            return this.virksomhedStamOplysning;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedSENummer"/>
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
        @XmlType(name = "", propOrder = {
            "virksomhedSENummer",
            "driftFormForholdStartDato",
            "beskatningParagrafForholdStartDato"
        })
        public static class VirksomhedStamOplysning {

            @XmlElement(name = "VirksomhedSENummer", required = true)
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

    }

}
