/**
 * ResupplyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.ResupplyService;

public class ResupplyServiceLocator extends org.apache.axis.client.Service implements org.example.www.ResupplyService.ResupplyService {

    public ResupplyServiceLocator() {
    }


    public ResupplyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ResupplyServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ResupplyServiceSOAPPort
    private java.lang.String ResupplyServiceSOAPPort_address = "http://localhost:8080/ResupplyService";

    public java.lang.String getResupplyServiceSOAPPortAddress() {
        return ResupplyServiceSOAPPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ResupplyServiceSOAPPortWSDDServiceName = "ResupplyServiceSOAPPort";

    public java.lang.String getResupplyServiceSOAPPortWSDDServiceName() {
        return ResupplyServiceSOAPPortWSDDServiceName;
    }

    public void setResupplyServiceSOAPPortWSDDServiceName(java.lang.String name) {
        ResupplyServiceSOAPPortWSDDServiceName = name;
    }

    public org.example.www.ResupplyService.ResupplyServiceSOAPPort getResupplyServiceSOAPPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ResupplyServiceSOAPPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getResupplyServiceSOAPPort(endpoint);
    }

    public org.example.www.ResupplyService.ResupplyServiceSOAPPort getResupplyServiceSOAPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.ResupplyService.ResupplySOAPBindingStub _stub = new org.example.www.ResupplyService.ResupplySOAPBindingStub(portAddress, this);
            _stub.setPortName(getResupplyServiceSOAPPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setResupplyServiceSOAPPortEndpointAddress(java.lang.String address) {
        ResupplyServiceSOAPPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.ResupplyService.ResupplyServiceSOAPPort.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.ResupplyService.ResupplySOAPBindingStub _stub = new org.example.www.ResupplyService.ResupplySOAPBindingStub(new java.net.URL(ResupplyServiceSOAPPort_address), this);
                _stub.setPortName(getResupplyServiceSOAPPortWSDDServiceName());
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
        if ("ResupplyServiceSOAPPort".equals(inputPortName)) {
            return getResupplyServiceSOAPPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/ResupplyService/", "ResupplyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/ResupplyService/", "ResupplyServiceSOAPPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ResupplyServiceSOAPPort".equals(portName)) {
            setResupplyServiceSOAPPortEndpointAddress(address);
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
