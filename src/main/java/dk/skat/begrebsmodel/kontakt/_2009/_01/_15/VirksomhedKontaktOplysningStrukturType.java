
package dk.skat.begrebsmodel.kontakt._2009._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VirksomhedKontaktOplysningStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirksomhedKontaktOplysningStrukturType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedAdresseStruktur"/>
 *         &lt;element name="TelefonListe">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Telefon" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}TelefonNummer"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}TelefonGyldigFra" minOccurs="0"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}TelefonGyldigTil" minOccurs="0"/>
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
 *         &lt;element name="EmailAdresseListe">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EmailAdresse" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EmailAdresseEmail"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EmailAdresseGyldigFra" minOccurs="0"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EmailAdresseGyldigTil" minOccurs="0"/>
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
 *         &lt;element name="FaxListe">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fax" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}FaxNummer"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}FaxGyldigFra" minOccurs="0"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}FaxGyldigTil" minOccurs="0"/>
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
@XmlType(name = "VirksomhedKontaktOplysningStrukturType", propOrder = {
    "virksomhedAdresseStruktur",
    "telefonListe",
    "emailAdresseListe",
    "faxListe"
})
public class VirksomhedKontaktOplysningStrukturType {

    @XmlElement(name = "VirksomhedAdresseStruktur", required = true)
    protected VirksomhedAdresseStrukturType virksomhedAdresseStruktur;
    @XmlElement(name = "TelefonListe", required = true)
    protected VirksomhedKontaktOplysningStrukturType.TelefonListe telefonListe;
    @XmlElement(name = "EmailAdresseListe", required = true)
    protected VirksomhedKontaktOplysningStrukturType.EmailAdresseListe emailAdresseListe;
    @XmlElement(name = "FaxListe", required = true)
    protected VirksomhedKontaktOplysningStrukturType.FaxListe faxListe;

    /**
     * Gets the value of the virksomhedAdresseStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedAdresseStrukturType }
     *     
     */
    public VirksomhedAdresseStrukturType getVirksomhedAdresseStruktur() {
        return virksomhedAdresseStruktur;
    }

    /**
     * Sets the value of the virksomhedAdresseStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedAdresseStrukturType }
     *     
     */
    public void setVirksomhedAdresseStruktur(VirksomhedAdresseStrukturType value) {
        this.virksomhedAdresseStruktur = value;
    }

    /**
     * Gets the value of the telefonListe property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedKontaktOplysningStrukturType.TelefonListe }
     *     
     */
    public VirksomhedKontaktOplysningStrukturType.TelefonListe getTelefonListe() {
        return telefonListe;
    }

    /**
     * Sets the value of the telefonListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedKontaktOplysningStrukturType.TelefonListe }
     *     
     */
    public void setTelefonListe(VirksomhedKontaktOplysningStrukturType.TelefonListe value) {
        this.telefonListe = value;
    }

    /**
     * Gets the value of the emailAdresseListe property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedKontaktOplysningStrukturType.EmailAdresseListe }
     *     
     */
    public VirksomhedKontaktOplysningStrukturType.EmailAdresseListe getEmailAdresseListe() {
        return emailAdresseListe;
    }

    /**
     * Sets the value of the emailAdresseListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedKontaktOplysningStrukturType.EmailAdresseListe }
     *     
     */
    public void setEmailAdresseListe(VirksomhedKontaktOplysningStrukturType.EmailAdresseListe value) {
        this.emailAdresseListe = value;
    }

    /**
     * Gets the value of the faxListe property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedKontaktOplysningStrukturType.FaxListe }
     *     
     */
    public VirksomhedKontaktOplysningStrukturType.FaxListe getFaxListe() {
        return faxListe;
    }

    /**
     * Sets the value of the faxListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedKontaktOplysningStrukturType.FaxListe }
     *     
     */
    public void setFaxListe(VirksomhedKontaktOplysningStrukturType.FaxListe value) {
        this.faxListe = value;
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
     *         &lt;element name="EmailAdresse" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EmailAdresseEmail"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EmailAdresseGyldigFra" minOccurs="0"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EmailAdresseGyldigTil" minOccurs="0"/>
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
        "emailAdresse"
    })
    public static class EmailAdresseListe {

        @XmlElement(name = "EmailAdresse")
        protected List<VirksomhedKontaktOplysningStrukturType.EmailAdresseListe.EmailAdresse> emailAdresse;

        /**
         * Gets the value of the emailAdresse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emailAdresse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmailAdresse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VirksomhedKontaktOplysningStrukturType.EmailAdresseListe.EmailAdresse }
         * 
         * 
         */
        public List<VirksomhedKontaktOplysningStrukturType.EmailAdresseListe.EmailAdresse> getEmailAdresse() {
            if (emailAdresse == null) {
                emailAdresse = new ArrayList<VirksomhedKontaktOplysningStrukturType.EmailAdresseListe.EmailAdresse>();
            }
            return this.emailAdresse;
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
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EmailAdresseEmail"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EmailAdresseGyldigFra" minOccurs="0"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EmailAdresseGyldigTil" minOccurs="0"/>
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
            "emailAdresseEmail",
            "emailAdresseGyldigFra",
            "emailAdresseGyldigTil"
        })
        public static class EmailAdresse {

            @XmlElement(name = "EmailAdresseEmail", required = true)
            protected String emailAdresseEmail;
            @XmlElement(name = "EmailAdresseGyldigFra")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar emailAdresseGyldigFra;
            @XmlElement(name = "EmailAdresseGyldigTil")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar emailAdresseGyldigTil;

            /**
             * Gets the value of the emailAdresseEmail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmailAdresseEmail() {
                return emailAdresseEmail;
            }

            /**
             * Sets the value of the emailAdresseEmail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmailAdresseEmail(String value) {
                this.emailAdresseEmail = value;
            }

            /**
             * Gets the value of the emailAdresseGyldigFra property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEmailAdresseGyldigFra() {
                return emailAdresseGyldigFra;
            }

            /**
             * Sets the value of the emailAdresseGyldigFra property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEmailAdresseGyldigFra(XMLGregorianCalendar value) {
                this.emailAdresseGyldigFra = value;
            }

            /**
             * Gets the value of the emailAdresseGyldigTil property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEmailAdresseGyldigTil() {
                return emailAdresseGyldigTil;
            }

            /**
             * Sets the value of the emailAdresseGyldigTil property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEmailAdresseGyldigTil(XMLGregorianCalendar value) {
                this.emailAdresseGyldigTil = value;
            }

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
     *         &lt;element name="Fax" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}FaxNummer"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}FaxGyldigFra" minOccurs="0"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}FaxGyldigTil" minOccurs="0"/>
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
        "fax"
    })
    public static class FaxListe {

        @XmlElement(name = "Fax")
        protected List<VirksomhedKontaktOplysningStrukturType.FaxListe.Fax> fax;

        /**
         * Gets the value of the fax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VirksomhedKontaktOplysningStrukturType.FaxListe.Fax }
         * 
         * 
         */
        public List<VirksomhedKontaktOplysningStrukturType.FaxListe.Fax> getFax() {
            if (fax == null) {
                fax = new ArrayList<VirksomhedKontaktOplysningStrukturType.FaxListe.Fax>();
            }
            return this.fax;
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
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}FaxNummer"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}FaxGyldigFra" minOccurs="0"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}FaxGyldigTil" minOccurs="0"/>
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
            "faxNummer",
            "faxGyldigFra",
            "faxGyldigTil"
        })
        public static class Fax {

            @XmlElement(name = "FaxNummer", required = true)
            protected String faxNummer;
            @XmlElement(name = "FaxGyldigFra")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar faxGyldigFra;
            @XmlElement(name = "FaxGyldigTil")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar faxGyldigTil;

            /**
             * Gets the value of the faxNummer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFaxNummer() {
                return faxNummer;
            }

            /**
             * Sets the value of the faxNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFaxNummer(String value) {
                this.faxNummer = value;
            }

            /**
             * Gets the value of the faxGyldigFra property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFaxGyldigFra() {
                return faxGyldigFra;
            }

            /**
             * Sets the value of the faxGyldigFra property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFaxGyldigFra(XMLGregorianCalendar value) {
                this.faxGyldigFra = value;
            }

            /**
             * Gets the value of the faxGyldigTil property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFaxGyldigTil() {
                return faxGyldigTil;
            }

            /**
             * Sets the value of the faxGyldigTil property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFaxGyldigTil(XMLGregorianCalendar value) {
                this.faxGyldigTil = value;
            }

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
     *         &lt;element name="Telefon" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}TelefonNummer"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}TelefonGyldigFra" minOccurs="0"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}TelefonGyldigTil" minOccurs="0"/>
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
        "telefon"
    })
    public static class TelefonListe {

        @XmlElement(name = "Telefon")
        protected List<VirksomhedKontaktOplysningStrukturType.TelefonListe.Telefon> telefon;

        /**
         * Gets the value of the telefon property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the telefon property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTelefon().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VirksomhedKontaktOplysningStrukturType.TelefonListe.Telefon }
         * 
         * 
         */
        public List<VirksomhedKontaktOplysningStrukturType.TelefonListe.Telefon> getTelefon() {
            if (telefon == null) {
                telefon = new ArrayList<VirksomhedKontaktOplysningStrukturType.TelefonListe.Telefon>();
            }
            return this.telefon;
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
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}TelefonNummer"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}TelefonGyldigFra" minOccurs="0"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}TelefonGyldigTil" minOccurs="0"/>
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
            "telefonNummer",
            "telefonGyldigFra",
            "telefonGyldigTil"
        })
        public static class Telefon {

            @XmlElement(name = "TelefonNummer", required = true)
            protected String telefonNummer;
            @XmlElement(name = "TelefonGyldigFra")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar telefonGyldigFra;
            @XmlElement(name = "TelefonGyldigTil")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar telefonGyldigTil;

            /**
             * Gets the value of the telefonNummer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelefonNummer() {
                return telefonNummer;
            }

            /**
             * Sets the value of the telefonNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelefonNummer(String value) {
                this.telefonNummer = value;
            }

            /**
             * Gets the value of the telefonGyldigFra property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTelefonGyldigFra() {
                return telefonGyldigFra;
            }

            /**
             * Sets the value of the telefonGyldigFra property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTelefonGyldigFra(XMLGregorianCalendar value) {
                this.telefonGyldigFra = value;
            }

            /**
             * Gets the value of the telefonGyldigTil property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTelefonGyldigTil() {
                return telefonGyldigTil;
            }

            /**
             * Sets the value of the telefonGyldigTil property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTelefonGyldigTil(XMLGregorianCalendar value) {
                this.telefonGyldigTil = value;
            }

        }

    }

}
