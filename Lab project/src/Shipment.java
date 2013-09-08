
public class Shipment {
	private ShipmentType shipmentType;
	private String[] shippingAddress = null;
	private String[] billingAddress = null;
	private boolean isSameAddress = false;
	
	public Shipment(String[] shipAddress, String[] billAddress){
		shippingAddress = shipAddress;
		billingAddress = billAddress;
	}
	
	public ShipmentType getShipmentType() {
		return shipmentType;
	}
	
	// we call it to set the Selected shipment type by customer like Order.getShipment.setShipmentType()
	public void setShipmentType(ShipmentType shipmentType) {
		this.shipmentType = shipmentType;
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
	
	public boolean isSameAddress() {
		return isSameAddress;
	}
	
	public void setSameAddress(boolean isSameAddress) {
		this.isSameAddress = isSameAddress;
	}
	
}
