
package org.grp4.soc.imse.inventoryservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.grp4.soc.imse.inventoryservice package. 
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

    private final static QName _GetProductAvailability_QNAME = new QName("http://imse.soc.grp4.org/inventoryservice", "getProductAvailability");
    private final static QName _GetProductAvailabilityResponse_QNAME = new QName("http://imse.soc.grp4.org/inventoryservice", "getProductAvailabilityResponse");
    private final static QName _InvalidProductIdFault_QNAME = new QName("http://imse.soc.grp4.org/inventoryservice", "InvalidProductIdFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.grp4.soc.imse.inventoryservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductAvailability }
     * 
     */
    public GetProductAvailability createGetProductAvailability() {
        return new GetProductAvailability();
    }

    /**
     * Create an instance of {@link InvalidProductIdFault }
     * 
     */
    public InvalidProductIdFault createInvalidProductIdFault() {
        return new InvalidProductIdFault();
    }

    /**
     * Create an instance of {@link GetProductAvailabilityResponse }
     * 
     */
    public GetProductAvailabilityResponse createGetProductAvailabilityResponse() {
        return new GetProductAvailabilityResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductAvailability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imse.soc.grp4.org/inventoryservice", name = "getProductAvailability")
    public JAXBElement<GetProductAvailability> createGetProductAvailability(GetProductAvailability value) {
        return new JAXBElement<GetProductAvailability>(_GetProductAvailability_QNAME, GetProductAvailability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductAvailabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imse.soc.grp4.org/inventoryservice", name = "getProductAvailabilityResponse")
    public JAXBElement<GetProductAvailabilityResponse> createGetProductAvailabilityResponse(GetProductAvailabilityResponse value) {
        return new JAXBElement<GetProductAvailabilityResponse>(_GetProductAvailabilityResponse_QNAME, GetProductAvailabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidProductIdFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imse.soc.grp4.org/inventoryservice", name = "InvalidProductIdFault")
    public JAXBElement<InvalidProductIdFault> createInvalidProductIdFault(InvalidProductIdFault value) {
        return new JAXBElement<InvalidProductIdFault>(_InvalidProductIdFault_QNAME, InvalidProductIdFault.class, null, value);
    }

}
