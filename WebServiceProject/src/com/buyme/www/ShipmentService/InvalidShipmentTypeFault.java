/**
 * InvalidShipmentTypeFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.buyme.www.ShipmentService;

public class InvalidShipmentTypeFault extends org.apache.axis.AxisFault {
    public java.lang.String invalidShipmentType;
    public java.lang.String getInvalidShipmentType() {
        return this.invalidShipmentType;
    }

    public InvalidShipmentTypeFault() {
    }

    public InvalidShipmentTypeFault(java.lang.Exception target) {
        super(target);
    }

    public InvalidShipmentTypeFault(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public InvalidShipmentTypeFault(java.lang.String invalidShipmentType) {
        this.invalidShipmentType = invalidShipmentType;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, invalidShipmentType);
    }
}
