import java.util.Date;
import java.util.Hashtable;


public class ShipmentType {
	private int type;
	private String name = null;
	private float additionalCosts;
	private Date shipmentDate = null;
	
	public ShipmentType(int type, String name){
		this.type = type;
		this.name = name;
	}
	private Date getShipmentDate(Hashtable<Product, Integer> products){
		//TODO return the shipment date
		shipmentDate = WebShop.getShipmentDate(products, type);
		return shipmentDate;
	}
	
	private float getAddionalCosts(Hashtable<Product, Integer> products){
		additionalCosts = WebShop.getShipmentPrice(products, type);
		return additionalCosts;
	}
}
