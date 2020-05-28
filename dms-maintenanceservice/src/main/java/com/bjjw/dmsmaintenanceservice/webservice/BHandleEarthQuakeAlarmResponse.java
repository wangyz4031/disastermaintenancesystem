
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
 *         &lt;element name="B_HandleEarthQuakeAlarmResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "bHandleEarthQuakeAlarmResult"
})
@XmlRootElement(name = "B_HandleEarthQuakeAlarmResponse")
public class BHandleEarthQuakeAlarmResponse {

    @XmlElement(name = "B_HandleEarthQuakeAlarmResult")
    protected Boolean bHandleEarthQuakeAlarmResult;

    /**
     * ��ȡbHandleEarthQuakeAlarmResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBHandleEarthQuakeAlarmResult() {
        return bHandleEarthQuakeAlarmResult;
    }

    /**
     * ����bHandleEarthQuakeAlarmResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBHandleEarthQuakeAlarmResult(Boolean value) {
        this.bHandleEarthQuakeAlarmResult = value;
    }

}
