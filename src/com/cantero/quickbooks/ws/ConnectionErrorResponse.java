
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
 *         &lt;element name="connectionErrorResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "connectionErrorResult"
})
@XmlRootElement(name = "connectionErrorResponse")
public class ConnectionErrorResponse {

    protected String connectionErrorResult;

    /**
     * Gets the value of the connectionErrorResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionErrorResult() {
        return connectionErrorResult;
    }

    /**
     * Sets the value of the connectionErrorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionErrorResult(String value) {
        this.connectionErrorResult = value;
    }

}
