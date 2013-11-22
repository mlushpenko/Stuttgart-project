package com.imse.grp4.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="product_db")
public class Product {
	
	
	@Id
	@Column(unique = true, nullable = false)
	private int id;
	@Column(name="availabilitydate")
	private Date availabilityDate = null;
	@Column(name="stockamount")
	private int stockAmount;
	//	@Column(name="")
	//private int productTypeID;
	@Column(name="productname")
	private String productName = null;
	@Column(name="producername")
	private String producerName = null;
	@Column(name="productweight")
	private float productWeight;
	@Column(name="productprice")
	private float productPrice;
	
	
	
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getAvailabilityDate() {
		return availabilityDate;
	}
	public void setAvailabilityDate(Date availabilityDate) {
		this.availabilityDate = availabilityDate;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	/*public int getProductTypeID() {
		return productTypeID;
	}
	public void setProductTypeID(int productTypeID) {
		this.productTypeID = productTypeID;
	}*/
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProducerName() {
		return producerName;
	}
	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
	public float getProductWeight() {
		return productWeight;
	}
	public void setProductWeight(float productWeight) {
		this.productWeight = productWeight;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	
	
}
