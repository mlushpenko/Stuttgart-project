import java.util.Date;
import java.util.Hashtable;
import java.util.List;


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
		// TODO get the price from Shipment Service
		return 0;
	}

	public static void performPayment(float price) {
		// TODO Use messaging to send data to the Payment Service
		
	}

	public static Hashtable<Product, Integer> checkProductsAvailability() {
		// TODO get list of all products from the database, perform availability check and return  the list of products which need to be updated
		// connecting with DB should be implemented in the Inventory Service class
		return null;
	}
	
	private void performInventoryCheckBySchedule(){}

}
