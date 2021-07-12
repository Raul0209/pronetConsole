
package com.balding.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Var complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Var"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="venta" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="compra" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Var", propOrder = {
    "moneda",
    "fecha",
    "venta",
    "compra"
})
public class Var {

    protected int moneda;
    protected String fecha;
    protected float venta;
    protected float compra;

    /**
     * Gets the value of the moneda property.
     * 
     */
    public int getMoneda() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     * 
     */
    public void setMoneda(int value) {
        this.moneda = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the venta property.
     * 
     */
    public float getVenta() {
        return venta;
    }

    /**
     * Sets the value of the venta property.
     * 
     */
    public void setVenta(float value) {
        this.venta = value;
    }

    /**
     * Gets the value of the compra property.
     * 
     */
    public float getCompra() {
        return compra;
    }

    /**
     * Sets the value of the compra property.
     * 
     */
    public void setCompra(float value) {
        this.compra = value;
    }

}
