
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
 * <p>Java class for VirksomhedStamOplysningSamlingHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirksomhedStamOplysningSamlingHent_OType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}Kontekst"/>
 *         &lt;element name="VirksomhedStamOplysningSamling" minOccurs="0">
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
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedCVRNummer" minOccurs="0"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStartDato"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedOph�rDato" minOccurs="0"/>
 *                             &lt;element name="VirksomhedNavn">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnFirmaNavn"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnFirmaNavnKort"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnGyldigFra"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnGyldigTil" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DriftForm">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormKode"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormForholdStartDato"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormForholdSlutDato" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}Fogedomr�deNummer"/>
 *                             &lt;element name="BeskatningParagraf" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafTypeKode"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafForholdStartDato"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafForholdSlutDato" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BeregnetRegnskabPeriode" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedRegnskabPeriodeStartDato"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedRegnskabPeriodeSlutDato"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="VirksomhedStatus" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStatusTypeKode"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStatusForholdGyldigFra"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStatusForholdGyldigTil" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Myndighed">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}MyndighedNummer"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}MyndighedTilh�rForholdGyldigFra"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}MyndighedTilh�rForholdGyldigTil" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Prim�rAdresse">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedKontaktOplysningStruktur"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
@XmlType(name = "VirksomhedStamOplysningSamlingHent_OType", propOrder = {
    "kontekst",
    "virksomhedStamOplysningSamling"
})
@XmlSeeAlso({
    VirksomhedStamOplysningSamlingHentO.class
})
public class VirksomhedStamOplysningSamlingHentOType {

    @XmlElement(name = "Kontekst", required = true)
    protected KontekstType kontekst;
    @XmlElement(name = "VirksomhedStamOplysningSamling")
    protected VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling virksomhedStamOplysningSamling;

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
     *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling }
     *     
     */
    public VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling getVirksomhedStamOplysningSamling() {
        return virksomhedStamOplysningSamling;
    }

    /**
     * Sets the value of the virksomhedStamOplysningSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling }
     *     
     */
    public void setVirksomhedStamOplysningSamling(VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling value) {
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
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedCVRNummer" minOccurs="0"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStartDato"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedOph�rDato" minOccurs="0"/>
     *                   &lt;element name="VirksomhedNavn">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnFirmaNavn"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnFirmaNavnKort"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnGyldigFra"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnGyldigTil" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DriftForm">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormKode"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormForholdStartDato"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormForholdSlutDato" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}Fogedomr�deNummer"/>
     *                   &lt;element name="BeskatningParagraf" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafTypeKode"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafForholdStartDato"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafForholdSlutDato" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BeregnetRegnskabPeriode" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedRegnskabPeriodeStartDato"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedRegnskabPeriodeSlutDato"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="VirksomhedStatus" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStatusTypeKode"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStatusForholdGyldigFra"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStatusForholdGyldigTil" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Myndighed">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}MyndighedNummer"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}MyndighedTilh�rForholdGyldigFra"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}MyndighedTilh�rForholdGyldigTil" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PrimærAdresse">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedKontaktOplysningStruktur"/>
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
    @XmlType(name = "VirksomhedStamOplysningSamling", propOrder = {
        "virksomhedStamOplysning"
    })
    public static class VirksomhedStamOplysningSamling {

        @XmlElement(name = "VirksomhedStamOplysning", required = true)
        protected List<VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning> virksomhedStamOplysning;

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
         * {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning }
         * 
         * 
         */
        public List<VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning> getVirksomhedStamOplysning() {
            if (virksomhedStamOplysning == null) {
                virksomhedStamOplysning = new ArrayList<VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning>();
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
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedCVRNummer" minOccurs="0"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStartDato"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedOph�rDato" minOccurs="0"/>
         *         &lt;element name="VirksomhedNavn">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnFirmaNavn"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnFirmaNavnKort"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnGyldigFra"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnGyldigTil" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DriftForm">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormKode"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormForholdStartDato"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormForholdSlutDato" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}Fogedomr�deNummer"/>
         *         &lt;element name="BeskatningParagraf" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafTypeKode"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafForholdStartDato"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafForholdSlutDato" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BeregnetRegnskabPeriode" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedRegnskabPeriodeStartDato"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedRegnskabPeriodeSlutDato"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="VirksomhedStatus" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStatusTypeKode"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStatusForholdGyldigFra"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStatusForholdGyldigTil" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Myndighed">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}MyndighedNummer"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}MyndighedTilh�rForholdGyldigFra"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}MyndighedTilh�rForholdGyldigTil" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Prim�rAdresse">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedKontaktOplysningStruktur"/>
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
            "virksomhedSENummer",
            "virksomhedCVRNummer",
            "virksomhedStartDato",
            "virksomhedOphørDato",
            "virksomhedNavn",
            "driftForm",
            "fogedområdeNummer",
            "beskatningParagraf",
            "beregnetRegnskabPeriode",
            "virksomhedStatus",
            "myndighed",
            "primærAdresse"
        })
        public static class VirksomhedStamOplysning {

            @XmlElement(name = "VirksomhedSENummer", required = true)
            protected BigInteger virksomhedSENummer;
            @XmlElement(name = "VirksomhedCVRNummer")
            protected String virksomhedCVRNummer;
            @XmlElement(name = "VirksomhedStartDato", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar virksomhedStartDato;
            @XmlElement(name = "VirksomhedOphørDato")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar virksomhedOphørDato;
            @XmlElement(name = "VirksomhedNavn", required = true)
            protected VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.VirksomhedNavn virksomhedNavn;
            @XmlElement(name = "DriftForm", required = true)
            protected VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.DriftForm driftForm;
            @XmlElement(name = "FogedområdeNummer", required = true)
            protected String fogedområdeNummer;
            @XmlElement(name = "BeskatningParagraf")
            protected VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.BeskatningParagraf beskatningParagraf;
            @XmlElement(name = "BeregnetRegnskabPeriode")
            protected VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.BeregnetRegnskabPeriode beregnetRegnskabPeriode;
            @XmlElement(name = "VirksomhedStatus")
            protected VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.VirksomhedStatus virksomhedStatus;
            @XmlElement(name = "Myndighed", required = true)
            protected VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.Myndighed myndighed;
            @XmlElement(name = "PrimærAdresse", required = true)
            protected VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.PrimærAdresse primærAdresse;

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
             * Gets the value of the virksomhedCVRNummer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVirksomhedCVRNummer() {
                return virksomhedCVRNummer;
            }

            /**
             * Sets the value of the virksomhedCVRNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVirksomhedCVRNummer(String value) {
                this.virksomhedCVRNummer = value;
            }

            /**
             * Gets the value of the virksomhedStartDato property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getVirksomhedStartDato() {
                return virksomhedStartDato;
            }

            /**
             * Sets the value of the virksomhedStartDato property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setVirksomhedStartDato(XMLGregorianCalendar value) {
                this.virksomhedStartDato = value;
            }

            /**
             * Gets the value of the virksomhedOphørDato property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getVirksomhedOphørDato() {
                return virksomhedOphørDato;
            }

            /**
             * Sets the value of the virksomhedOph�rDato property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setVirksomhedOphørDato(XMLGregorianCalendar value) {
                this.virksomhedOphørDato = value;
            }

            /**
             * Gets the value of the virksomhedNavn property.
             * 
             * @return
             *     possible object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.VirksomhedNavn }
             *     
             */
            public VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.VirksomhedNavn getVirksomhedNavn() {
                return virksomhedNavn;
            }

            /**
             * Sets the value of the virksomhedNavn property.
             * 
             * @param value
             *     allowed object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.VirksomhedNavn }
             *     
             */
            public void setVirksomhedNavn(VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.VirksomhedNavn value) {
                this.virksomhedNavn = value;
            }

            /**
             * Gets the value of the driftForm property.
             * 
             * @return
             *     possible object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.DriftForm }
             *     
             */
            public VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.DriftForm getDriftForm() {
                return driftForm;
            }

            /**
             * Sets the value of the driftForm property.
             * 
             * @param value
             *     allowed object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.DriftForm }
             *     
             */
            public void setDriftForm(VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.DriftForm value) {
                this.driftForm = value;
            }

            /**
             * Gets the value of the fogedområdeNummer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFogedområdeNummer() {
                return fogedområdeNummer;
            }

            /**
             * Sets the value of the fogedområdeNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFogedområdeNummer(String value) {
                this.fogedområdeNummer = value;
            }

            /**
             * Gets the value of the beskatningParagraf property.
             * 
             * @return
             *     possible object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.BeskatningParagraf }
             *     
             */
            public VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.BeskatningParagraf getBeskatningParagraf() {
                return beskatningParagraf;
            }

            /**
             * Sets the value of the beskatningParagraf property.
             * 
             * @param value
             *     allowed object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.BeskatningParagraf }
             *     
             */
            public void setBeskatningParagraf(VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.BeskatningParagraf value) {
                this.beskatningParagraf = value;
            }

            /**
             * Gets the value of the beregnetRegnskabPeriode property.
             * 
             * @return
             *     possible object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.BeregnetRegnskabPeriode }
             *     
             */
            public VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.BeregnetRegnskabPeriode getBeregnetRegnskabPeriode() {
                return beregnetRegnskabPeriode;
            }

            /**
             * Sets the value of the beregnetRegnskabPeriode property.
             * 
             * @param value
             *     allowed object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.BeregnetRegnskabPeriode }
             *     
             */
            public void setBeregnetRegnskabPeriode(VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.BeregnetRegnskabPeriode value) {
                this.beregnetRegnskabPeriode = value;
            }

            /**
             * Gets the value of the virksomhedStatus property.
             * 
             * @return
             *     possible object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.VirksomhedStatus }
             *     
             */
            public VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.VirksomhedStatus getVirksomhedStatus() {
                return virksomhedStatus;
            }

            /**
             * Sets the value of the virksomhedStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.VirksomhedStatus }
             *     
             */
            public void setVirksomhedStatus(VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.VirksomhedStatus value) {
                this.virksomhedStatus = value;
            }

            /**
             * Gets the value of the myndighed property.
             * 
             * @return
             *     possible object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.Myndighed }
             *     
             */
            public VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.Myndighed getMyndighed() {
                return myndighed;
            }

            /**
             * Sets the value of the myndighed property.
             * 
             * @param value
             *     allowed object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.Myndighed }
             *     
             */
            public void setMyndighed(VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.Myndighed value) {
                this.myndighed = value;
            }

            /**
             * Gets the value of the primærAdresse property.
             * 
             * @return
             *     possible object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.PrimærAdresse }
             *     
             */
            public VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.PrimærAdresse getPrimærAdresse() {
                return primærAdresse;
            }

            /**
             * Sets the value of the primærAdresse property.
             * 
             * @param value
             *     allowed object is
             *     {@link VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.PrimærAdresse }
             *     
             */
            public void setPrimørAdresse(VirksomhedStamOplysningSamlingHentOType.VirksomhedStamOplysningSamling.VirksomhedStamOplysning.PrimærAdresse value) {
                this.primærAdresse = value;
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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedRegnskabPeriodeStartDato"/>
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedRegnskabPeriodeSlutDato"/>
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
                "virksomhedRegnskabPeriodeStartDato",
                "virksomhedRegnskabPeriodeSlutDato"
            })
            public static class BeregnetRegnskabPeriode {

                @XmlElement(name = "VirksomhedRegnskabPeriodeStartDato", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar virksomhedRegnskabPeriodeStartDato;
                @XmlElement(name = "VirksomhedRegnskabPeriodeSlutDato", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar virksomhedRegnskabPeriodeSlutDato;

                /**
                 * Gets the value of the virksomhedRegnskabPeriodeStartDato property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getVirksomhedRegnskabPeriodeStartDato() {
                    return virksomhedRegnskabPeriodeStartDato;
                }

                /**
                 * Sets the value of the virksomhedRegnskabPeriodeStartDato property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setVirksomhedRegnskabPeriodeStartDato(XMLGregorianCalendar value) {
                    this.virksomhedRegnskabPeriodeStartDato = value;
                }

                /**
                 * Gets the value of the virksomhedRegnskabPeriodeSlutDato property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getVirksomhedRegnskabPeriodeSlutDato() {
                    return virksomhedRegnskabPeriodeSlutDato;
                }

                /**
                 * Sets the value of the virksomhedRegnskabPeriodeSlutDato property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setVirksomhedRegnskabPeriodeSlutDato(XMLGregorianCalendar value) {
                    this.virksomhedRegnskabPeriodeSlutDato = value;
                }

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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafTypeKode"/>
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafForholdStartDato"/>
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}BeskatningParagrafForholdSlutDato" minOccurs="0"/>
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
                "beskatningParagrafTypeKode",
                "beskatningParagrafForholdStartDato",
                "beskatningParagrafForholdSlutDato"
            })
            public static class BeskatningParagraf {

                @XmlElement(name = "BeskatningParagrafTypeKode", required = true)
                protected BigInteger beskatningParagrafTypeKode;
                @XmlElement(name = "BeskatningParagrafForholdStartDato", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar beskatningParagrafForholdStartDato;
                @XmlElement(name = "BeskatningParagrafForholdSlutDato")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar beskatningParagrafForholdSlutDato;

                /**
                 * Gets the value of the beskatningParagrafTypeKode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getBeskatningParagrafTypeKode() {
                    return beskatningParagrafTypeKode;
                }

                /**
                 * Sets the value of the beskatningParagrafTypeKode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setBeskatningParagrafTypeKode(BigInteger value) {
                    this.beskatningParagrafTypeKode = value;
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

                /**
                 * Gets the value of the beskatningParagrafForholdSlutDato property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getBeskatningParagrafForholdSlutDato() {
                    return beskatningParagrafForholdSlutDato;
                }

                /**
                 * Sets the value of the beskatningParagrafForholdSlutDato property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setBeskatningParagrafForholdSlutDato(XMLGregorianCalendar value) {
                    this.beskatningParagrafForholdSlutDato = value;
                }

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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormKode"/>
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormForholdStartDato"/>
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}DriftFormForholdSlutDato" minOccurs="0"/>
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
                "driftFormKode",
                "driftFormForholdStartDato",
                "driftFormForholdSlutDato"
            })
            public static class DriftForm {

                @XmlElement(name = "DriftFormKode", required = true)
                protected String driftFormKode;
                @XmlElement(name = "DriftFormForholdStartDato", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar driftFormForholdStartDato;
                @XmlElement(name = "DriftFormForholdSlutDato")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar driftFormForholdSlutDato;

                /**
                 * Gets the value of the driftFormKode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDriftFormKode() {
                    return driftFormKode;
                }

                /**
                 * Sets the value of the driftFormKode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDriftFormKode(String value) {
                    this.driftFormKode = value;
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
                 * Gets the value of the driftFormForholdSlutDato property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDriftFormForholdSlutDato() {
                    return driftFormForholdSlutDato;
                }

                /**
                 * Sets the value of the driftFormForholdSlutDato property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDriftFormForholdSlutDato(XMLGregorianCalendar value) {
                    this.driftFormForholdSlutDato = value;
                }

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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}MyndighedNummer"/>
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}MyndighedTilh�rForholdGyldigFra"/>
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}MyndighedTilh�rForholdGyldigTil" minOccurs="0"/>
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
                "myndighedNummer",
                "myndighedTilhørForholdGyldigFra",
                "myndighedTilhørForholdGyldigTil"
            })
            public static class Myndighed {

                @XmlElement(name = "MyndighedNummer", required = true)
                protected BigInteger myndighedNummer;
                @XmlElement(name = "MyndighedTilhørForholdGyldigFra", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar myndighedTilhørForholdGyldigFra;
                @XmlElement(name = "MyndighedTilhørForholdGyldigTil")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar myndighedTilhørForholdGyldigTil;

                /**
                 * Gets the value of the myndighedNummer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMyndighedNummer() {
                    return myndighedNummer;
                }

                /**
                 * Sets the value of the myndighedNummer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMyndighedNummer(BigInteger value) {
                    this.myndighedNummer = value;
                }

                /**
                 * Gets the value of the myndighedTilhørForholdGyldigFra property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getMyndighedTilhørForholdGyldigFra() {
                    return myndighedTilhørForholdGyldigFra;
                }

                /**
                 * Sets the value of the myndighedTilh�rForholdGyldigFra property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setMyndighedTilhørForholdGyldigFra(XMLGregorianCalendar value) {
                    this.myndighedTilhørForholdGyldigFra = value;
                }

                /**
                 * Gets the value of the myndighedTilhørForholdGyldigTil property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getMyndighedTilhørForholdGyldigTil() {
                    return myndighedTilhørForholdGyldigTil;
                }

                /**
                 * Sets the value of the myndighedTilh�rForholdGyldigTil property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setMyndighedTilhørForholdGyldigTil(XMLGregorianCalendar value) {
                    this.myndighedTilhørForholdGyldigTil = value;
                }

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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedKontaktOplysningStruktur"/>
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
                "virksomhedKontaktOplysningStruktur"
            })
            public static class PrimærAdresse {

                @XmlElement(name = "VirksomhedKontaktOplysningStruktur", required = true)
                protected VirksomhedKontaktOplysningStrukturType virksomhedKontaktOplysningStruktur;

                /**
                 * Gets the value of the virksomhedKontaktOplysningStruktur property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link VirksomhedKontaktOplysningStrukturType }
                 *     
                 */
                public VirksomhedKontaktOplysningStrukturType getVirksomhedKontaktOplysningStruktur() {
                    return virksomhedKontaktOplysningStruktur;
                }

                /**
                 * Sets the value of the virksomhedKontaktOplysningStruktur property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link VirksomhedKontaktOplysningStrukturType }
                 *     
                 */
                public void setVirksomhedKontaktOplysningStruktur(VirksomhedKontaktOplysningStrukturType value) {
                    this.virksomhedKontaktOplysningStruktur = value;
                }

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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnFirmaNavn"/>
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnFirmaNavnKort"/>
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnGyldigFra"/>
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedNavnGyldigTil" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "VirksomhedNavn", propOrder = {
                "virksomhedNavnFirmaNavn",
                "virksomhedNavnFirmaNavnKort",
                "virksomhedNavnGyldigFra",
                "virksomhedNavnGyldigTil"
            })
            public static class VirksomhedNavn {

                @XmlElement(name = "VirksomhedNavnFirmaNavn", required = true)
                protected String virksomhedNavnFirmaNavn;
                @XmlElement(name = "VirksomhedNavnFirmaNavnKort", required = true)
                protected String virksomhedNavnFirmaNavnKort;
                @XmlElement(name = "VirksomhedNavnGyldigFra", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar virksomhedNavnGyldigFra;
                @XmlElement(name = "VirksomhedNavnGyldigTil")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar virksomhedNavnGyldigTil;

                /**
                 * Gets the value of the virksomhedNavnFirmaNavn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVirksomhedNavnFirmaNavn() {
                    return virksomhedNavnFirmaNavn;
                }

                /**
                 * Sets the value of the virksomhedNavnFirmaNavn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVirksomhedNavnFirmaNavn(String value) {
                    this.virksomhedNavnFirmaNavn = value;
                }

                /**
                 * Gets the value of the virksomhedNavnFirmaNavnKort property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVirksomhedNavnFirmaNavnKort() {
                    return virksomhedNavnFirmaNavnKort;
                }

                /**
                 * Sets the value of the virksomhedNavnFirmaNavnKort property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVirksomhedNavnFirmaNavnKort(String value) {
                    this.virksomhedNavnFirmaNavnKort = value;
                }

                /**
                 * Gets the value of the virksomhedNavnGyldigFra property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getVirksomhedNavnGyldigFra() {
                    return virksomhedNavnGyldigFra;
                }

                /**
                 * Sets the value of the virksomhedNavnGyldigFra property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setVirksomhedNavnGyldigFra(XMLGregorianCalendar value) {
                    this.virksomhedNavnGyldigFra = value;
                }

                /**
                 * Gets the value of the virksomhedNavnGyldigTil property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getVirksomhedNavnGyldigTil() {
                    return virksomhedNavnGyldigTil;
                }

                /**
                 * Sets the value of the virksomhedNavnGyldigTil property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setVirksomhedNavnGyldigTil(XMLGregorianCalendar value) {
                    this.virksomhedNavnGyldigTil = value;
                }

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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStatusTypeKode"/>
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStatusForholdGyldigFra"/>
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStatusForholdGyldigTil" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "VirksomhedStatus", propOrder = {
                "virksomhedStatusTypeKode",
                "virksomhedStatusForholdGyldigFra",
                "virksomhedStatusForholdGyldigTil"
            })
            public static class VirksomhedStatus {

                @XmlElement(name = "VirksomhedStatusTypeKode", required = true)
                protected BigInteger virksomhedStatusTypeKode;
                @XmlElement(name = "VirksomhedStatusForholdGyldigFra", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar virksomhedStatusForholdGyldigFra;
                @XmlElement(name = "VirksomhedStatusForholdGyldigTil")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar virksomhedStatusForholdGyldigTil;

                /**
                 * Gets the value of the virksomhedStatusTypeKode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getVirksomhedStatusTypeKode() {
                    return virksomhedStatusTypeKode;
                }

                /**
                 * Sets the value of the virksomhedStatusTypeKode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setVirksomhedStatusTypeKode(BigInteger value) {
                    this.virksomhedStatusTypeKode = value;
                }

                /**
                 * Gets the value of the virksomhedStatusForholdGyldigFra property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getVirksomhedStatusForholdGyldigFra() {
                    return virksomhedStatusForholdGyldigFra;
                }

                /**
                 * Sets the value of the virksomhedStatusForholdGyldigFra property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setVirksomhedStatusForholdGyldigFra(XMLGregorianCalendar value) {
                    this.virksomhedStatusForholdGyldigFra = value;
                }

                /**
                 * Gets the value of the virksomhedStatusForholdGyldigTil property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getVirksomhedStatusForholdGyldigTil() {
                    return virksomhedStatusForholdGyldigTil;
                }

                /**
                 * Sets the value of the virksomhedStatusForholdGyldigTil property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setVirksomhedStatusForholdGyldigTil(XMLGregorianCalendar value) {
                    this.virksomhedStatusForholdGyldigTil = value;
                }

            }

        }

    }

}
