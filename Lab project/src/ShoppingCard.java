import java.util.ArrayList;


public class ShoppingCard {
	private ArrayList<Product> itemsList = null;
	
	private void addItem(Product item){
		itemsList= new ArrayList<Product>();
		itemsList.add(item);
	}
	
	private void cleanCard(){
		itemsList.clear();
	}
	
	private Order checkOut(){
		Order order = new Order(itemsList);
		cleanCard();
		return order;
	}
	
	public boolean isEmpty(){
		if (itemsList.size() > 0) return false;
		else return true;
	}

}
