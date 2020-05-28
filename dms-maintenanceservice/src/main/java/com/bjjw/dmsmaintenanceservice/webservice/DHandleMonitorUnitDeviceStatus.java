
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monitorUnitDeviceStatusStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "nodeId",
    "monitorUnitDeviceStatusStr"
})
@XmlRootElement(name = "D_HandleMonitorUnitDeviceStatus")
public class DHandleMonitorUnitDeviceStatus {

    @XmlElementRef(name = "nodeId", namespace = "http:/DST_V2/AccessBus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nodeId;
    @XmlElementRef(name = "monitorUnitDeviceStatusStr", namespace = "http:/DST_V2/AccessBus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitorUnitDeviceStatusStr;

    /**
     * ��ȡnodeId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNodeId() {
        return nodeId;
    }

    /**
     * ����nodeId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNodeId(JAXBElement<String> value) {
        this.nodeId = value;
    }

    /**
     * ��ȡmonitorUnitDeviceStatusStr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonitorUnitDeviceStatusStr() {
        return monitorUnitDeviceStatusStr;
    }

    /**
     * ����monitorUnitDeviceStatusStr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonitorUnitDeviceStatusStr(JAXBElement<String> value) {
        this.monitorUnitDeviceStatusStr = value;
    }

}
