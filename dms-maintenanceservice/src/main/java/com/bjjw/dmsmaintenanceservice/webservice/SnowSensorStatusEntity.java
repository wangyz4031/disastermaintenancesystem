
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SnowSensorStatusEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SnowSensorStatusEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/CoreLib.Entity}StatusEntity">
 *       &lt;sequence>
 *         &lt;element name="SnowSensorCommStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceCommStatus" minOccurs="0"/>
 *         &lt;element name="SnowSensorDeviceStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="SnowSensorStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnowSensorStatusEntity", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", propOrder = {
    "snowSensorCommStatus",
    "snowSensorDeviceStatus",
    "snowSensorStatus"
})
public class SnowSensorStatusEntity
    extends StatusEntity
{

    @XmlElement(name = "SnowSensorCommStatus")
    @XmlSchemaType(name = "string")
    protected DeviceCommStatus snowSensorCommStatus;
    @XmlElement(name = "SnowSensorDeviceStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus snowSensorDeviceStatus;
    @XmlElement(name = "SnowSensorStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus snowSensorStatus;

    /**
     * ��ȡsnowSensorCommStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceCommStatus }
     *     
     */
    public DeviceCommStatus getSnowSensorCommStatus() {
        return snowSensorCommStatus;
    }

    /**
     * ����snowSensorCommStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCommStatus }
     *     
     */
    public void setSnowSensorCommStatus(DeviceCommStatus value) {
        this.snowSensorCommStatus = value;
    }

    /**
     * ��ȡsnowSensorDeviceStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getSnowSensorDeviceStatus() {
        return snowSensorDeviceStatus;
    }

    /**
     * ����snowSensorDeviceStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setSnowSensorDeviceStatus(DeviceStatus value) {
        this.snowSensorDeviceStatus = value;
    }

    /**
     * ��ȡsnowSensorStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getSnowSensorStatus() {
        return snowSensorStatus;
    }

    /**
     * ����snowSensorStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setSnowSensorStatus(DeviceStatus value) {
        this.snowSensorStatus = value;
    }

}
