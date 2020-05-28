
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
 *         &lt;element name="interfaceGateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bureauCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monitorUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monitorPointCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snowDepthImageStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "interfaceGateId",
    "clientId",
    "bureauCode",
    "lineCode",
    "monitorUnitCode",
    "monitorPointCode",
    "snowDepthImageStr"
})
@XmlRootElement(name = "E_UpLoadSnowDepthImage")
public class EUpLoadSnowDepthImage {

    @XmlElementRef(name = "interfaceGateId", namespace = "http:/DST_V2/AccessBus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceGateId;
    @XmlElementRef(name = "clientId", namespace = "http:/DST_V2/AccessBus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientId;
    @XmlElementRef(name = "bureauCode", namespace = "http:/DST_V2/AccessBus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bureauCode;
    @XmlElementRef(name = "lineCode", namespace = "http:/DST_V2/AccessBus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineCode;
    @XmlElementRef(name = "monitorUnitCode", namespace = "http:/DST_V2/AccessBus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitorUnitCode;
    @XmlElementRef(name = "monitorPointCode", namespace = "http:/DST_V2/AccessBus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitorPointCode;
    @XmlElementRef(name = "snowDepthImageStr", namespace = "http:/DST_V2/AccessBus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> snowDepthImageStr;

    /**
     * ��ȡinterfaceGateId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceGateId() {
        return interfaceGateId;
    }

    /**
     * ����interfaceGateId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceGateId(JAXBElement<String> value) {
        this.interfaceGateId = value;
    }

    /**
     * ��ȡclientId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientId() {
        return clientId;
    }

    /**
     * ����clientId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientId(JAXBElement<String> value) {
        this.clientId = value;
    }

    /**
     * ��ȡbureauCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBureauCode() {
        return bureauCode;
    }

    /**
     * ����bureauCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBureauCode(JAXBElement<String> value) {
        this.bureauCode = value;
    }

    /**
     * ��ȡlineCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineCode() {
        return lineCode;
    }

    /**
     * ����lineCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineCode(JAXBElement<String> value) {
        this.lineCode = value;
    }

    /**
     * ��ȡmonitorUnitCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonitorUnitCode() {
        return monitorUnitCode;
    }

    /**
     * ����monitorUnitCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonitorUnitCode(JAXBElement<String> value) {
        this.monitorUnitCode = value;
    }

    /**
     * ��ȡmonitorPointCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonitorPointCode() {
        return monitorPointCode;
    }

    /**
     * ����monitorPointCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonitorPointCode(JAXBElement<String> value) {
        this.monitorPointCode = value;
    }

    /**
     * ��ȡsnowDepthImageStr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSnowDepthImageStr() {
        return snowDepthImageStr;
    }

    /**
     * ����snowDepthImageStr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSnowDepthImageStr(JAXBElement<String> value) {
        this.snowDepthImageStr = value;
    }

}
