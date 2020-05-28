
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CMDEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CMDEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/CoreLib.Entity}Entity">
 *       &lt;sequence>
 *         &lt;element name="BastationKm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BastationMeter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CMDType" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}CMDType" minOccurs="0"/>
 *         &lt;element name="Km" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Meter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MonitorUnitAIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonitorUnitBIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMDEntity", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", propOrder = {
    "bastationKm",
    "bastationMeter",
    "cmdType",
    "km",
    "meter",
    "monitorUnitAIP",
    "monitorUnitBIP"
})
public class CMDEntity
    extends Entity
{

    @XmlElement(name = "BastationKm")
    protected Integer bastationKm;
    @XmlElement(name = "BastationMeter")
    protected Integer bastationMeter;
    @XmlElement(name = "CMDType")
    @XmlSchemaType(name = "string")
    protected CMDType cmdType;
    @XmlElement(name = "Km")
    protected Integer km;
    @XmlElement(name = "Meter")
    protected Integer meter;
    @XmlElementRef(name = "MonitorUnitAIP", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitorUnitAIP;
    @XmlElementRef(name = "MonitorUnitBIP", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitorUnitBIP;

    /**
     * ��ȡbastationKm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBastationKm() {
        return bastationKm;
    }

    /**
     * ����bastationKm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBastationKm(Integer value) {
        this.bastationKm = value;
    }

    /**
     * ��ȡbastationMeter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBastationMeter() {
        return bastationMeter;
    }

    /**
     * ����bastationMeter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBastationMeter(Integer value) {
        this.bastationMeter = value;
    }

    /**
     * ��ȡcmdType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CMDType }
     *     
     */
    public CMDType getCMDType() {
        return cmdType;
    }

    /**
     * ����cmdType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CMDType }
     *     
     */
    public void setCMDType(CMDType value) {
        this.cmdType = value;
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
     * ��ȡmonitorUnitAIP���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonitorUnitAIP() {
        return monitorUnitAIP;
    }

    /**
     * ����monitorUnitAIP���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonitorUnitAIP(JAXBElement<String> value) {
        this.monitorUnitAIP = value;
    }

    /**
     * ��ȡmonitorUnitBIP���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonitorUnitBIP() {
        return monitorUnitBIP;
    }

    /**
     * ����monitorUnitBIP���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonitorUnitBIP(JAXBElement<String> value) {
        this.monitorUnitBIP = value;
    }

}
