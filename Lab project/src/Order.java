import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;


public class Order {
	private ArrayList<Product> itemsList = null;
	private Hashtable<Product, Integer> orderList = null;
	private Shipment shipment = null;
	private long orderId;
	
	public Order(ArrayList<Product> itemsList) {
		this.itemsList = itemsList;
		orderList = getOrders();
	}
	
	private Hashtable<Product, Integer> getOrders(){
		//TODO convert itemsList into hashtable like {"CD" => 5, "Car" => 10}
		return orderList;
	}
	
	private Hashtable<Product, Integer> removeItems(Product item, int amount){
		int orderedAmount = orderList.get(item).intValue();
		if(amount == orderedAmount){
			orderList.remove(item);
		} else {
			orderList.put(item, orderedAmount - amount);
		}
		return orderList;
	}
	
	private Hashtable<Product, Integer> limitOrder(){
		for (Product item:orderList.keySet()){
			int amount;
			if((amount = item.getStockAmount()) < orderList.get(item).intValue()){
				if (amount == 0){ orderList.remove(item);}
				else orderList.put(item, amount);
			}
		}
		return orderList;
	}
	
	private void cancelOrder(){
		itemsList.clear();
		orderList.clear();
	}
	
	// we call this method on Order instance after we fill addresses in browser like Order.addShipment()
	private void addShipment(Shipment ship){
		shipment = ship;
	}
	
	// returns shipment, and then we can get all addresses and shipment type price and date from this object
	private Shipment getShipmentInfo(){
		return shipment;
	}
	
	private void performPayment(){
		float price = calculateTotalPrice();
		WebShop.performPayment(price);
	}

	private float calculateTotalPrice() {
		// TODO add price of all items + price for the shipment
		return 0;
	}

}
