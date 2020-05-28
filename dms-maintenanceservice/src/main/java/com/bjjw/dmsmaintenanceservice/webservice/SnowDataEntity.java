
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SnowDataEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SnowDataEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/CoreLib.Entity}DataEntity">
 *       &lt;sequence>
 *         &lt;element name="ActualSnowDepth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BenchMarkSnowDepth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SnowDepth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnowDataEntity", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", propOrder = {
    "actualSnowDepth",
    "benchMarkSnowDepth",
    "snowDepth"
})
public class SnowDataEntity
    extends DataEntity
{

    @XmlElement(name = "ActualSnowDepth")
    protected Double actualSnowDepth;
    @XmlElement(name = "BenchMarkSnowDepth")
    protected Double benchMarkSnowDepth;
    @XmlElement(name = "SnowDepth")
    protected Double snowDepth;

    /**
     * ��ȡactualSnowDepth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualSnowDepth() {
        return actualSnowDepth;
    }

    /**
     * ����actualSnowDepth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualSnowDepth(Double value) {
        this.actualSnowDepth = value;
    }

    /**
     * ��ȡbenchMarkSnowDepth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBenchMarkSnowDepth() {
        return benchMarkSnowDepth;
    }

    /**
     * ����benchMarkSnowDepth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBenchMarkSnowDepth(Double value) {
        this.benchMarkSnowDepth = value;
    }

    /**
     * ��ȡsnowDepth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSnowDepth() {
        return snowDepth;
    }

    /**
     * ����snowDepth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSnowDepth(Double value) {
        this.snowDepth = value;
    }

}
