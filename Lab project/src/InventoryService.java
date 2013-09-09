import java.util.List;


public class InventoryService {

	public boolean checkInventoryProduct(Product product)
	{
		boolean result = false;
		if (product.getStockAmount() < product.getThresholdAmount()) result = true;
		return result;
	}
	
	public List<Product> getProductsFromDB()
	{
		return null;
		//TODO implement
	}

}
