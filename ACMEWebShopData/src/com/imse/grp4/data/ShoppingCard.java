package com.imse.grp4.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="shoppingcart_db")
public class ShoppingCard {
	
	@Id
	@Column(unique = true, nullable = false)
	private long cartid;
	
	public long getCartid() {
		return cartid;
	}

	public void setCartid(long cartid) {
		this.cartid = cartid;
	}

	public long getAccountid() {
		return accountid;
	}

	public void setAccountid(long accountid) {
		this.accountid = accountid;
	}

	public Set<CartItems> getCartItems() {
		return cartItems;
	}

	public void setCartItems(Set<CartItems> cartItems) {
		this.cartItems = cartItems;
	}

	@Column(name="accountid")
	private long accountid;

	@OneToMany(mappedBy="cart")
	private Set<CartItems> cartItems = new HashSet<CartItems>(0);

}
