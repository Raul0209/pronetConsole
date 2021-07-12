
package com.balding.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoCambioRangoMonedaResult" type="{http://www.banguat.gob.gt/variables/ws/}DataVariable" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipoCambioRangoMonedaResult"
})
@XmlRootElement(name = "TipoCambioRangoMonedaResponse")
public class TipoCambioRangoMonedaResponse {

    @XmlElement(name = "TipoCambioRangoMonedaResult")
    protected DataVariable tipoCambioRangoMonedaResult;

    /**
     * Gets the value of the tipoCambioRangoMonedaResult property.
     * 
     * @return
     *     possible object is
     *     {@link DataVariable }
     *     
     */
    public DataVariable getTipoCambioRangoMonedaResult() {
        return tipoCambioRangoMonedaResult;
    }

    /**
     * Sets the value of the tipoCambioRangoMonedaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataVariable }
     *     
     */
    public void setTipoCambioRangoMonedaResult(DataVariable value) {
        this.tipoCambioRangoMonedaResult = value;
    }

}
