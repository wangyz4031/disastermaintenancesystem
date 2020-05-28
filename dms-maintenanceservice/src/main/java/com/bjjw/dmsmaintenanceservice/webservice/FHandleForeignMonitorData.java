
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
 *         &lt;element name="dataEntity" type="{http://schemas.datacontract.org/2004/07/CoreLib.Entity}DataEntity" minOccurs="0"/>
 *         &lt;element name="statusEntity" type="{http://schemas.datacontract.org/2004/07/CoreLib.Entity}StatusEntity" minOccurs="0"/>
 *         &lt;element name="monitorUnitEntity" type="{http://schemas.datacontract.org/2004/07/CoreLib.Entity}MonitorUnitDeviceStatusEntity" minOccurs="0"/>
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
    "dataEntity",
    "statusEntity",
    "monitorUnitEntity"
})
@XmlRootElement(name = "F_HandleForeignMonitorData")
public class FHandleForeignMonitorData {

    @XmlElementRef(name = "dataEntity", namespace = "http:/DST_V2/AccessBus", type = JAXBElement.class, required = false)
    protected JAXBElement<DataEntity> dataEntity;
    @XmlElementRef(name = "statusEntity", namespace = "http:/DST_V2/AccessBus", type = JAXBElement.class, required = false)
    protected JAXBElement<StatusEntity> statusEntity;
    @XmlElementRef(name = "monitorUnitEntity", namespace = "http:/DST_V2/AccessBus", type = JAXBElement.class, required = false)
    protected JAXBElement<MonitorUnitDeviceStatusEntity> monitorUnitEntity;

    /**
     * ��ȡdataEntity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataEntity }{@code >}
     *     
     */
    public JAXBElement<DataEntity> getDataEntity() {
        return dataEntity;
    }

    /**
     * ����dataEntity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataEntity }{@code >}
     *     
     */
    public void setDataEntity(JAXBElement<DataEntity> value) {
        this.dataEntity = value;
    }

    /**
     * ��ȡstatusEntity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StatusEntity }{@code >}
     *     
     */
    public JAXBElement<StatusEntity> getStatusEntity() {
        return statusEntity;
    }

    /**
     * ����statusEntity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StatusEntity }{@code >}
     *     
     */
    public void setStatusEntity(JAXBElement<StatusEntity> value) {
        this.statusEntity = value;
    }

    /**
     * ��ȡmonitorUnitEntity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonitorUnitDeviceStatusEntity }{@code >}
     *     
     */
    public JAXBElement<MonitorUnitDeviceStatusEntity> getMonitorUnitEntity() {
        return monitorUnitEntity;
    }

    /**
     * ����monitorUnitEntity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonitorUnitDeviceStatusEntity }{@code >}
     *     
     */
    public void setMonitorUnitEntity(JAXBElement<MonitorUnitDeviceStatusEntity> value) {
        this.monitorUnitEntity = value;
    }

}
