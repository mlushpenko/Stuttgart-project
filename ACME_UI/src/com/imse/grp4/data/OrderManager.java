package com.imse.grp4.data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OrderManager {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
	EntityManager em = emf.createEntityManager();

	public boolean creatOrder(Order order) {
		boolean created = false;
		try {
			em.getTransaction().begin();
			em.persist(order);
			Set<OrderItems> orderitems = order.getOrderedItems();

			for (OrderItems orderItems2 : orderitems) {

				orderItems2.setOrder(order);
				em.persist(orderItems2);
			}

			em.getTransaction().commit();
			created = true;
		} catch (Exception e) {
			created = false;
		}

		return created;
	}

	public Order getOrder(long accounid) {
		Order order = em.find(Order.class, accounid);
		return order;
	}

	public boolean updateOrder(Order order) {
		boolean updated = false;
		try {
			em.getTransaction().begin();
			Order orderold = em.find(Order.class, order.getOrderid());
			orderold.setProceed(order.isProceed());
			
			Set<OrderItems> orderitem = order.getOrderedItems();
			Set<OrderItems> orderitemsold = orderold.getOrderedItems();
			
			Set<OrderItems> removalSet = new HashSet<OrderItems>();
			
			for (OrderItems orderItems : orderitem) {
				if(isContains(orderitemsold,orderItems))
				{
					
				}else
				{
					orderitemsold.add(orderItems);
					System.out.println("Object being added");
				}
			}
			
			for (OrderItems orderItemsOld : orderitemsold) {
				
				orderItemsOld.setOrder(order);
				
				if(isContains(orderitem,orderItemsOld))
				{
					for (OrderItems orderItems : orderitem) {
					
						if(orderItemsOld.getProductid()==orderItems.getProductid())
						{
							orderItemsOld.setNumberofproduct(orderItems.getNumberofproduct());
						}
					}
					
				}else
				{
					try {
						removalSet.add(orderItemsOld);
						System.out.println("Object being Removed");
					} catch (Exception e) {
						System.out.println(e.toString());
					}
					
				}
			}
			
			
			orderitemsold.removeAll(removalSet);
			
	
			
			
			for (OrderItems orderItems : orderitemsold) {
				
				System.out.println(orderItems.getProductid());
			}
			
			
			orderold.setOrderedItems(orderitemsold);
			

			em.getTransaction().commit();
			updated = true;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return updated;

	}
	
	
	public boolean isContains(Set<OrderItems> items, OrderItems item)
	{
		boolean contain = false;
		
		for (OrderItems orderItems : items) {
			
			if(orderItems.getProductid()==item.getProductid())
			{
				contain= true;
			}
			
		}
		
		return contain;
		
	}
}
