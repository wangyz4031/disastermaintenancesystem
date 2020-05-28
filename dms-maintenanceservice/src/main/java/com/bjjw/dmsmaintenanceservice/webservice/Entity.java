
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
 * <p>Entity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Entity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BureauCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonitorPointCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonitorUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonitoringTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="WriteToDbTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", propOrder = {
    "bureauCode",
    "id",
    "lineCode",
    "lineName",
    "monitorPointCode",
    "monitorUnitCode",
    "monitoringTime",
    "writeToDbTimeStamp"
})
@XmlSeeAlso({
    CMDEntity.class,
    DataEntity.class,
    StatusEntity.class
})
public class Entity {

    @XmlElementRef(name = "BureauCode", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bureauCode;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "LineCode", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineCode;
    @XmlElementRef(name = "LineName", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineName;
    @XmlElementRef(name = "MonitorPointCode", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitorPointCode;
    @XmlElementRef(name = "MonitorUnitCode", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitorUnitCode;
    @XmlElement(name = "MonitoringTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar monitoringTime;
    @XmlElement(name = "WriteToDbTimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar writeToDbTimeStamp;

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
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
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
     * ��ȡlineName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineName() {
        return lineName;
    }

    /**
     * ����lineName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineName(JAXBElement<String> value) {
        this.lineName = value;
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
     * ��ȡmonitoringTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMonitoringTime() {
        return monitoringTime;
    }

    /**
     * ����monitoringTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMonitoringTime(XMLGregorianCalendar value) {
        this.monitoringTime = value;
    }

    /**
     * ��ȡwriteToDbTimeStamp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWriteToDbTimeStamp() {
        return writeToDbTimeStamp;
    }

    /**
     * ����writeToDbTimeStamp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWriteToDbTimeStamp(XMLGregorianCalendar value) {
        this.writeToDbTimeStamp = value;
    }

}
