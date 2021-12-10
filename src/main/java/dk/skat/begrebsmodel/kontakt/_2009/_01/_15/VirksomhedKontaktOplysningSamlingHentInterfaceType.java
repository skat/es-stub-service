
package dk.skat.begrebsmodel.kontakt._2009._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirksomhedKontaktOplysningSamlingHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirksomhedKontaktOplysningSamlingHentInterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedKontaktOplysningSamlingHent_I"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedKontaktOplysningSamlingHent_O"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}KompenserTrans"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}KompenserTransSvar"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirksomhedKontaktOplysningSamlingHentInterfaceType", propOrder = {
    "virksomhedKontaktOplysningSamlingHentI",
    "virksomhedKontaktOplysningSamlingHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class VirksomhedKontaktOplysningSamlingHentInterfaceType {

    @XmlElement(name = "VirksomhedKontaktOplysningSamlingHent_I")
    protected VirksomhedKontaktOplysningSamlingHentI virksomhedKontaktOplysningSamlingHentI;
    @XmlElement(name = "VirksomhedKontaktOplysningSamlingHent_O")
    protected VirksomhedKontaktOplysningSamlingHentO virksomhedKontaktOplysningSamlingHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the virksomhedKontaktOplysningSamlingHentI property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedKontaktOplysningSamlingHentI }
     *     
     */
    public VirksomhedKontaktOplysningSamlingHentI getVirksomhedKontaktOplysningSamlingHentI() {
        return virksomhedKontaktOplysningSamlingHentI;
    }

    /**
     * Sets the value of the virksomhedKontaktOplysningSamlingHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedKontaktOplysningSamlingHentI }
     *     
     */
    public void setVirksomhedKontaktOplysningSamlingHentI(VirksomhedKontaktOplysningSamlingHentI value) {
        this.virksomhedKontaktOplysningSamlingHentI = value;
    }

    /**
     * Gets the value of the virksomhedKontaktOplysningSamlingHentO property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedKontaktOplysningSamlingHentO }
     *     
     */
    public VirksomhedKontaktOplysningSamlingHentO getVirksomhedKontaktOplysningSamlingHentO() {
        return virksomhedKontaktOplysningSamlingHentO;
    }

    /**
     * Sets the value of the virksomhedKontaktOplysningSamlingHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedKontaktOplysningSamlingHentO }
     *     
     */
    public void setVirksomhedKontaktOplysningSamlingHentO(VirksomhedKontaktOplysningSamlingHentO value) {
        this.virksomhedKontaktOplysningSamlingHentO = value;
    }

    /**
     * Gets the value of the kompenserTrans property.
     * 
     * @return
     *     possible object is
     *     {@link KompenserTransType }
     *     
     */
    public KompenserTransType getKompenserTrans() {
        return kompenserTrans;
    }

    /**
     * Sets the value of the kompenserTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link KompenserTransType }
     *     
     */
    public void setKompenserTrans(KompenserTransType value) {
        this.kompenserTrans = value;
    }

    /**
     * Gets the value of the kompenserTransSvar property.
     * 
     * @return
     *     possible object is
     *     {@link KompenserTransSvarType }
     *     
     */
    public KompenserTransSvarType getKompenserTransSvar() {
        return kompenserTransSvar;
    }

    /**
     * Sets the value of the kompenserTransSvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link KompenserTransSvarType }
     *     
     */
    public void setKompenserTransSvar(KompenserTransSvarType value) {
        this.kompenserTransSvar = value;
    }

}
