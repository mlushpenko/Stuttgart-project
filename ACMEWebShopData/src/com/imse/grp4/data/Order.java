package com.imse.grp4.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table(name="order_db")
public class Order {

	@Id
	@Column(unique = true, nullable = false)
	private long orderid;
	
	
	public long getOrderid() {
		return orderid;
	}


	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}


	public long getAccountid() {
		return accountid;
	}


	public void setAccountid(long accountid) {
		this.accountid = accountid;
	}


	public boolean isProceed() {
		return isProceed;
	}


	public void setProceed(boolean isProceed) {
		this.isProceed = isProceed;
	}


	public Date getDateordered() {
		return dateordered;
	}


	public void setDateordered(Date dateordered) {
		this.dateordered = dateordered;
	}


	public Set<OrderItems> getOrderedItems() {
		return orderedItems;
	}


	public void setOrderedItems(Set<OrderItems> orderedItems) {
		this.orderedItems = orderedItems;
	}


	@Column(name="accountid")
	private long accountid;
	@Column(name="isproceed")
	private boolean isProceed;
	@Column(name="dateordered")
	private Date dateordered;
	
	@OneToMany(mappedBy="order",orphanRemoval=true,cascade = CascadeType.ALL)
	@LazyCollection (LazyCollectionOption.FALSE)
	private Set<OrderItems> orderedItems = new HashSet<OrderItems>(0);
	
	
	
	
}
