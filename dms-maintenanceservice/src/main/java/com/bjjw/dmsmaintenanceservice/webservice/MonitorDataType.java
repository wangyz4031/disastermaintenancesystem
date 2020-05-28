
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MonitorDataType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="MonitorDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unkown"/>
 *     &lt;enumeration value="Wind"/>
 *     &lt;enumeration value="Rain"/>
 *     &lt;enumeration value="Snow"/>
 *     &lt;enumeration value="ForeignMatter"/>
 *     &lt;enumeration value="EarthQuake"/>
 *     &lt;enumeration value="EnvironmentData"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonitorDataType", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core")
@XmlEnum
public enum MonitorDataType {

    @XmlEnumValue("Unkown")
    UNKOWN("Unkown"),
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
    @XmlEnumValue("EnvironmentData")
    ENVIRONMENT_DATA("EnvironmentData");
    private final String value;

    MonitorDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonitorDataType fromValue(String v) {
        for (MonitorDataType c: MonitorDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
