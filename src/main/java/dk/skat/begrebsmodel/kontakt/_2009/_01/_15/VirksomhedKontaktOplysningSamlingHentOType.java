
package dk.skat.begrebsmodel.kontakt._2009._01._15;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirksomhedKontaktOplysningSamlingHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirksomhedKontaktOplysningSamlingHent_OType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}Kontekst"/>
 *         &lt;element name="VirksomhedKontaktOplysningListe" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VirksomhedKontaktOplysning" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedKontaktOplysningStruktur"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode" minOccurs="0"/>
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
@XmlType(name = "VirksomhedKontaktOplysningSamlingHent_OType", propOrder = {
    "kontekst",
    "virksomhedKontaktOplysningListe"
})
@XmlSeeAlso({
    VirksomhedKontaktOplysningSamlingHentO.class
})
public class VirksomhedKontaktOplysningSamlingHentOType {

    @XmlElement(name = "Kontekst", required = true)
    protected KontekstType kontekst;
    @XmlElement(name = "VirksomhedKontaktOplysningListe")
    protected VirksomhedKontaktOplysningSamlingHentOType.VirksomhedKontaktOplysningListe virksomhedKontaktOplysningListe;

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
     * Gets the value of the virksomhedKontaktOplysningListe property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedKontaktOplysningSamlingHentOType.VirksomhedKontaktOplysningListe }
     *     
     */
    public VirksomhedKontaktOplysningSamlingHentOType.VirksomhedKontaktOplysningListe getVirksomhedKontaktOplysningListe() {
        return virksomhedKontaktOplysningListe;
    }

    /**
     * Sets the value of the virksomhedKontaktOplysningListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedKontaktOplysningSamlingHentOType.VirksomhedKontaktOplysningListe }
     *     
     */
    public void setVirksomhedKontaktOplysningListe(VirksomhedKontaktOplysningSamlingHentOType.VirksomhedKontaktOplysningListe value) {
        this.virksomhedKontaktOplysningListe = value;
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
     *         &lt;element name="VirksomhedKontaktOplysning" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedKontaktOplysningStruktur"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode" minOccurs="0"/>
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
        "virksomhedKontaktOplysning"
    })
    public static class VirksomhedKontaktOplysningListe {

        @XmlElement(name = "VirksomhedKontaktOplysning", required = true)
        protected List<VirksomhedKontaktOplysningSamlingHentOType.VirksomhedKontaktOplysningListe.VirksomhedKontaktOplysning> virksomhedKontaktOplysning;

        /**
         * Gets the value of the virksomhedKontaktOplysning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the virksomhedKontaktOplysning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVirksomhedKontaktOplysning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VirksomhedKontaktOplysningSamlingHentOType.VirksomhedKontaktOplysningListe.VirksomhedKontaktOplysning }
         * 
         * 
         */
        public List<VirksomhedKontaktOplysningSamlingHentOType.VirksomhedKontaktOplysningListe.VirksomhedKontaktOplysning> getVirksomhedKontaktOplysning() {
            if (virksomhedKontaktOplysning == null) {
                virksomhedKontaktOplysning = new ArrayList<VirksomhedKontaktOplysningSamlingHentOType.VirksomhedKontaktOplysningListe.VirksomhedKontaktOplysning>();
            }
            return this.virksomhedKontaktOplysning;
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
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedKontaktOplysningStruktur"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode" minOccurs="0"/>
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
            "virksomhedKontaktOplysningStruktur",
            "pligtKode"
        })
        public static class VirksomhedKontaktOplysning {

            @XmlElement(name = "VirksomhedKontaktOplysningStruktur", required = true)
            protected VirksomhedKontaktOplysningStrukturType virksomhedKontaktOplysningStruktur;
            @XmlElement(name = "PligtKode")
            protected BigInteger pligtKode;

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

            /**
             * Gets the value of the pligtKode property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPligtKode() {
                return pligtKode;
            }

            /**
             * Sets the value of the pligtKode property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPligtKode(BigInteger value) {
                this.pligtKode = value;
            }

        }

    }

}
