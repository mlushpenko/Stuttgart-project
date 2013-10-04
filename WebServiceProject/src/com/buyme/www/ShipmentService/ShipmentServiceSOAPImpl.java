/**
 * ShipmentServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.buyme.www.ShipmentService;

import java.util.Calendar;

public class ShipmentServiceSOAPImpl implements com.buyme.www.ShipmentService.ShipmentService_PortType{
	private static final float euroPerKg = (float) 0.9;
	private static final float euroPerKm = (float) 0.005;
	private static final float expressDeliveryMultiplier = (float) 2.2;
	private static final float weightLimit = 50;
	private static final int penaltyTime = 1;
	private static final int maxTravelTime = 14;
	private static final int regularDeliveryType = 1;
	private static final int expressDeliveryType = 2;
	private static final int expressDeliveryDenominator = 5;
	
    public float getAdditionalCosts(java.lang.String address, float weight, int shipmentType) throws java.rmi.RemoteException,
    com.buyme.www.ShipmentService.NonpositiveWeightValueFault, com.buyme.www.ShipmentService.InvalidAddressFault,
    com.buyme.www.ShipmentService.InvalidShipmentTypeFault {
    	
    	validateParameters(address, weight, shipmentType);
    	
        float distancePrice = getDistancePrice(address);
        float weightPrice = weight * euroPerKg;
        float price = distancePrice + weightPrice;
        // increase price for express delivery
        if (shipmentType == expressDeliveryType) return price * expressDeliveryMultiplier;
        else return price;
    }

    public java.util.Date getDeliveryDate(java.lang.String address, float weight, int shipmentType) throws java.rmi.RemoteException,
    com.buyme.www.ShipmentService.NonpositiveWeightValueFault, com.buyme.www.ShipmentService.InvalidAddressFault,
    com.buyme.www.ShipmentService.InvalidShipmentTypeFault {
    	
    	validateParameters(address, weight, shipmentType);
    	
    	Calendar date = Calendar.getInstance();
        
        // for heavy packages add some time to order special delivery service
        if (weight > weightLimit) date.add(Calendar.DAY_OF_MONTH, penaltyTime); 
        
        // get some random delivery time in days ( in real scenario it should depend on the address )
        int deliveryTime = (int) (Math.random()*maxTravelTime + 1);
        
        // set the delivery date depending on the shipment type
        if (shipmentType == expressDeliveryType){
        	int expressDeliveryTime = (int)((deliveryTime/expressDeliveryDenominator) + 1);
        	date.add(Calendar.DAY_OF_MONTH, expressDeliveryTime);
        } else {
        	date.add(Calendar.DAY_OF_MONTH, deliveryTime);
        }
        
        //convert Calendar object to Date object
        java.util.Date deliveryDate = new java.util.Date(date.getTimeInMillis());        
		return deliveryDate;
    }
    
    private float getDistancePrice(String address) {
    	// calculate some random distance
    	float distance = (float) (Math.random() * 4000);
    	return distance * euroPerKm;
	}
    
    private void validateParameters(java.lang.String address, float weight,
			int shipmentType) throws InvalidAddressFault,
			InvalidShipmentTypeFault, NonpositiveWeightValueFault {
		// address must consist at least of country, city, street, building
		if (address.split(" ").length < 4)
			throw new com.buyme.www.ShipmentService.InvalidAddressFault("Address must consist at least of country, city, street, building, separated by space.");
		
		// shipment type values must be only 1 (regular) or 2(express)
		if (!(shipmentType == regularDeliveryType || shipmentType == expressDeliveryType)) 
			throw new com.buyme.www.ShipmentService.InvalidShipmentTypeFault("Shipment type can be only 1 or 2");
		
		// weight must be more than 0
		if (!(weight > 0))
			throw new com.buyme.www.ShipmentService.NonpositiveWeightValueFault("Weight must be more than 0");
	}

}
