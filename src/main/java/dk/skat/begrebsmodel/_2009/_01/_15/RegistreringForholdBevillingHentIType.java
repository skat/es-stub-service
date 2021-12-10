
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
 * <p>Java class for RegistreringForholdBevillingHent_IType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistreringForholdBevillingHent_IType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}Kontekst"/>
 *         &lt;element name="S�gekriterier">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdGyldigFra" minOccurs="0"/>
 *                   &lt;element name="VirksomhedListe">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Virksomhed" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode"/>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdKode" minOccurs="0"/>
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
@XmlType(name = "RegistreringForholdBevillingHent_IType", propOrder = {
    "kontekst",
    "søgekriterier"
})
@XmlSeeAlso({
    RegistreringForholdBevillingHentI.class
})
public class RegistreringForholdBevillingHentIType {

    @XmlElement(name = "Kontekst", required = true)
    protected KontekstType kontekst;
    @XmlElement(name = "Søgekriterier", required = true)
    protected RegistreringForholdBevillingHentIType.Søgekriterier søgekriterier;

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
     * Gets the value of the s�gekriterier property.
     * 
     * @return
     *     possible object is
     *     {@link RegistreringForholdBevillingHentIType.S�gekriterier }
     *     
     */
    public RegistreringForholdBevillingHentIType.Søgekriterier getSøgekriterier() {
        return søgekriterier;
    }

    /**
     * Sets the value of the s�gekriterier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistreringForholdBevillingHentIType.S�gekriterier }
     *     
     */
    public void setSøgekriterier(RegistreringForholdBevillingHentIType.Søgekriterier value) {
        this.søgekriterier = value;
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
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdGyldigFra" minOccurs="0"/>
     *         &lt;element name="VirksomhedListe">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Virksomhed" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode"/>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdKode" minOccurs="0"/>
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
        "bevillingForholdGyldigFra",
        "virksomhedListe"
    })
    public static class Søgekriterier {

        @XmlElement(name = "BevillingForholdGyldigFra")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar bevillingForholdGyldigFra;
        @XmlElement(name = "VirksomhedListe", required = true)
        protected RegistreringForholdBevillingHentIType.Søgekriterier.VirksomhedListe virksomhedListe;

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
         * Gets the value of the virksomhedListe property.
         * 
         * @return
         *     possible object is
         *     {@link RegistreringForholdBevillingHentIType.Søgekriterier.VirksomhedListe }
         *     
         */
        public RegistreringForholdBevillingHentIType.Søgekriterier.VirksomhedListe getVirksomhedListe() {
            return virksomhedListe;
        }

        /**
         * Sets the value of the virksomhedListe property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistreringForholdBevillingHentIType.S�gekriterier.VirksomhedListe }
         *     
         */
        public void setVirksomhedListe(RegistreringForholdBevillingHentIType.Søgekriterier.VirksomhedListe value) {
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
         *         &lt;element name="Virksomhed" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode"/>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdKode" minOccurs="0"/>
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

            @XmlElement(name = "Virksomhed", required = true)
            protected List<RegistreringForholdBevillingHentIType.Søgekriterier.VirksomhedListe.Virksomhed> virksomhed;

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
             * {@link RegistreringForholdBevillingHentIType.S�gekriterier.VirksomhedListe.Virksomhed }
             * 
             * 
             */
            public List<RegistreringForholdBevillingHentIType.Søgekriterier.VirksomhedListe.Virksomhed> getVirksomhed() {
                if (virksomhed == null) {
                    virksomhed = new ArrayList<RegistreringForholdBevillingHentIType.Søgekriterier.VirksomhedListe.Virksomhed>();
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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}PligtKode"/>
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}BevillingForholdKode" minOccurs="0"/>
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
                "pligtKode",
                "bevillingForholdKode"
            })
            public static class Virksomhed {

                @XmlElement(name = "VirksomhedSENummer", required = true)
                protected BigInteger virksomhedSENummer;
                @XmlElement(name = "PligtKode", required = true)
                protected String pligtKode;
                @XmlElement(name = "BevillingForholdKode")
                protected BigInteger bevillingForholdKode;

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

            }

        }

    }

}
