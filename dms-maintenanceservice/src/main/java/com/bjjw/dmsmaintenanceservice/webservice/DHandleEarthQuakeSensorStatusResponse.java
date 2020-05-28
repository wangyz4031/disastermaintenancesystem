
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
 *         &lt;element name="D_HandleEarthQuakeSensorStatusResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "dHandleEarthQuakeSensorStatusResult"
})
@XmlRootElement(name = "D_HandleEarthQuakeSensorStatusResponse")
public class DHandleEarthQuakeSensorStatusResponse {

    @XmlElement(name = "D_HandleEarthQuakeSensorStatusResult")
    protected Boolean dHandleEarthQuakeSensorStatusResult;

    /**
     * ��ȡdHandleEarthQuakeSensorStatusResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDHandleEarthQuakeSensorStatusResult() {
        return dHandleEarthQuakeSensorStatusResult;
    }

    /**
     * ����dHandleEarthQuakeSensorStatusResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDHandleEarthQuakeSensorStatusResult(Boolean value) {
        this.dHandleEarthQuakeSensorStatusResult = value;
    }

}
