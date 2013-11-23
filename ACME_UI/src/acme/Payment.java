
package acme;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="cardnumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cvc" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "orderid",
    "name",
    "address",
    "amount",
    "cardnumber",
    "cvc"
})
@XmlRootElement(name = "payment")
public class Payment {

    protected int orderid;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String address;
    protected float amount;
    protected long cardnumber;
    protected int cvc;

    /**
     * Gets the value of the orderid property.
     * 
     */
    public int getOrderid() {
        return orderid;
    }

    /**
     * Sets the value of the orderid property.
     * 
     */
    public void setOrderid(int value) {
        this.orderid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(float value) {
        this.amount = value;
    }

    /**
     * Gets the value of the cardnumber property.
     * 
     */
    public long getCardnumber() {
        return cardnumber;
    }

    /**
     * Sets the value of the cardnumber property.
     * 
     */
    public void setCardnumber(long value) {
        this.cardnumber = value;
    }

    /**
     * Gets the value of the cvc property.
     * 
     */
    public int getCvc() {
        return cvc;
    }

    /**
     * Sets the value of the cvc property.
     * 
     */
    public void setCvc(int value) {
        this.cvc = value;
    }

}
