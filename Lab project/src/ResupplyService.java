import java.util.Hashtable;
import java.util.List;


public class ResupplyService {

		//TODO Need to call Inventory service to check what are the products in out of stock or met the threshold value;--- Results will be List of Product object
		//Input parameters -
		//Output Parameters - List<Product> - list of products which are not available or met the threshold 
		public void checkInventory()
		{
			Hashtable<Product, Integer> outOfStockItems = WebShop.checkProductsAvailability();
			if (outOfStockItems.size() > 0) buyOutOfStockItems(outOfStockItems);
		
		}
		//TODO need to Call inventory service to sell items to other webshops
		// Inputs - {product, Number of items to sell }- Eg {productA, 5}
		// Output void -
		public void sellItems(Hashtable<Product, Integer> products)
		{
			
		}
		
		//TODO need to Call inventory service to buy products to make the stock back
		// Inputs - {product, Number of items to sell }- Eg {productA, 5}
		// Output void -
		public void buyOutOfStockItems(Hashtable<Product, Integer> products)
		{
			
		}
}
