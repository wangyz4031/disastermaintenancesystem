
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeviceStatus�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Fault"/>
 *     &lt;enumeration value="UnKnown"/>
 *     &lt;enumeration value="NoContact"/>
 *     &lt;enumeration value="HostMachineFault"/>
 *     &lt;enumeration value="PowerFault"/>
 *     &lt;enumeration value="NetWorkFault"/>
 *     &lt;enumeration value="MultiFault"/>
 *     &lt;enumeration value="BordCardFault"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceStatus", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core")
@XmlEnum
public enum DeviceStatus {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Fault")
    FAULT("Fault"),
    @XmlEnumValue("UnKnown")
    UN_KNOWN("UnKnown"),
    @XmlEnumValue("NoContact")
    NO_CONTACT("NoContact"),
    @XmlEnumValue("HostMachineFault")
    HOST_MACHINE_FAULT("HostMachineFault"),
    @XmlEnumValue("PowerFault")
    POWER_FAULT("PowerFault"),
    @XmlEnumValue("NetWorkFault")
    NET_WORK_FAULT("NetWorkFault"),
    @XmlEnumValue("MultiFault")
    MULTI_FAULT("MultiFault"),
    @XmlEnumValue("BordCardFault")
    BORD_CARD_FAULT("BordCardFault");
    private final String value;

    DeviceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceStatus fromValue(String v) {
        for (DeviceStatus c: DeviceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
