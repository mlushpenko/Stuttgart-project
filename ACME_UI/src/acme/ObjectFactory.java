
package acme;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the acme package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: acme
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link ShipmentResponse }
     * 
     */
    public ShipmentResponse createShipmentResponse() {
        return new ShipmentResponse();
    }

    /**
     * Create an instance of {@link AcmeRequest }
     * 
     */
    public AcmeRequest createAcmeRequest() {
        return new AcmeRequest();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link PaymentResponse }
     * 
     */
    public PaymentResponse createPaymentResponse() {
        return new PaymentResponse();
    }

    /**
     * Create an instance of {@link Shipment }
     * 
     */
    public Shipment createShipment() {
        return new Shipment();
    }

    /**
     * Create an instance of {@link AcmeResponse }
     * 
     */
    public AcmeResponse createAcmeResponse() {
        return new AcmeResponse();
    }

}
