/**
 * ResupplyServiceSOAPPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.ResupplyService;

public interface ResupplyServiceSOAPPort extends java.rmi.Remote {
    public int enquire(int productID) throws java.rmi.RemoteException;
    public boolean resupply(int productID, int amount) throws java.rmi.RemoteException;
    public float getPrice(int productID) throws java.rmi.RemoteException;
}
