
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WindDataEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WindDataEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/CoreLib.Entity}DataEntity">
 *       &lt;sequence>
 *         &lt;element name="WindDirection" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WindDirection1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WindDirection2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WindSpeed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WindSpeed1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WindSpeed2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindDataEntity", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", propOrder = {
    "windDirection",
    "windDirection1",
    "windDirection2",
    "windSpeed",
    "windSpeed1",
    "windSpeed2"
})
public class WindDataEntity
    extends DataEntity
{

    @XmlElement(name = "WindDirection")
    protected Double windDirection;
    @XmlElement(name = "WindDirection1")
    protected Double windDirection1;
    @XmlElement(name = "WindDirection2")
    protected Double windDirection2;
    @XmlElement(name = "WindSpeed")
    protected Double windSpeed;
    @XmlElement(name = "WindSpeed1")
    protected Double windSpeed1;
    @XmlElement(name = "WindSpeed2")
    protected Double windSpeed2;

    /**
     * ��ȡwindDirection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWindDirection() {
        return windDirection;
    }

    /**
     * ����windDirection���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWindDirection(Double value) {
        this.windDirection = value;
    }

    /**
     * ��ȡwindDirection1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWindDirection1() {
        return windDirection1;
    }

    /**
     * ����windDirection1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWindDirection1(Double value) {
        this.windDirection1 = value;
    }

    /**
     * ��ȡwindDirection2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWindDirection2() {
        return windDirection2;
    }

    /**
     * ����windDirection2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWindDirection2(Double value) {
        this.windDirection2 = value;
    }

    /**
     * ��ȡwindSpeed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWindSpeed() {
        return windSpeed;
    }

    /**
     * ����windSpeed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWindSpeed(Double value) {
        this.windSpeed = value;
    }

    /**
     * ��ȡwindSpeed1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWindSpeed1() {
        return windSpeed1;
    }

    /**
     * ����windSpeed1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWindSpeed1(Double value) {
        this.windSpeed1 = value;
    }

    /**
     * ��ȡwindSpeed2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWindSpeed2() {
        return windSpeed2;
    }

    /**
     * ����windSpeed2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWindSpeed2(Double value) {
        this.windSpeed2 = value;
    }

}
