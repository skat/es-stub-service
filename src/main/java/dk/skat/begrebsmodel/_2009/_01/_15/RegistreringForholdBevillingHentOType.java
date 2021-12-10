
package dk.skat.begrebsmodel._2009._01._15;

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
 * <p>Java class for RegistreringForholdBevillingHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistreringForholdBevillingHent_OType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}Kontekst"/>
 *         &lt;element name="VirksomhedListe" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Virksomhed" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer"/>
 *                             &lt;element name="BevillingForholdListe">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BevillingForhold" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode"/>
 *                                                 &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdKode"/>
 *                                                 &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}RegistreringForholdStartDato"/>
 *                                                 &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ForretningOmr�deForholdKode" minOccurs="0"/>
 *                                                 &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ForretningOmr�deForholdGyldigFra" minOccurs="0"/>
 *                                                 &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdVirksomhedTypeKode" minOccurs="0"/>
 *                                                 &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdKode" minOccurs="0"/>
 *                                                 &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdGyldigFra" minOccurs="0"/>
 *                                                 &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdJournalNummer" minOccurs="0"/>
 *                                                 &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdGyldigFra" minOccurs="0"/>
 *                                                 &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdGyldigTil" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
@XmlType(name = "RegistreringForholdBevillingHent_OType", propOrder = {
    "kontekst",
    "virksomhedListe"
})
@XmlSeeAlso({
    RegistreringForholdBevillingHentO.class
})
public class RegistreringForholdBevillingHentOType {

    @XmlElement(name = "Kontekst", required = true)
    protected KontekstType kontekst;
    @XmlElement(name = "VirksomhedListe")
    protected RegistreringForholdBevillingHentOType.VirksomhedListe virksomhedListe;

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
     * Gets the value of the virksomhedListe property.
     * 
     * @return
     *     possible object is
     *     {@link RegistreringForholdBevillingHentOType.VirksomhedListe }
     *     
     */
    public RegistreringForholdBevillingHentOType.VirksomhedListe getVirksomhedListe() {
        return virksomhedListe;
    }

    /**
     * Sets the value of the virksomhedListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistreringForholdBevillingHentOType.VirksomhedListe }
     *     
     */
    public void setVirksomhedListe(RegistreringForholdBevillingHentOType.VirksomhedListe value) {
        this.virksomhedListe = value;
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
     *         &lt;element name="Virksomhed" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer"/>
     *                   &lt;element name="BevillingForholdListe">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BevillingForhold" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode"/>
     *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdKode"/>
     *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}RegistreringForholdStartDato"/>
     *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ForretningOmr�deForholdKode" minOccurs="0"/>
     *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ForretningOmr�deForholdGyldigFra" minOccurs="0"/>
     *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdVirksomhedTypeKode" minOccurs="0"/>
     *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdKode" minOccurs="0"/>
     *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdGyldigFra" minOccurs="0"/>
     *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdJournalNummer" minOccurs="0"/>
     *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdGyldigFra" minOccurs="0"/>
     *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdGyldigTil" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "virksomhed"
    })
    public static class VirksomhedListe {

        @XmlElement(name = "Virksomhed")
        protected List<RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed> virksomhed;

        /**
         * Gets the value of the virksomhed property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the virksomhed property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVirksomhed().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed }
         * 
         * 
         */
        public List<RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed> getVirksomhed() {
            if (virksomhed == null) {
                virksomhed = new ArrayList<RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed>();
            }
            return this.virksomhed;
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
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer"/>
         *         &lt;element name="BevillingForholdListe">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BevillingForhold" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode"/>
         *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdKode"/>
         *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}RegistreringForholdStartDato"/>
         *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ForretningOmr�deForholdKode" minOccurs="0"/>
         *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ForretningOmr�deForholdGyldigFra" minOccurs="0"/>
         *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdVirksomhedTypeKode" minOccurs="0"/>
         *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdKode" minOccurs="0"/>
         *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdGyldigFra" minOccurs="0"/>
         *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdJournalNummer" minOccurs="0"/>
         *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdGyldigFra" minOccurs="0"/>
         *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdGyldigTil" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "virksomhedSENummer",
            "bevillingForholdListe"
        })
        public static class Virksomhed {

            @XmlElement(name = "VirksomhedSENummer", required = true)
            protected BigInteger virksomhedSENummer;
            @XmlElement(name = "BevillingForholdListe", required = true)
            protected RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe bevillingForholdListe;

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
             * Gets the value of the bevillingForholdListe property.
             * 
             * @return
             *     possible object is
             *     {@link RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe }
             *     
             */
            public RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe getBevillingForholdListe() {
                return bevillingForholdListe;
            }

            /**
             * Sets the value of the bevillingForholdListe property.
             * 
             * @param value
             *     allowed object is
             *     {@link RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe }
             *     
             */
            public void setBevillingForholdListe(RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe value) {
                this.bevillingForholdListe = value;
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
             *         &lt;element name="BevillingForhold" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode"/>
             *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdKode"/>
             *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}RegistreringForholdStartDato"/>
             *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ForretningOmrådeForholdKode" minOccurs="0"/>
             *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ForretningOmrådeForholdGyldigFra" minOccurs="0"/>
             *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdVirksomhedTypeKode" minOccurs="0"/>
             *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdKode" minOccurs="0"/>
             *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdGyldigFra" minOccurs="0"/>
             *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdJournalNummer" minOccurs="0"/>
             *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdGyldigFra" minOccurs="0"/>
             *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdGyldigTil" minOccurs="0"/>
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
                "bevillingForhold"
            })
            public static class BevillingForholdListe {

                @XmlElement(name = "BevillingForhold")
                protected List<RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe.BevillingForhold> bevillingForhold;

                /**
                 * Gets the value of the bevillingForhold property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the bevillingForhold property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBevillingForhold().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe.BevillingForhold }
                 * 
                 * 
                 */
                public List<RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe.BevillingForhold> getBevillingForhold() {
                    if (bevillingForhold == null) {
                        bevillingForhold = new ArrayList<RegistreringForholdBevillingHentOType.VirksomhedListe.Virksomhed.BevillingForholdListe.BevillingForhold>();
                    }
                    return this.bevillingForhold;
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
                 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode"/>
                 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdKode"/>
                 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}RegistreringForholdStartDato"/>
                 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ForretningOmrådeForholdKode" minOccurs="0"/>
                 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ForretningOmrådeForholdGyldigFra" minOccurs="0"/>
                 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdVirksomhedTypeKode" minOccurs="0"/>
                 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdKode" minOccurs="0"/>
                 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}OplysningForholdGyldigFra" minOccurs="0"/>
                 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdJournalNummer" minOccurs="0"/>
                 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdGyldigFra" minOccurs="0"/>
                 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdGyldigTil" minOccurs="0"/>
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
                    "pligtKode",
                    "bevillingForholdKode",
                    "registreringForholdStartDato",
                    "forretningOmrådeForholdKode",
                    "forretningOmrådeForholdGyldigFra",
                    "oplysningForholdVirksomhedTypeKode",
                    "oplysningForholdKode",
                    "oplysningForholdGyldigFra",
                    "bevillingForholdJournalNummer",
                    "bevillingForholdGyldigFra",
                    "bevillingForholdGyldigTil"
                })
                public static class BevillingForhold {

                    @XmlElement(name = "PligtKode", required = true)
                    protected String pligtKode;
                    @XmlElement(name = "BevillingForholdKode", required = true)
                    protected BigInteger bevillingForholdKode;
                    @XmlElement(name = "RegistreringForholdStartDato", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar registreringForholdStartDato;
                    @XmlElement(name = "ForretningOmrådeForholdKode")
                    protected BigInteger forretningOmrådeForholdKode;
                    @XmlElement(name = "ForretningOmrådeForholdGyldigFra")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar forretningOmrådeForholdGyldigFra;
                    @XmlElement(name = "OplysningForholdVirksomhedTypeKode")
                    protected BigInteger oplysningForholdVirksomhedTypeKode;
                    @XmlElement(name = "OplysningForholdKode")
                    protected BigInteger oplysningForholdKode;
                    @XmlElement(name = "OplysningForholdGyldigFra")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar oplysningForholdGyldigFra;
                    @XmlElement(name = "BevillingForholdJournalNummer")
                    protected String bevillingForholdJournalNummer;
                    @XmlElement(name = "BevillingForholdGyldigFra")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar bevillingForholdGyldigFra;
                    @XmlElement(name = "BevillingForholdGyldigTil")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar bevillingForholdGyldigTil;

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
                     * Gets the value of the bevillingForholdKode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getBevillingForholdKode() {
                        return bevillingForholdKode;
                    }

                    /**
                     * Sets the value of the bevillingForholdKode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setBevillingForholdKode(BigInteger value) {
                        this.bevillingForholdKode = value;
                    }

                    /**
                     * Gets the value of the registreringForholdStartDato property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getRegistreringForholdStartDato() {
                        return registreringForholdStartDato;
                    }

                    /**
                     * Sets the value of the registreringForholdStartDato property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setRegistreringForholdStartDato(XMLGregorianCalendar value) {
                        this.registreringForholdStartDato = value;
                    }

                    /**
                     * Gets the value of the forretningOmrådeForholdKode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getForretningOmrådeForholdKode() {
                        return forretningOmrådeForholdKode;
                    }

                    /**
                     * Sets the value of the forretningOmrådeForholdKode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setForretningOmrådeForholdKode(BigInteger value) {
                        this.forretningOmrådeForholdKode = value;
                    }

                    /**
                     * Gets the value of the forretningOmrådeForholdGyldigFra property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getForretningOmrådeForholdGyldigFra() {
                        return forretningOmrådeForholdGyldigFra;
                    }

                    /**
                     * Sets the value of the forretningOmr�deForholdGyldigFra property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setForretningOmrådeForholdGyldigFra(XMLGregorianCalendar value) {
                        this.forretningOmrådeForholdGyldigFra = value;
                    }

                    /**
                     * Gets the value of the oplysningForholdVirksomhedTypeKode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getOplysningForholdVirksomhedTypeKode() {
                        return oplysningForholdVirksomhedTypeKode;
                    }

                    /**
                     * Sets the value of the oplysningForholdVirksomhedTypeKode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setOplysningForholdVirksomhedTypeKode(BigInteger value) {
                        this.oplysningForholdVirksomhedTypeKode = value;
                    }

                    /**
                     * Gets the value of the oplysningForholdKode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getOplysningForholdKode() {
                        return oplysningForholdKode;
                    }

                    /**
                     * Sets the value of the oplysningForholdKode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setOplysningForholdKode(BigInteger value) {
                        this.oplysningForholdKode = value;
                    }

                    /**
                     * Gets the value of the oplysningForholdGyldigFra property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getOplysningForholdGyldigFra() {
                        return oplysningForholdGyldigFra;
                    }

                    /**
                     * Sets the value of the oplysningForholdGyldigFra property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setOplysningForholdGyldigFra(XMLGregorianCalendar value) {
                        this.oplysningForholdGyldigFra = value;
                    }

                    /**
                     * Gets the value of the bevillingForholdJournalNummer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBevillingForholdJournalNummer() {
                        return bevillingForholdJournalNummer;
                    }

                    /**
                     * Sets the value of the bevillingForholdJournalNummer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBevillingForholdJournalNummer(String value) {
                        this.bevillingForholdJournalNummer = value;
                    }

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
                     * Gets the value of the bevillingForholdGyldigTil property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getBevillingForholdGyldigTil() {
                        return bevillingForholdGyldigTil;
                    }

                    /**
                     * Sets the value of the bevillingForholdGyldigTil property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setBevillingForholdGyldigTil(XMLGregorianCalendar value) {
                        this.bevillingForholdGyldigTil = value;
                    }

                }

            }

        }

    }

}
