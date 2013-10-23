/**
 * SOAPPaymentService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.buyme.www.SOAPPaymentService;

public class SOAPPaymentService_ServiceLocator extends org.apache.axis.client.Service implements com.buyme.www.SOAPPaymentService.SOAPPaymentService_Service {

    public SOAPPaymentService_ServiceLocator() {
    }


    public SOAPPaymentService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SOAPPaymentService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SOAPPaymentServiceSOAP
    private java.lang.String SOAPPaymentServiceSOAP_address = "http://www.buyme.com/";

    public java.lang.String getSOAPPaymentServiceSOAPAddress() {
        return SOAPPaymentServiceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SOAPPaymentServiceSOAPWSDDServiceName = "SOAPPaymentServiceSOAP";

    public java.lang.String getSOAPPaymentServiceSOAPWSDDServiceName() {
        return SOAPPaymentServiceSOAPWSDDServiceName;
    }

    public void setSOAPPaymentServiceSOAPWSDDServiceName(java.lang.String name) {
        SOAPPaymentServiceSOAPWSDDServiceName = name;
    }

    public com.buyme.www.SOAPPaymentService.SOAPPaymentService_PortType getSOAPPaymentServiceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SOAPPaymentServiceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSOAPPaymentServiceSOAP(endpoint);
    }

    public com.buyme.www.SOAPPaymentService.SOAPPaymentService_PortType getSOAPPaymentServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.buyme.www.SOAPPaymentService.SOAPPaymentStub _stub = new com.buyme.www.SOAPPaymentService.SOAPPaymentStub(portAddress, this);
            _stub.setPortName(getSOAPPaymentServiceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSOAPPaymentServiceSOAPEndpointAddress(java.lang.String address) {
        SOAPPaymentServiceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.buyme.www.SOAPPaymentService.SOAPPaymentService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.buyme.www.SOAPPaymentService.SOAPPaymentStub _stub = new com.buyme.www.SOAPPaymentService.SOAPPaymentStub(new java.net.URL(SOAPPaymentServiceSOAP_address), this);
                _stub.setPortName(getSOAPPaymentServiceSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SOAPPaymentServiceSOAP".equals(inputPortName)) {
            return getSOAPPaymentServiceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.buyme.com/SOAPPaymentService/", "SOAPPaymentService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.buyme.com/SOAPPaymentService/", "SOAPPaymentServiceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SOAPPaymentServiceSOAP".equals(portName)) {
            setSOAPPaymentServiceSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
