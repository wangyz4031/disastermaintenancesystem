
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RainSensorStatusEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RainSensorStatusEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/CoreLib.Entity}StatusEntity">
 *       &lt;sequence>
 *         &lt;element name="RainSensorCommStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceCommStatus" minOccurs="0"/>
 *         &lt;element name="RainSensorDeviceStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="RainSensorStatus" type="{http://schemas.datacontract.org/2004/07/CoreLib.Core}DeviceStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RainSensorStatusEntity", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", propOrder = {
    "rainSensorCommStatus",
    "rainSensorDeviceStatus",
    "rainSensorStatus"
})
public class RainSensorStatusEntity
    extends StatusEntity
{

    @XmlElement(name = "RainSensorCommStatus")
    @XmlSchemaType(name = "string")
    protected DeviceCommStatus rainSensorCommStatus;
    @XmlElement(name = "RainSensorDeviceStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus rainSensorDeviceStatus;
    @XmlElement(name = "RainSensorStatus")
    @XmlSchemaType(name = "string")
    protected DeviceStatus rainSensorStatus;

    /**
     * ��ȡrainSensorCommStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceCommStatus }
     *     
     */
    public DeviceCommStatus getRainSensorCommStatus() {
        return rainSensorCommStatus;
    }

    /**
     * ����rainSensorCommStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCommStatus }
     *     
     */
    public void setRainSensorCommStatus(DeviceCommStatus value) {
        this.rainSensorCommStatus = value;
    }

    /**
     * ��ȡrainSensorDeviceStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getRainSensorDeviceStatus() {
        return rainSensorDeviceStatus;
    }

    /**
     * ����rainSensorDeviceStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setRainSensorDeviceStatus(DeviceStatus value) {
        this.rainSensorDeviceStatus = value;
    }

    /**
     * ��ȡrainSensorStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getRainSensorStatus() {
        return rainSensorStatus;
    }

    /**
     * ����rainSensorStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setRainSensorStatus(DeviceStatus value) {
        this.rainSensorStatus = value;
    }

}
