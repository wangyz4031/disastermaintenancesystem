
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="D_HandleMonitorUnitDeviceStatusResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dHandleMonitorUnitDeviceStatusResult"
})
@XmlRootElement(name = "D_HandleMonitorUnitDeviceStatusResponse")
public class DHandleMonitorUnitDeviceStatusResponse {

    @XmlElement(name = "D_HandleMonitorUnitDeviceStatusResult")
    protected Boolean dHandleMonitorUnitDeviceStatusResult;

    /**
     * ��ȡdHandleMonitorUnitDeviceStatusResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDHandleMonitorUnitDeviceStatusResult() {
        return dHandleMonitorUnitDeviceStatusResult;
    }

    /**
     * ����dHandleMonitorUnitDeviceStatusResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDHandleMonitorUnitDeviceStatusResult(Boolean value) {
        this.dHandleMonitorUnitDeviceStatusResult = value;
    }

}
