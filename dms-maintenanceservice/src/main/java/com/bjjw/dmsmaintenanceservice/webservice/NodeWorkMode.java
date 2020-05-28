
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NodeWorkMode�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="NodeWorkMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Master"/>
 *     &lt;enumeration value="Standby"/>
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="UnKown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NodeWorkMode", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core")
@XmlEnum
public enum NodeWorkMode {

    @XmlEnumValue("Master")
    MASTER("Master"),
    @XmlEnumValue("Standby")
    STANDBY("Standby"),
    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("UnKown")
    UN_KOWN("UnKown");
    private final String value;

    NodeWorkMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NodeWorkMode fromValue(String v) {
        for (NodeWorkMode c: NodeWorkMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
