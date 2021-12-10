
package dk.skat.begrebsmodel._2008._01._01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LigeUligeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LigeUligeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="10"/>
 *     &lt;pattern value="[a-zA-ZøæåØÆÅ]*"/>
 *     &lt;enumeration value="Lige"/>
 *     &lt;enumeration value="Ulige"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LigeUligeType")
@XmlEnum
public enum LigeUligeType {

    @XmlEnumValue("Lige")
    LIGE("Lige"),
    @XmlEnumValue("Ulige")
    ULIGE("Ulige");
    private final String value;

    LigeUligeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LigeUligeType fromValue(String v) {
        for (LigeUligeType c: LigeUligeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
