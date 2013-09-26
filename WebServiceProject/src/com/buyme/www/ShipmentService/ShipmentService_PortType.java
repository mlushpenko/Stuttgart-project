/**
 * ShipmentService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.buyme.www.ShipmentService;

public interface ShipmentService_PortType extends java.rmi.Remote {
    public float getAdditionalCosts(java.lang.String address, float weight, int shipmentType) throws java.rmi.RemoteException, com.buyme.www.ShipmentService.NonpositiveWeightValueFault, com.buyme.www.ShipmentService.InvalidAddressFault, com.buyme.www.ShipmentService.InvalidShipmentTypeFault;
    public java.util.Date getDeliveryDate(java.lang.String address, float weight, int shipmentType) throws java.rmi.RemoteException, com.buyme.www.ShipmentService.NonpositiveWeightValueFault, com.buyme.www.ShipmentService.InvalidAddressFault, com.buyme.www.ShipmentService.InvalidShipmentTypeFault;
}
