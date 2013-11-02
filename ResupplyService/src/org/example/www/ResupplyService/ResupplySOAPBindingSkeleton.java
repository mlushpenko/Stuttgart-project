/**
 * ResupplySOAPBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.ResupplyService;

public class ResupplySOAPBindingSkeleton implements org.example.www.ResupplyService.ResupplyServiceSOAPPort, org.apache.axis.wsdl.Skeleton {
    private org.example.www.ResupplyService.ResupplyServiceSOAPPort impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("enquire", _params, new javax.xml.namespace.QName("", "stockAmount"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/ResupplyService/", "enquire"));
        _oper.setSoapAction("http://www.example.org/ResupplyService/enquire");
        _myOperationsList.add(_oper);
        if (_myOperations.get("enquire") == null) {
            _myOperations.put("enquire", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("enquire")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("resupply", _params, new javax.xml.namespace.QName("", "result"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/ResupplyService/", "resupply"));
        _oper.setSoapAction("http://www.example.org/ResupplyService/resupply");
        _myOperationsList.add(_oper);
        if (_myOperations.get("resupply") == null) {
            _myOperations.put("resupply", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("resupply")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPrice", _params, new javax.xml.namespace.QName("", "price"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/ResupplyService/", "getPrice"));
        _oper.setSoapAction("http://www.example.org/ResupplyService/getPrice");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPrice") == null) {
            _myOperations.put("getPrice", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPrice")).add(_oper);
    }

    public ResupplySOAPBindingSkeleton() {
        this.impl = new org.example.www.ResupplyService.ResupplySOAPBindingImpl();
    }

    public ResupplySOAPBindingSkeleton(org.example.www.ResupplyService.ResupplyServiceSOAPPort impl) {
        this.impl = impl;
    }
    public int enquire(int productID) throws java.rmi.RemoteException
    {
        int ret = impl.enquire(productID);
        return ret;
    }

    public boolean resupply(int productID, int amount) throws java.rmi.RemoteException
    {
        boolean ret = impl.resupply(productID, amount);
        return ret;
    }

    public float getPrice(int productID) throws java.rmi.RemoteException
    {
        float ret = impl.getPrice(productID);
        return ret;
    }

}
