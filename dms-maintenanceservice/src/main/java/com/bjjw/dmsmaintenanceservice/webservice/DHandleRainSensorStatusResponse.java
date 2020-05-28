
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="D_HandleRainSensorStatusResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dHandleRainSensorStatusResult"
})
@XmlRootElement(name = "D_HandleRainSensorStatusResponse")
public class DHandleRainSensorStatusResponse {

    @XmlElement(name = "D_HandleRainSensorStatusResult")
    protected Boolean dHandleRainSensorStatusResult;

    /**
     * ��ȡdHandleRainSensorStatusResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDHandleRainSensorStatusResult() {
        return dHandleRainSensorStatusResult;
    }

    /**
     * ����dHandleRainSensorStatusResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDHandleRainSensorStatusResult(Boolean value) {
        this.dHandleRainSensorStatusResult = value;
    }

}
