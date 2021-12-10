
package dk.skat.begrebsmodel._2008._01._01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirksomhedStamOplysningSamlingHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirksomhedStamOplysningSamlingHentInterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStamOplysningSamlingHent_I"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStamOplysningSamlingHent_O"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}VirksomhedStamOplysningSamlingHent_FejlId"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}KompenserTrans"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2008/01/01/}KompenserTransSvar"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirksomhedStamOplysningSamlingHentInterfaceType", propOrder = {
    "virksomhedStamOplysningSamlingHentI",
    "virksomhedStamOplysningSamlingHentO",
    "virksomhedStamOplysningSamlingHentFejlId",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class VirksomhedStamOplysningSamlingHentInterfaceType {

    @XmlElement(name = "VirksomhedStamOplysningSamlingHent_I")
    protected VirksomhedStamOplysningSamlingHentI virksomhedStamOplysningSamlingHentI;
    @XmlElement(name = "VirksomhedStamOplysningSamlingHent_O")
    protected VirksomhedStamOplysningSamlingHentO virksomhedStamOplysningSamlingHentO;
    @XmlElement(name = "VirksomhedStamOplysningSamlingHent_FejlId")
    protected VirksomhedStamOplysningSamlingHentFejlIdType virksomhedStamOplysningSamlingHentFejlId;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the virksomhedStamOplysningSamlingHentI property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedStamOplysningSamlingHentI }
     *     
     */
    public VirksomhedStamOplysningSamlingHentI getVirksomhedStamOplysningSamlingHentI() {
        return virksomhedStamOplysningSamlingHentI;
    }

    /**
     * Sets the value of the virksomhedStamOplysningSamlingHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedStamOplysningSamlingHentI }
     *     
     */
    public void setVirksomhedStamOplysningSamlingHentI(VirksomhedStamOplysningSamlingHentI value) {
        this.virksomhedStamOplysningSamlingHentI = value;
    }

    /**
     * Gets the value of the virksomhedStamOplysningSamlingHentO property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedStamOplysningSamlingHentO }
     *     
     */
    public VirksomhedStamOplysningSamlingHentO getVirksomhedStamOplysningSamlingHentO() {
        return virksomhedStamOplysningSamlingHentO;
    }

    /**
     * Sets the value of the virksomhedStamOplysningSamlingHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedStamOplysningSamlingHentO }
     *     
     */
    public void setVirksomhedStamOplysningSamlingHentO(VirksomhedStamOplysningSamlingHentO value) {
        this.virksomhedStamOplysningSamlingHentO = value;
    }

    /**
     * Gets the value of the virksomhedStamOplysningSamlingHentFejlId property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedStamOplysningSamlingHentFejlIdType }
     *     
     */
    public VirksomhedStamOplysningSamlingHentFejlIdType getVirksomhedStamOplysningSamlingHentFejlId() {
        return virksomhedStamOplysningSamlingHentFejlId;
    }

    /**
     * Sets the value of the virksomhedStamOplysningSamlingHentFejlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedStamOplysningSamlingHentFejlIdType }
     *     
     */
    public void setVirksomhedStamOplysningSamlingHentFejlId(VirksomhedStamOplysningSamlingHentFejlIdType value) {
        this.virksomhedStamOplysningSamlingHentFejlId = value;
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
