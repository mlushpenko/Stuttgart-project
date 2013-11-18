package com.imse.grp4.data;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;
import javax.persistence.Table;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	/*	ProductManager pm = new ProductManager();
		Product p=	pm.getProductDetail(1);
		
		System.out.println("Getting Product Details");
		
		System.out.println("ProductName : "+p.getProductName() + "Product Price : " + p.getProductPrice() + "Stock : " + p.getStockAmount() );
		
	
		p.setStockAmount(150);
		
		pm.updateProductDetails(p);
		
		System.out.println("After Product Updated Product Details");
		
		System.out.println("Product Name : "+p.getProductName() + "Product Price : " + p.getProductPrice() + "Stock : " + p.getStockAmount() );
		
		
		ShoppingCard sc = new ShoppingCard();
		sc.setAccountid(1);
		BigInteger b = new BigInteger(256, new Random());
		Random generator = new Random();
		Integer randomIndex = generator.nextInt(256);
		sc.setCartid(randomIndex.longValue());
		
		CartItems ci = new CartItems();
		ci.setCart(sc);
		ci.setProductid(1);
		ci.setNumberofproduct(12);
		ci.setCartitemsid(new BigInteger(256, new Random()).longValue());
		
		CartItems ci1 = new CartItems();
		ci1.setCart(sc);
		ci1.setProductid(2);
		ci1.setNumberofproduct(8);
		ci1.setCartitemsid(new BigInteger(256, new Random()).longValue());
		
		CartItems ci2 = new CartItems();
		ci2.setCart(sc);
		ci2.setProductid(3);
		ci2.setNumberofproduct(1);
		ci2.setCartitemsid(new BigInteger(256, new Random()).longValue());
		sc.getCartItems().add(ci);
		sc.getCartItems().add(ci1);
		sc.getCartItems().add(ci2);
		
		ShoppingManager sm = new ShoppingManager();
		sm.createShoppingCart(sc);*/
		String[] ba= {"sds","sds"};
		String[] sa= {"sds","sds"};
		Shipment sh = new  Shipment(ba,sa);
		sh.setAccountid(1);
		sh.setOrderid(4);
		sh.setShipmentid(2);
		
		
		
		sh.setShipmentType("Express");
		
		ShipmentManager shm = new ShipmentManager();
		shm.createShipment(sh);
		
		
	}
          
}

