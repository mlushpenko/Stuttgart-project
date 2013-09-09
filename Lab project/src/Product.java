import java.util.Date;


public class Product {
	private Date availabilityDate = null;
	private int stockAmount;
	private int productTypeID;
	private String productName = null;
	private String producerName = null;
	private float productWeight;
	private float pricePerItem;
	private int availabilityThreshold;
	
	public Product(int type, String name, String producer, float weight, float price, int treshold){
		productTypeID = type;
		producerName = name;
		producerName = producer;
		productWeight = weight;
		pricePerItem = price;
		availabilityThreshold = treshold;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public Date getAvailabilityDate() {
		availabilityDate = WebShop.getProductAvailabilityDate(this);
		return availabilityDate;
	}
	
	public int getThresholdAmount(){
		return availabilityThreshold;
	}
	
	
}
