
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeviceCommStatus�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceCommStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Fault"/>
 *     &lt;enumeration value="Unkown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceCommStatus", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core")
@XmlEnum
public enum DeviceCommStatus {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Fault")
    FAULT("Fault"),
    @XmlEnumValue("Unkown")
    UNKOWN("Unkown");
    private final String value;

    DeviceCommStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceCommStatus fromValue(String v) {
        for (DeviceCommStatus c: DeviceCommStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
