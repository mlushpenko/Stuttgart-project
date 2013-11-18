package com.imse.grp4.data;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ShoppingManager {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
    EntityManager em = emf.createEntityManager();
	
	public boolean createShoppingCart(ShoppingCard shoppingcart)
	{

		boolean created= false;
		try {
			em.getTransaction().begin();     
			em.persist(shoppingcart);
			Set<CartItems> cartitems = shoppingcart.getCartItems();

			for (CartItems cartitem : cartitems) {

				cartitem.setCart(shoppingcart);
				em.persist(cartitem);
			}
             
            em.getTransaction().commit();
            created = true;
		} catch (Exception e) {
			created = false;
		}
		
		return created;
	}

}
