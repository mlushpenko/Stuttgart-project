package com.imse.grp4.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shipment_db")
public class Shipment {
	
	@Id
	@Column(unique = true, nullable = false)
	private long shipmentid;
	
	@Column(name="shippingaddress")
	private String[] shippingAddress = null;
	@Column(name="billingaddress")
	private String[] billingAddress = null;
	
	@Column(name="shipmenttype")
	private String shipmentType;
	
	@Column(name="order_orderid")
	private long orderid;
	
	public long getOrderid() {
		return orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}

	public long getShipmentid() {
		return shipmentid;
	}

	public void setShipmentid(long shipmentid) {
		this.shipmentid = shipmentid;
	}

	public String[] getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String[] shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String[] getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String[] billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getShipmentType() {
		return shipmentType;
	}

	public void setShipmentType(String shipmentType) {
		this.shipmentType = shipmentType;
	}

	public long getAccountid() {
		return accountid;
	}

	public void setAccountid(long accountid) {
		this.accountid = accountid;
	}

	@Column(name="accountid")
	private long accountid;

	public Shipment(String[] shipAddress, String[] billAddress){
		shippingAddress = shipAddress;
		billingAddress = billAddress;
	}
	
	public Shipment()
	{
	}
	
	
}
