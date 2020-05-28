
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WindSensorStatusEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WindSensorStatusEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/CoreLib.Entity}StatusEntity">
 *       &lt;sequence>
 *         &lt;element name="WindSensor1CommStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceCommStatus" minOccurs="0"/>
 *         &lt;element name="WindSensor1DeviceStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="WindSensor1Status" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="WindSensor2CommStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceCommStatus" minOccurs="0"/>
 *         &lt;element name="WindSensor2DeviceStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="WindSensor2Status" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="WindSensorStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DoubleSensorStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindSensorStatusEntity", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", propOrder = {
    "windSensor1CommStatus",
    "windSensor1DeviceStatus",
    "windSensor1Status",
    "windSensor2CommStatus",
    "windSensor2DeviceStatus",
    "windSensor2Status",
    "windSensorStatus"
})
public class WindSensorStatusEntity
    extends StatusEntity
{

    @XmlElement(name = "WindSensor1CommStatus")
    @XmlSchemaType(name = "string")
    protected DeviceCommStatus windSensor1CommStatus;
    @XmlElement(name = "WindSensor1DeviceStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus windSensor1DeviceStatus;
    @XmlElement(name = "WindSensor1Status")
    @XmlSchemaType(name = "string")
    protected DeviceStatus windSensor1Status;
    @XmlElement(name = "WindSensor2CommStatus")
    @XmlSchemaType(name = "string")
    protected DeviceCommStatus windSensor2CommStatus;
    @XmlElement(name = "WindSensor2DeviceStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus windSensor2DeviceStatus;
    @XmlElement(name = "WindSensor2Status")
    @XmlSchemaType(name = "string")
    protected DeviceStatus windSensor2Status;
    @XmlElement(name = "WindSensorStatus")
    @XmlSchemaType(name = "string")
    protected DoubleSensorStatus windSensorStatus;

    /**
     * ��ȡwindSensor1CommStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceCommStatus }
     *     
     */
    public DeviceCommStatus getWindSensor1CommStatus() {
        return windSensor1CommStatus;
    }

    /**
     * ����windSensor1CommStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCommStatus }
     *     
     */
    public void setWindSensor1CommStatus(DeviceCommStatus value) {
        this.windSensor1CommStatus = value;
    }

    /**
     * ��ȡwindSensor1DeviceStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getWindSensor1DeviceStatus() {
        return windSensor1DeviceStatus;
    }

    /**
     * ����windSensor1DeviceStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setWindSensor1DeviceStatus(DeviceStatus value) {
        this.windSensor1DeviceStatus = value;
    }

    /**
     * ��ȡwindSensor1Status���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getWindSensor1Status() {
        return windSensor1Status;
    }

    /**
     * ����windSensor1Status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setWindSensor1Status(DeviceStatus value) {
        this.windSensor1Status = value;
    }

    /**
     * ��ȡwindSensor2CommStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceCommStatus }
     *     
     */
    public DeviceCommStatus getWindSensor2CommStatus() {
        return windSensor2CommStatus;
    }

    /**
     * ����windSensor2CommStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCommStatus }
     *     
     */
    public void setWindSensor2CommStatus(DeviceCommStatus value) {
        this.windSensor2CommStatus = value;
    }

    /**
     * ��ȡwindSensor2DeviceStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getWindSensor2DeviceStatus() {
        return windSensor2DeviceStatus;
    }

    /**
     * ����windSensor2DeviceStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setWindSensor2DeviceStatus(DeviceStatus value) {
        this.windSensor2DeviceStatus = value;
    }

    /**
     * ��ȡwindSensor2Status���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getWindSensor2Status() {
        return windSensor2Status;
    }

    /**
     * ����windSensor2Status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setWindSensor2Status(DeviceStatus value) {
        this.windSensor2Status = value;
    }

    /**
     * ��ȡwindSensorStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DoubleSensorStatus }
     *     
     */
    public DoubleSensorStatus getWindSensorStatus() {
        return windSensorStatus;
    }

    /**
     * ����windSensorStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleSensorStatus }
     *     
     */
    public void setWindSensorStatus(DoubleSensorStatus value) {
        this.windSensorStatus = value;
    }

}
