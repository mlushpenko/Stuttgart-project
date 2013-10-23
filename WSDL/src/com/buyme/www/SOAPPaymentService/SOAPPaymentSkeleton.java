/**
 * SOAPPaymentSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.buyme.www.SOAPPaymentService;

public class SOAPPaymentSkeleton implements com.buyme.www.SOAPPaymentService.SOAPPaymentService_PortType, org.apache.axis.wsdl.Skeleton {
    private com.buyme.www.SOAPPaymentService.SOAPPaymentService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "card_number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cvc_code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("doPayment", _params, new javax.xml.namespace.QName("", "PaymentResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.buyme.com/SOAPPaymentService/", "doPayment"));
        _oper.setSoapAction("http://www.buyme.com/SOAPPaymentService/doPayment");
        _myOperationsList.add(_oper);
        if (_myOperations.get("doPayment") == null) {
            _myOperations.put("doPayment", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("doPayment")).add(_oper);
    }

    public SOAPPaymentSkeleton() {
        this.impl = new com.buyme.www.SOAPPaymentService.SOAPPaymentImpl();
    }

    public SOAPPaymentSkeleton(com.buyme.www.SOAPPaymentService.SOAPPaymentService_PortType impl) {
        this.impl = impl;
    }
    public java.lang.String doPayment(java.lang.String address, java.lang.String name, float amount, long card_number, int cvc_code) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.doPayment(address, name, amount, card_number, cvc_code);
        return ret;
    }

}
