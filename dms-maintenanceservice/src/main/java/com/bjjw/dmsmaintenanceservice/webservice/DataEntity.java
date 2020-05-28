
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DataEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DataEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/CoreLib.Entity}Entity">
 *       &lt;sequence>
 *         &lt;element name="BureauName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataType" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}MonitorDataType" minOccurs="0"/>
 *         &lt;element name="DataValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DataValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Km" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MonitorUnitKm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MonitorUnitMeter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataEntity", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", propOrder = {
    "bureauName",
    "dataType",
    "dataValid",
    "dataValue",
    "km",
    "level",
    "meter",
    "monitorUnitKm",
    "monitorUnitMeter",
    "speed"
})
@XmlSeeAlso({
    SnowDataEntity.class,
    RainDataEntity.class,
    WindDataEntity.class
})
public class DataEntity
    extends Entity
{

    @XmlElementRef(name = "BureauName", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bureauName;
    @XmlElement(name = "DataType")
    @XmlSchemaType(name = "string")
    protected MonitorDataType dataType;
    @XmlElement(name = "DataValid")
    protected Boolean dataValid;
    @XmlElement(name = "DataValue")
    protected Double dataValue;
    @XmlElement(name = "Km")
    protected Integer km;
    @XmlElementRef(name = "Level", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> level;
    @XmlElement(name = "Meter")
    protected Integer meter;
    @XmlElement(name = "MonitorUnitKm")
    protected Integer monitorUnitKm;
    @XmlElement(name = "MonitorUnitMeter")
    protected Integer monitorUnitMeter;
    @XmlElementRef(name = "Speed", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> speed;

    /**
     * ��ȡbureauName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBureauName() {
        return bureauName;
    }

    /**
     * ����bureauName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBureauName(JAXBElement<String> value) {
        this.bureauName = value;
    }

    /**
     * ��ȡdataType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MonitorDataType }
     *     
     */
    public MonitorDataType getDataType() {
        return dataType;
    }

    /**
     * ����dataType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorDataType }
     *     
     */
    public void setDataType(MonitorDataType value) {
        this.dataType = value;
    }

    /**
     * ��ȡdataValid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataValid() {
        return dataValid;
    }

    /**
     * ����dataValid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataValid(Boolean value) {
        this.dataValid = value;
    }

    /**
     * ��ȡdataValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDataValue() {
        return dataValue;
    }

    /**
     * ����dataValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDataValue(Double value) {
        this.dataValue = value;
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
     * ��ȡlevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLevel() {
        return level;
    }

    /**
     * ����level���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLevel(JAXBElement<String> value) {
        this.level = value;
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
     * ��ȡmonitorUnitKm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonitorUnitKm() {
        return monitorUnitKm;
    }

    /**
     * ����monitorUnitKm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonitorUnitKm(Integer value) {
        this.monitorUnitKm = value;
    }

    /**
     * ��ȡmonitorUnitMeter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonitorUnitMeter() {
        return monitorUnitMeter;
    }

    /**
     * ����monitorUnitMeter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonitorUnitMeter(Integer value) {
        this.monitorUnitMeter = value;
    }

    /**
     * ��ȡspeed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpeed() {
        return speed;
    }

    /**
     * ����speed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpeed(JAXBElement<String> value) {
        this.speed = value;
    }

}
