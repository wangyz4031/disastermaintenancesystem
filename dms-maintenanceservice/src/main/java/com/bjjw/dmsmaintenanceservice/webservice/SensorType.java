
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SensorType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="SensorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Wind"/>
 *     &lt;enumeration value="Rain"/>
 *     &lt;enumeration value="Snow"/>
 *     &lt;enumeration value="ForeignMatter"/>
 *     &lt;enumeration value="EarthQuake"/>
 *     &lt;enumeration value="Unkown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SensorType", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core")
@XmlEnum
public enum SensorType {

    @XmlEnumValue("Wind")
    WIND("Wind"),
    @XmlEnumValue("Rain")
    RAIN("Rain"),
    @XmlEnumValue("Snow")
    SNOW("Snow"),
    @XmlEnumValue("ForeignMatter")
    FOREIGN_MATTER("ForeignMatter"),
    @XmlEnumValue("EarthQuake")
    EARTH_QUAKE("EarthQuake"),
    @XmlEnumValue("Unkown")
    UNKOWN("Unkown");
    private final String value;

    SensorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SensorType fromValue(String v) {
        for (SensorType c: SensorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
