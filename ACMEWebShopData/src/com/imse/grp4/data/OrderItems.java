package com.imse.grp4.data;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="orderitems_db")
public class OrderItems {

	@Id
	@Column(unique = true, nullable = false)
	private long orderitemsid;
	@Column(name="productid")
	private int productid;
	@Column(name="numberofproduct")
	private int numberofproduct;
	public long getOrderitemsid() {
		return orderitemsid;
	}
	public void setOrderitemsid(long orderitemsid) {
		this.orderitemsid = orderitemsid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getNumberofproduct() {
		return numberofproduct;
	}
	public void setNumberofproduct(int numberofproduct) {
		this.numberofproduct = numberofproduct;
	}
	
	@ManyToOne
	private Order order;
	
	
	
   
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
	

}
