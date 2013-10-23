/**
 * SOAPPaymentService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.buyme.www.SOAPPaymentService;

public interface SOAPPaymentService_PortType extends java.rmi.Remote {
    public java.lang.String doPayment(java.lang.String address, java.lang.String name, float amount, long card_number, int cvc_code) throws java.rmi.RemoteException;
}
