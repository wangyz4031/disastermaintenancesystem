
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
 *         &lt;element name="D_HandleForeignMatterRelayStatusResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "dHandleForeignMatterRelayStatusResult"
})
@XmlRootElement(name = "D_HandleForeignMatterRelayStatusResponse")
public class DHandleForeignMatterRelayStatusResponse {

    @XmlElement(name = "D_HandleForeignMatterRelayStatusResult")
    protected Boolean dHandleForeignMatterRelayStatusResult;

    /**
     * ��ȡdHandleForeignMatterRelayStatusResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDHandleForeignMatterRelayStatusResult() {
        return dHandleForeignMatterRelayStatusResult;
    }

    /**
     * ����dHandleForeignMatterRelayStatusResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDHandleForeignMatterRelayStatusResult(Boolean value) {
        this.dHandleForeignMatterRelayStatusResult = value;
    }

}
