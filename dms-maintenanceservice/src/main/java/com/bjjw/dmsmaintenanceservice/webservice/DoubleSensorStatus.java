
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DoubleSensorStatus�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="DoubleSensorStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="SingleFault"/>
 *     &lt;enumeration value="DoubleFault"/>
 *     &lt;enumeration value="NoContact"/>
 *     &lt;enumeration value="UnKnown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DoubleSensorStatus", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core")
@XmlEnum
public enum DoubleSensorStatus {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("SingleFault")
    SINGLE_FAULT("SingleFault"),
    @XmlEnumValue("DoubleFault")
    DOUBLE_FAULT("DoubleFault"),
    @XmlEnumValue("NoContact")
    NO_CONTACT("NoContact"),
    @XmlEnumValue("UnKnown")
    UN_KNOWN("UnKnown");
    private final String value;

    DoubleSensorStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoubleSensorStatus fromValue(String v) {
        for (DoubleSensorStatus c: DoubleSensorStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
