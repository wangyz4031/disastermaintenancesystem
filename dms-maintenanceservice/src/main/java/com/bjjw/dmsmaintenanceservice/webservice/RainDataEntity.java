
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RainDataEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RainDataEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/CoreLib.Entity}DataEntity">
 *       &lt;sequence>
 *         &lt;element name="ContinuousRainfall" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CumulativeRainfall" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DayRainfall" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HourRainfall" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MinuteRainfall" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RainfallIntensity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TenMinuteRainfall" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RainDataEntity", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", propOrder = {
    "continuousRainfall",
    "cumulativeRainfall",
    "dayRainfall",
    "hourRainfall",
    "minuteRainfall",
    "rainfallIntensity",
    "tenMinuteRainfall"
})
public class RainDataEntity
    extends DataEntity
{

    @XmlElement(name = "ContinuousRainfall")
    protected Double continuousRainfall;
    @XmlElement(name = "CumulativeRainfall")
    protected Double cumulativeRainfall;
    @XmlElement(name = "DayRainfall")
    protected Double dayRainfall;
    @XmlElement(name = "HourRainfall")
    protected Double hourRainfall;
    @XmlElement(name = "MinuteRainfall")
    protected Double minuteRainfall;
    @XmlElement(name = "RainfallIntensity")
    protected Double rainfallIntensity;
    @XmlElement(name = "TenMinuteRainfall")
    protected Double tenMinuteRainfall;

    /**
     * ��ȡcontinuousRainfall���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContinuousRainfall() {
        return continuousRainfall;
    }

    /**
     * ����continuousRainfall���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContinuousRainfall(Double value) {
        this.continuousRainfall = value;
    }

    /**
     * ��ȡcumulativeRainfall���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCumulativeRainfall() {
        return cumulativeRainfall;
    }

    /**
     * ����cumulativeRainfall���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCumulativeRainfall(Double value) {
        this.cumulativeRainfall = value;
    }

    /**
     * ��ȡdayRainfall���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDayRainfall() {
        return dayRainfall;
    }

    /**
     * ����dayRainfall���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDayRainfall(Double value) {
        this.dayRainfall = value;
    }

    /**
     * ��ȡhourRainfall���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHourRainfall() {
        return hourRainfall;
    }

    /**
     * ����hourRainfall���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHourRainfall(Double value) {
        this.hourRainfall = value;
    }

    /**
     * ��ȡminuteRainfall���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinuteRainfall() {
        return minuteRainfall;
    }

    /**
     * ����minuteRainfall���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinuteRainfall(Double value) {
        this.minuteRainfall = value;
    }

    /**
     * ��ȡrainfallIntensity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRainfallIntensity() {
        return rainfallIntensity;
    }

    /**
     * ����rainfallIntensity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRainfallIntensity(Double value) {
        this.rainfallIntensity = value;
    }

    /**
     * ��ȡtenMinuteRainfall���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTenMinuteRainfall() {
        return tenMinuteRainfall;
    }

    /**
     * ����tenMinuteRainfall���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTenMinuteRainfall(Double value) {
        this.tenMinuteRainfall = value;
    }

}
