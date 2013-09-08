import java.util.Date;
import java.util.Hashtable;


public class WebShop {

	public static Date getProductAvailabilityDate(Product item) {
		return null;
		// TODO get availability date of product from Inventory Service	
	}

	public static Date getShipmentDate(Hashtable<Product, Integer> products, int type) {
		// TODO get shipment date from Shipment Service
		return null;
	}

	public static float getShipmentPrice(Hashtable<Product, Integer> products, int type) {
		return 0;
	}

	public static void performPayment(float price) {
		// TODO Use messaging to send data to the Payment Service
		
	}

}
