
package dk.skat.begrebsmodel._2009._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistreringForholdBevillingHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistreringForholdBevillingHentInterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}RegistreringForholdBevillingHent_I"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}RegistreringForholdBevillingHent_O"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}RegistreringForholdBevillingHent_FejlId"/>
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
@XmlType(name = "RegistreringForholdBevillingHentInterfaceType", propOrder = {
    "registreringForholdBevillingHentI",
    "registreringForholdBevillingHentO",
    "registreringForholdBevillingHentFejlId",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class RegistreringForholdBevillingHentInterfaceType {

    @XmlElement(name = "RegistreringForholdBevillingHent_I")
    protected RegistreringForholdBevillingHentI registreringForholdBevillingHentI;
    @XmlElement(name = "RegistreringForholdBevillingHent_O")
    protected RegistreringForholdBevillingHentO registreringForholdBevillingHentO;
    @XmlElement(name = "RegistreringForholdBevillingHent_FejlId")
    protected RegistreringForholdBevillingHentFejlIdType registreringForholdBevillingHentFejlId;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the registreringForholdBevillingHentI property.
     * 
     * @return
     *     possible object is
     *     {@link RegistreringForholdBevillingHentI }
     *     
     */
    public RegistreringForholdBevillingHentI getRegistreringForholdBevillingHentI() {
        return registreringForholdBevillingHentI;
    }

    /**
     * Sets the value of the registreringForholdBevillingHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistreringForholdBevillingHentI }
     *     
     */
    public void setRegistreringForholdBevillingHentI(RegistreringForholdBevillingHentI value) {
        this.registreringForholdBevillingHentI = value;
    }

    /**
     * Gets the value of the registreringForholdBevillingHentO property.
     * 
     * @return
     *     possible object is
     *     {@link RegistreringForholdBevillingHentO }
     *     
     */
    public RegistreringForholdBevillingHentO getRegistreringForholdBevillingHentO() {
        return registreringForholdBevillingHentO;
    }

    /**
     * Sets the value of the registreringForholdBevillingHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistreringForholdBevillingHentO }
     *     
     */
    public void setRegistreringForholdBevillingHentO(RegistreringForholdBevillingHentO value) {
        this.registreringForholdBevillingHentO = value;
    }

    /**
     * Gets the value of the registreringForholdBevillingHentFejlId property.
     * 
     * @return
     *     possible object is
     *     {@link RegistreringForholdBevillingHentFejlIdType }
     *     
     */
    public RegistreringForholdBevillingHentFejlIdType getRegistreringForholdBevillingHentFejlId() {
        return registreringForholdBevillingHentFejlId;
    }

    /**
     * Sets the value of the registreringForholdBevillingHentFejlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistreringForholdBevillingHentFejlIdType }
     *     
     */
    public void setRegistreringForholdBevillingHentFejlId(RegistreringForholdBevillingHentFejlIdType value) {
        this.registreringForholdBevillingHentFejlId = value;
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
