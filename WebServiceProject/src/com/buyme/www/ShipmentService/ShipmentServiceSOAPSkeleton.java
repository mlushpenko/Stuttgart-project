/**
 * ShipmentServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.buyme.www.ShipmentService;

public class ShipmentServiceSOAPSkeleton implements com.buyme.www.ShipmentService.ShipmentService_PortType, org.apache.axis.wsdl.Skeleton {
    private com.buyme.www.ShipmentService.ShipmentService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Weight"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ShipmentType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAdditionalCosts", _params, new javax.xml.namespace.QName("", "AdditionalCosts"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.buyme.com/ShipmentService/", "GetAdditionalCosts"));
        _oper.setSoapAction("http://www.buyme.com/ShipmentService/GetAdditionalCosts");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAdditionalCosts") == null) {
            _myOperations.put("getAdditionalCosts", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAdditionalCosts")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("fault2");
        _fault.setQName(new javax.xml.namespace.QName("", "NonpositiveWeightValue"));
        _fault.setClassName("com.buyme.www.ShipmentService.NonpositiveWeightValueFault");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("fault1");
        _fault.setQName(new javax.xml.namespace.QName("", "InvalidAddress"));
        _fault.setClassName("com.buyme.www.ShipmentService.InvalidAddressFault");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("fault");
        _fault.setQName(new javax.xml.namespace.QName("", "InvalidShipmentType"));
        _fault.setClassName("com.buyme.www.ShipmentService.InvalidShipmentTypeFault");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Weight"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ShipmentType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getDeliveryDate", _params, new javax.xml.namespace.QName("", "DeliveryDate"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.buyme.com/ShipmentService/", "GetDeliveryDate"));
        _oper.setSoapAction("http://www.buyme.com/ShipmentService/GetDeliveryDate");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getDeliveryDate") == null) {
            _myOperations.put("getDeliveryDate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getDeliveryDate")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("fault2");
        _fault.setQName(new javax.xml.namespace.QName("", "NonpositiveWeightValue"));
        _fault.setClassName("com.buyme.www.ShipmentService.NonpositiveWeightValueFault");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("fault1");
        _fault.setQName(new javax.xml.namespace.QName("", "InvalidAddress"));
        _fault.setClassName("com.buyme.www.ShipmentService.InvalidAddressFault");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("fault");
        _fault.setQName(new javax.xml.namespace.QName("", "InvalidShipmentType"));
        _fault.setClassName("com.buyme.www.ShipmentService.InvalidShipmentTypeFault");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
    }

    public ShipmentServiceSOAPSkeleton() {
        this.impl = new com.buyme.www.ShipmentService.ShipmentServiceSOAPImpl();
    }

    public ShipmentServiceSOAPSkeleton(com.buyme.www.ShipmentService.ShipmentService_PortType impl) {
        this.impl = impl;
    }
    public float getAdditionalCosts(java.lang.String address, float weight, int shipmentType) throws java.rmi.RemoteException, com.buyme.www.ShipmentService.NonpositiveWeightValueFault, com.buyme.www.ShipmentService.InvalidAddressFault, com.buyme.www.ShipmentService.InvalidShipmentTypeFault
    {
        float ret = impl.getAdditionalCosts(address, weight, shipmentType);
        return ret;
    }

    public java.util.Date getDeliveryDate(java.lang.String address, float weight, int shipmentType) throws java.rmi.RemoteException, com.buyme.www.ShipmentService.NonpositiveWeightValueFault, com.buyme.www.ShipmentService.InvalidAddressFault, com.buyme.www.ShipmentService.InvalidShipmentTypeFault
    {
        java.util.Date ret = impl.getDeliveryDate(address, weight, shipmentType);
        return ret;
    }

}
