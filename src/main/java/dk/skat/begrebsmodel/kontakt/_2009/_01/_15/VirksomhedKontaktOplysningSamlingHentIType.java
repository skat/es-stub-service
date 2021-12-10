
package dk.skat.begrebsmodel.kontakt._2009._01._15;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirksomhedKontaktOplysningSamlingHent_IType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirksomhedKontaktOplysningSamlingHent_IType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}Kontekst"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedAdresseL�beNummer" minOccurs="0"/>
 *         &lt;element name="AdresseFiltrering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedAdresseTypeKode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PligtKodeFiltrering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BevillingKodeFiltrering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingTypeKode"/>
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
@XmlType(name = "VirksomhedKontaktOplysningSamlingHent_IType", propOrder = {
    "kontekst",
    "virksomhedSENummer",
    "virksomhedAdresseL\u00f8beNummer",
    "adresseFiltrering",
    "pligtKodeFiltrering",
    "bevillingKodeFiltrering"
})
@XmlSeeAlso({
    VirksomhedKontaktOplysningSamlingHentI.class
})
public class VirksomhedKontaktOplysningSamlingHentIType {

    @XmlElement(name = "Kontekst", required = true)
    protected KontekstType kontekst;
    @XmlElement(name = "VirksomhedSENummer", required = true)
    protected BigInteger virksomhedSENummer;
    @XmlElement(name = "VirksomhedAdresseLøbeNummer")
    @XmlSchemaType(name = "integer")
    protected Long virksomhedAdresseLøbeNummer;
    @XmlElement(name = "AdresseFiltrering")
    protected VirksomhedKontaktOplysningSamlingHentIType.AdresseFiltrering adresseFiltrering;
    @XmlElement(name = "PligtKodeFiltrering")
    protected VirksomhedKontaktOplysningSamlingHentIType.PligtKodeFiltrering pligtKodeFiltrering;
    @XmlElement(name = "BevillingKodeFiltrering")
    protected VirksomhedKontaktOplysningSamlingHentIType.BevillingKodeFiltrering bevillingKodeFiltrering;

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
     * Gets the value of the virksomhedAdresseL�beNummer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVirksomhedAdresseLøbeNummer() {
        return virksomhedAdresseLøbeNummer;
    }

    /**
     * Sets the value of the virksomhedAdresseL�beNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVirksomhedAdresseLøbeNummer(Long value) {
        this.virksomhedAdresseLøbeNummer = value;
    }

    /**
     * Gets the value of the adresseFiltrering property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedKontaktOplysningSamlingHentIType.AdresseFiltrering }
     *     
     */
    public VirksomhedKontaktOplysningSamlingHentIType.AdresseFiltrering getAdresseFiltrering() {
        return adresseFiltrering;
    }

    /**
     * Sets the value of the adresseFiltrering property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedKontaktOplysningSamlingHentIType.AdresseFiltrering }
     *     
     */
    public void setAdresseFiltrering(VirksomhedKontaktOplysningSamlingHentIType.AdresseFiltrering value) {
        this.adresseFiltrering = value;
    }

    /**
     * Gets the value of the pligtKodeFiltrering property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedKontaktOplysningSamlingHentIType.PligtKodeFiltrering }
     *     
     */
    public VirksomhedKontaktOplysningSamlingHentIType.PligtKodeFiltrering getPligtKodeFiltrering() {
        return pligtKodeFiltrering;
    }

    /**
     * Sets the value of the pligtKodeFiltrering property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedKontaktOplysningSamlingHentIType.PligtKodeFiltrering }
     *     
     */
    public void setPligtKodeFiltrering(VirksomhedKontaktOplysningSamlingHentIType.PligtKodeFiltrering value) {
        this.pligtKodeFiltrering = value;
    }

    /**
     * Gets the value of the bevillingKodeFiltrering property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedKontaktOplysningSamlingHentIType.BevillingKodeFiltrering }
     *     
     */
    public VirksomhedKontaktOplysningSamlingHentIType.BevillingKodeFiltrering getBevillingKodeFiltrering() {
        return bevillingKodeFiltrering;
    }

    /**
     * Sets the value of the bevillingKodeFiltrering property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedKontaktOplysningSamlingHentIType.BevillingKodeFiltrering }
     *     
     */
    public void setBevillingKodeFiltrering(VirksomhedKontaktOplysningSamlingHentIType.BevillingKodeFiltrering value) {
        this.bevillingKodeFiltrering = value;
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
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedAdresseTypeKode" maxOccurs="unbounded"/>
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
        "virksomhedAdresseTypeKode"
    })
    public static class AdresseFiltrering {

        @XmlElement(name = "VirksomhedAdresseTypeKode", required = true)
        protected List<BigInteger> virksomhedAdresseTypeKode;

        /**
         * Gets the value of the virksomhedAdresseTypeKode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the virksomhedAdresseTypeKode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVirksomhedAdresseTypeKode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getVirksomhedAdresseTypeKode() {
            if (virksomhedAdresseTypeKode == null) {
                virksomhedAdresseTypeKode = new ArrayList<BigInteger>();
            }
            return this.virksomhedAdresseTypeKode;
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
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingTypeKode"/>
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
        "bevillingTypeKode"
    })
    public static class BevillingKodeFiltrering {

        @XmlElement(name = "BevillingTypeKode", required = true)
        protected BigInteger bevillingTypeKode;

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
        "pligtKode"
    })
    public static class PligtKodeFiltrering {

        @XmlElement(name = "PligtKode", required = true)
        protected BigInteger pligtKode;

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
