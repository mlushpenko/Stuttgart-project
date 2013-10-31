package com.imse.grp4.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/*
 * This class is for All the functions related to Product table- Update, Insert, Query
 * 
 * 
 */

public class ProductManager {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
    EntityManager em = emf.createEntityManager();
    
    /*
     * 
     * Method to get details of the product usinf productId
     * 
     * 
     */
    
    
    public Product getProductDetail(int productId)
    {
    	Product product= null;
    	try {
    		
    		product = em.find(Product.class, productId);
    		
		} catch (Exception e) {
			// TODO: handle exception
		}
    	 
    	return product;
    }
    /*
     * Method to Update product- specifically stock amount 
     */
    
    public boolean updateProductDetails(Product updateproduct)
    {
    	boolean updated=false;
    	 Product product = em.find(Product.class, updateproduct.getId());
         
    	 try {
    		     em.getTransaction().begin();
    	         product.setStockAmount(updateproduct.getStockAmount());
    	         product.setAvailabilityDate(updateproduct.getAvailabilityDate());
    	         em.getTransaction().commit();
    	         updated=true;
    	        
		} catch (Exception e) {
			// TODO: handle exception
		}
    	 
    	 return updated;
       
    }
    

}
