package com.imse.grp4.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cartitems_db")
public class CartItems {

	@Id
	@Column(unique = true, nullable = false)
	private long cartitemsid;
	@Column(name="productid")
	private int productid;
	public long getCartitemsid() {
		return cartitemsid;
	}

	public void setCartitemsid(long cartitemsid) {
		this.cartitemsid = cartitemsid;
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

	public ShoppingCard getCart() {
		return cart;
	}

	public void setCart(ShoppingCard cart) {
		this.cart = cart;
	}

	@Column(name="numberofproduct")
	private int numberofproduct;
	
	@ManyToOne
	private ShoppingCard cart;
}
