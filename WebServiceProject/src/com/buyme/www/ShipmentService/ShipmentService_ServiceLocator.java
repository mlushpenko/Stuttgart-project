/**
 * ShipmentService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.buyme.www.ShipmentService;

public class ShipmentService_ServiceLocator extends org.apache.axis.client.Service implements com.buyme.www.ShipmentService.ShipmentService_Service {

    public ShipmentService_ServiceLocator() {
    }


    public ShipmentService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ShipmentService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ShipmentServiceSOAP
    private java.lang.String ShipmentServiceSOAP_address = "http://www.buyme.com/";

    public java.lang.String getShipmentServiceSOAPAddress() {
        return ShipmentServiceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ShipmentServiceSOAPWSDDServiceName = "ShipmentServiceSOAP";

    public java.lang.String getShipmentServiceSOAPWSDDServiceName() {
        return ShipmentServiceSOAPWSDDServiceName;
    }

    public void setShipmentServiceSOAPWSDDServiceName(java.lang.String name) {
        ShipmentServiceSOAPWSDDServiceName = name;
    }

    public com.buyme.www.ShipmentService.ShipmentService_PortType getShipmentServiceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ShipmentServiceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getShipmentServiceSOAP(endpoint);
    }

    public com.buyme.www.ShipmentService.ShipmentService_PortType getShipmentServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.buyme.www.ShipmentService.ShipmentServiceSOAPStub _stub = new com.buyme.www.ShipmentService.ShipmentServiceSOAPStub(portAddress, this);
            _stub.setPortName(getShipmentServiceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setShipmentServiceSOAPEndpointAddress(java.lang.String address) {
        ShipmentServiceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.buyme.www.ShipmentService.ShipmentService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.buyme.www.ShipmentService.ShipmentServiceSOAPStub _stub = new com.buyme.www.ShipmentService.ShipmentServiceSOAPStub(new java.net.URL(ShipmentServiceSOAP_address), this);
                _stub.setPortName(getShipmentServiceSOAPWSDDServiceName());
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
        if ("ShipmentServiceSOAP".equals(inputPortName)) {
            return getShipmentServiceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.buyme.com/ShipmentService/", "ShipmentService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.buyme.com/ShipmentService/", "ShipmentServiceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ShipmentServiceSOAP".equals(portName)) {
            setShipmentServiceSOAPEndpointAddress(address);
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