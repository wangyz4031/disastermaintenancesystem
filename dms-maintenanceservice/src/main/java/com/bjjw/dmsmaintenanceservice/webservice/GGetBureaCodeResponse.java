
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="G_GetBureaCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "gGetBureaCodeResult"
})
@XmlRootElement(name = "G_GetBureaCodeResponse")
public class GGetBureaCodeResponse {

    @XmlElementRef(name = "G_GetBureaCodeResult", namespace = "http:/DST_V2/AccessBus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gGetBureaCodeResult;

    /**
     * ��ȡgGetBureaCodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGGetBureaCodeResult() {
        return gGetBureaCodeResult;
    }

    /**
     * ����gGetBureaCodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGGetBureaCodeResult(JAXBElement<String> value) {
        this.gGetBureaCodeResult = value;
    }

}
