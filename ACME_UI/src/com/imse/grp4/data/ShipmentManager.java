package com.imse.grp4.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ShipmentManager {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
    EntityManager em = emf.createEntityManager();
    
    
	public boolean createShipment(Shipment shipment)
	{
		boolean created= false;
		try {
			em.getTransaction().begin();          
            em.persist(shipment);
             
            em.getTransaction().commit();
            created = true;
		} catch (Exception e) {
			created = false;
		}
		
		return created;
	}
	
	

}
