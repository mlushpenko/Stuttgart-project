/**
 * NonpositiveWeightValueFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.buyme.www.ShipmentService;

public class NonpositiveWeightValueFault extends org.apache.axis.AxisFault {
    public java.lang.String nonpositiveWeightValue;
    public java.lang.String getNonpositiveWeightValue() {
        return this.nonpositiveWeightValue;
    }

    public NonpositiveWeightValueFault() {
    }

    public NonpositiveWeightValueFault(java.lang.Exception target) {
        super(target);
    }

    public NonpositiveWeightValueFault(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public NonpositiveWeightValueFault(java.lang.String nonpositiveWeightValue) {
        this.nonpositiveWeightValue = nonpositiveWeightValue;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, nonpositiveWeightValue);
    }
}
