import java.util.Hashtable;
import java.util.List;


public class ResupplyService {
	//TODO Need to call Inventory service Method to get the inventory of the product -results will be a number 
		//Input parameters - ProductObject we need to find the inventory- (or can be product id)
		//Output parameters- Number of product exist
		public int checkInventoryProduct(Product product)
		{
			return 0;
		}
		//TODO Need to call Inventory service to check what are the products in out of stock or met the threshold value;--- Results will be List of Product object
		//Input parameters -
		//Output Parameters - List<Product> - list of products which are not available or met the threshold 
		public List<Product> checkInventory()
		{
			return null;
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
