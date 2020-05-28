
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>StatusEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StatusEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/CoreLib.Entity}Entity">
 *       &lt;sequence>
 *         &lt;element name="AlarmConfirmTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AlarmDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlarmResumeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AlarmStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Km" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Meter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sensorType" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}SensorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusEntity", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", propOrder = {
    "alarmConfirmTime",
    "alarmDes",
    "alarmResumeTime",
    "alarmStartTime",
    "km",
    "meter",
    "sensorType"
})
@XmlSeeAlso({
    MonitorUnitDeviceStatusEntity.class,
    WindSensorStatusEntity.class,
    SnowSensorStatusEntity.class,
    RainSensorStatusEntity.class
})
public class StatusEntity
    extends Entity
{

    @XmlElement(name = "AlarmConfirmTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alarmConfirmTime;
    @XmlElementRef(name = "AlarmDes", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alarmDes;
    @XmlElement(name = "AlarmResumeTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alarmResumeTime;
    @XmlElement(name = "AlarmStartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alarmStartTime;
    @XmlElement(name = "Km")
    protected Integer km;
    @XmlElement(name = "Meter")
    protected Integer meter;
    @XmlSchemaType(name = "string")
    protected SensorType sensorType;

    /**
     * ��ȡalarmConfirmTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlarmConfirmTime() {
        return alarmConfirmTime;
    }

    /**
     * ����alarmConfirmTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlarmConfirmTime(XMLGregorianCalendar value) {
        this.alarmConfirmTime = value;
    }

    /**
     * ��ȡalarmDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlarmDes() {
        return alarmDes;
    }

    /**
     * ����alarmDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlarmDes(JAXBElement<String> value) {
        this.alarmDes = value;
    }

    /**
     * ��ȡalarmResumeTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlarmResumeTime() {
        return alarmResumeTime;
    }

    /**
     * ����alarmResumeTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlarmResumeTime(XMLGregorianCalendar value) {
        this.alarmResumeTime = value;
    }

    /**
     * ��ȡalarmStartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlarmStartTime() {
        return alarmStartTime;
    }

    /**
     * ����alarmStartTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlarmStartTime(XMLGregorianCalendar value) {
        this.alarmStartTime = value;
    }

    /**
     * ��ȡkm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKm() {
        return km;
    }

    /**
     * ����km���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKm(Integer value) {
        this.km = value;
    }

    /**
     * ��ȡmeter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeter() {
        return meter;
    }

    /**
     * ����meter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeter(Integer value) {
        this.meter = value;
    }

    /**
     * ��ȡsensorType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SensorType }
     *     
     */
    public SensorType getSensorType() {
        return sensorType;
    }

    /**
     * ����sensorType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SensorType }
     *     
     */
    public void setSensorType(SensorType value) {
        this.sensorType = value;
    }

}
