
package com.cantero.quickbooks.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="closeConnectionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "closeConnectionResult"
})
@XmlRootElement(name = "closeConnectionResponse")
public class CloseConnectionResponse {

    protected String closeConnectionResult;

    /**
     * Gets the value of the closeConnectionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseConnectionResult() {
        return closeConnectionResult;
    }

    /**
     * Sets the value of the closeConnectionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseConnectionResult(String value) {
        this.closeConnectionResult = value;
    }

}
