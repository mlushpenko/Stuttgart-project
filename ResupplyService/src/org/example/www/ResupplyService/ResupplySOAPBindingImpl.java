/**
 * ResupplySOAPBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.ResupplyService;

import org.example.www.ResupplyService.InventoryDetails;

import org.grp4.soc.imse.inventoryservice.InvalidProductIdFault_Exception;
import org.grp4.soc.imse.inventoryservice.InventoryServiceService;

public class ResupplySOAPBindingImpl implements
		org.example.www.ResupplyService.ResupplyServiceSOAPPort {
	private static final InventoryServiceService SERVICE = new InventoryServiceService();

	public int enquire(int productID) throws java.rmi.RemoteException {
		int stockAmount = 0;
		try {
			String result = SERVICE.getInventoryServicePort()
					.getProductAvailability(productID);
			stockAmount = Integer.parseInt(result);
		} catch (InvalidProductIdFault_Exception e) {
			e.printStackTrace();
		} catch (NumberFormatException e1) {
		}
		return stockAmount;
	}

	public boolean resupply(int productID, int amount)
			throws java.rmi.RemoteException {
		int stockAmount = enquire(productID);
		if (stockAmount >= amount){
			InventoryDetails inventory = new InventoryDetails("UPDATE product_db SET stockamount = stockamount -" + amount +" WHERE id =" + productID);
			return true;
		}else
			return false;
	}

	public float getPrice(int productID) throws java.rmi.RemoteException {
		InventoryQuery query = new InventoryQuery();
		return query.getInventoryDetails(productID);
	}

}
