/**
 * InvalidAddressFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.buyme.www.ShipmentService;

public class InvalidAddressFault extends org.apache.axis.AxisFault {
    public java.lang.String invalidAddress;
    public java.lang.String getInvalidAddress() {
        return this.invalidAddress;
    }

    public InvalidAddressFault() {
    }

    public InvalidAddressFault(java.lang.Exception target) {
        super(target);
    }

    public InvalidAddressFault(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public InvalidAddressFault(java.lang.String invalidAddress) {
        this.invalidAddress = invalidAddress;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, invalidAddress);
    }
}
