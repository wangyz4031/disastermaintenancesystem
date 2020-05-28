
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MonitorUnitDeviceStatusEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MonitorUnitDeviceStatusEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/CoreLib.Entity}StatusEntity">
 *       &lt;sequence>
 *         &lt;element name="BoardCardAStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="BoardCardBStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="ControlModuleAHostStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}NodeWorkMode" minOccurs="0"/>
 *         &lt;element name="ControlModuleANetStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="ControlModuleAStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="ControlModuleBHostStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}NodeWorkMode" minOccurs="0"/>
 *         &lt;element name="ControlModuleBNetStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="ControlModuleBStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="HeartBeatAtoBStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="HeartBeatBtoAStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="MonitorUnitStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="Ups1DumpEnergy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ups1InputStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="Ups1InputVoltage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ups1NetStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="Ups1OutputStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="Ups1OutputVoltage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ups1PowerStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="Ups2DumpEnergy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ups2InputStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="Ups2InputVoltage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ups2NetStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="Ups2OutputStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="Ups2OutputVoltage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ups2PowerStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorUnitDeviceStatusEntity", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", propOrder = {
    "boardCardAStatus",
    "boardCardBStatus",
    "controlModuleAHostStatus",
    "controlModuleANetStatus",
    "controlModuleAStatus",
    "controlModuleBHostStatus",
    "controlModuleBNetStatus",
    "controlModuleBStatus",
    "heartBeatAtoBStatus",
    "heartBeatBtoAStatus",
    "monitorUnitStatus",
    "ups1DumpEnergy",
    "ups1InputStatus",
    "ups1InputVoltage",
    "ups1NetStatus",
    "ups1OutputStatus",
    "ups1OutputVoltage",
    "ups1PowerStatus",
    "ups2DumpEnergy",
    "ups2InputStatus",
    "ups2InputVoltage",
    "ups2NetStatus",
    "ups2OutputStatus",
    "ups2OutputVoltage",
    "ups2PowerStatus"
})
public class MonitorUnitDeviceStatusEntity
    extends StatusEntity
{

    @XmlElement(name = "BoardCardAStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus boardCardAStatus;
    @XmlElement(name = "BoardCardBStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus boardCardBStatus;
    @XmlElement(name = "ControlModuleAHostStatus")
    @XmlSchemaType(name = "string")
    protected NodeWorkMode controlModuleAHostStatus;
    @XmlElement(name = "ControlModuleANetStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus controlModuleANetStatus;
    @XmlElement(name = "ControlModuleAStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus controlModuleAStatus;
    @XmlElement(name = "ControlModuleBHostStatus")
    @XmlSchemaType(name = "string")
    protected NodeWorkMode controlModuleBHostStatus;
    @XmlElement(name = "ControlModuleBNetStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus controlModuleBNetStatus;
    @XmlElement(name = "ControlModuleBStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus controlModuleBStatus;
    @XmlElement(name = "HeartBeatAtoBStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus heartBeatAtoBStatus;
    @XmlElement(name = "HeartBeatBtoAStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus heartBeatBtoAStatus;
    @XmlElement(name = "MonitorUnitStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus monitorUnitStatus;
    @XmlElementRef(name = "Ups1DumpEnergy", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ups1DumpEnergy;
    @XmlElement(name = "Ups1InputStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus ups1InputStatus;
    @XmlElementRef(name = "Ups1InputVoltage", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ups1InputVoltage;
    @XmlElement(name = "Ups1NetStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus ups1NetStatus;
    @XmlElement(name = "Ups1OutputStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus ups1OutputStatus;
    @XmlElementRef(name = "Ups1OutputVoltage", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ups1OutputVoltage;
    @XmlElement(name = "Ups1PowerStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus ups1PowerStatus;
    @XmlElementRef(name = "Ups2DumpEnergy", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ups2DumpEnergy;
    @XmlElement(name = "Ups2InputStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus ups2InputStatus;
    @XmlElementRef(name = "Ups2InputVoltage", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ups2InputVoltage;
    @XmlElement(name = "Ups2NetStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus ups2NetStatus;
    @XmlElement(name = "Ups2OutputStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus ups2OutputStatus;
    @XmlElementRef(name = "Ups2OutputVoltage", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ups2OutputVoltage;
    @XmlElement(name = "Ups2PowerStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus ups2PowerStatus;

    /**
     * ��ȡboardCardAStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getBoardCardAStatus() {
        return boardCardAStatus;
    }

    /**
     * ����boardCardAStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setBoardCardAStatus(DeviceStatus value) {
        this.boardCardAStatus = value;
    }

    /**
     * ��ȡboardCardBStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getBoardCardBStatus() {
        return boardCardBStatus;
    }

    /**
     * ����boardCardBStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setBoardCardBStatus(DeviceStatus value) {
        this.boardCardBStatus = value;
    }

    /**
     * ��ȡcontrolModuleAHostStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NodeWorkMode }
     *     
     */
    public NodeWorkMode getControlModuleAHostStatus() {
        return controlModuleAHostStatus;
    }

    /**
     * ����controlModuleAHostStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NodeWorkMode }
     *     
     */
    public void setControlModuleAHostStatus(NodeWorkMode value) {
        this.controlModuleAHostStatus = value;
    }

    /**
     * ��ȡcontrolModuleANetStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getControlModuleANetStatus() {
        return controlModuleANetStatus;
    }

    /**
     * ����controlModuleANetStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setControlModuleANetStatus(DeviceStatus value) {
        this.controlModuleANetStatus = value;
    }

    /**
     * ��ȡcontrolModuleAStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getControlModuleAStatus() {
        return controlModuleAStatus;
    }

    /**
     * ����controlModuleAStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setControlModuleAStatus(DeviceStatus value) {
        this.controlModuleAStatus = value;
    }

    /**
     * ��ȡcontrolModuleBHostStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NodeWorkMode }
     *     
     */
    public NodeWorkMode getControlModuleBHostStatus() {
        return controlModuleBHostStatus;
    }

    /**
     * ����controlModuleBHostStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NodeWorkMode }
     *     
     */
    public void setControlModuleBHostStatus(NodeWorkMode value) {
        this.controlModuleBHostStatus = value;
    }

    /**
     * ��ȡcontrolModuleBNetStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getControlModuleBNetStatus() {
        return controlModuleBNetStatus;
    }

    /**
     * ����controlModuleBNetStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setControlModuleBNetStatus(DeviceStatus value) {
        this.controlModuleBNetStatus = value;
    }

    /**
     * ��ȡcontrolModuleBStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getControlModuleBStatus() {
        return controlModuleBStatus;
    }

    /**
     * ����controlModuleBStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setControlModuleBStatus(DeviceStatus value) {
        this.controlModuleBStatus = value;
    }

    /**
     * ��ȡheartBeatAtoBStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getHeartBeatAtoBStatus() {
        return heartBeatAtoBStatus;
    }

    /**
     * ����heartBeatAtoBStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setHeartBeatAtoBStatus(DeviceStatus value) {
        this.heartBeatAtoBStatus = value;
    }

    /**
     * ��ȡheartBeatBtoAStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getHeartBeatBtoAStatus() {
        return heartBeatBtoAStatus;
    }

    /**
     * ����heartBeatBtoAStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setHeartBeatBtoAStatus(DeviceStatus value) {
        this.heartBeatBtoAStatus = value;
    }

    /**
     * ��ȡmonitorUnitStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getMonitorUnitStatus() {
        return monitorUnitStatus;
    }

    /**
     * ����monitorUnitStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setMonitorUnitStatus(DeviceStatus value) {
        this.monitorUnitStatus = value;
    }

    /**
     * ��ȡups1DumpEnergy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUps1DumpEnergy() {
        return ups1DumpEnergy;
    }

    /**
     * ����ups1DumpEnergy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUps1DumpEnergy(JAXBElement<String> value) {
        this.ups1DumpEnergy = value;
    }

    /**
     * ��ȡups1InputStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getUps1InputStatus() {
        return ups1InputStatus;
    }

    /**
     * ����ups1InputStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setUps1InputStatus(DeviceStatus value) {
        this.ups1InputStatus = value;
    }

    /**
     * ��ȡups1InputVoltage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUps1InputVoltage() {
        return ups1InputVoltage;
    }

    /**
     * ����ups1InputVoltage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUps1InputVoltage(JAXBElement<String> value) {
        this.ups1InputVoltage = value;
    }

    /**
     * ��ȡups1NetStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getUps1NetStatus() {
        return ups1NetStatus;
    }

    /**
     * ����ups1NetStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setUps1NetStatus(DeviceStatus value) {
        this.ups1NetStatus = value;
    }

    /**
     * ��ȡups1OutputStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getUps1OutputStatus() {
        return ups1OutputStatus;
    }

    /**
     * ����ups1OutputStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setUps1OutputStatus(DeviceStatus value) {
        this.ups1OutputStatus = value;
    }

    /**
     * ��ȡups1OutputVoltage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUps1OutputVoltage() {
        return ups1OutputVoltage;
    }

    /**
     * ����ups1OutputVoltage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUps1OutputVoltage(JAXBElement<String> value) {
        this.ups1OutputVoltage = value;
    }

    /**
     * ��ȡups1PowerStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getUps1PowerStatus() {
        return ups1PowerStatus;
    }

    /**
     * ����ups1PowerStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setUps1PowerStatus(DeviceStatus value) {
        this.ups1PowerStatus = value;
    }

    /**
     * ��ȡups2DumpEnergy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUps2DumpEnergy() {
        return ups2DumpEnergy;
    }

    /**
     * ����ups2DumpEnergy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUps2DumpEnergy(JAXBElement<String> value) {
        this.ups2DumpEnergy = value;
    }

    /**
     * ��ȡups2InputStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getUps2InputStatus() {
        return ups2InputStatus;
    }

    /**
     * ����ups2InputStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setUps2InputStatus(DeviceStatus value) {
        this.ups2InputStatus = value;
    }

    /**
     * ��ȡups2InputVoltage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUps2InputVoltage() {
        return ups2InputVoltage;
    }

    /**
     * ����ups2InputVoltage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUps2InputVoltage(JAXBElement<String> value) {
        this.ups2InputVoltage = value;
    }

    /**
     * ��ȡups2NetStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getUps2NetStatus() {
        return ups2NetStatus;
    }

    /**
     * ����ups2NetStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setUps2NetStatus(DeviceStatus value) {
        this.ups2NetStatus = value;
    }

    /**
     * ��ȡups2OutputStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getUps2OutputStatus() {
        return ups2OutputStatus;
    }

    /**
     * ����ups2OutputStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setUps2OutputStatus(DeviceStatus value) {
        this.ups2OutputStatus = value;
    }

    /**
     * ��ȡups2OutputVoltage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUps2OutputVoltage() {
        return ups2OutputVoltage;
    }

    /**
     * ����ups2OutputVoltage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUps2OutputVoltage(JAXBElement<String> value) {
        this.ups2OutputVoltage = value;
    }

    /**
     * ��ȡups2PowerStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getUps2PowerStatus() {
        return ups2PowerStatus;
    }

    /**
     * ����ups2PowerStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setUps2PowerStatus(DeviceStatus value) {
        this.ups2PowerStatus = value;
    }

}
