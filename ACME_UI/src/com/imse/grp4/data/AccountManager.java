package com.imse.grp4.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AccountManager {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
    EntityManager em = emf.createEntityManager();
	
	public boolean createAccount(Account account)
	{
		boolean created= false;
		try {
			em.getTransaction().begin();          
            em.persist(account);
             
            em.getTransaction().commit();
            created = true;
		} catch (Exception e) {
			created = false;
		}
		
		return created;
	}
	
	public boolean updateAccount(Account accountupdated)
	{
		boolean updated=false;
		Account account = em.find(Account.class, accountupdated.getAccountID());
        
   	 try {
   		     em.getTransaction().begin();
   		     account.setPhoneNumber(accountupdated.getPhoneNumber());
   	        
   	         em.getTransaction().commit();
   	         updated=true;
   	        
		} catch (Exception e) {
			// TODO: handle exception
		}
   	 
   	 return updated;
	}
	
	public Account getAccountDetails(long accountID)
	{
		Account account= null;
    	try {
    		
    		account = em.find(Account.class, accountID);
    		
		} catch (Exception e) {
			// TODO: handle exception
		}
    	 
    	return account;
	}
	
	public Account getProductDetail(String email, String password)
    {
		Query q = em.createQuery("SELECT p FROM Account p WHERE p.password = '"+password+"'AND p.email='"+email+"'");
		List results = (List)q.getResultList();
    	    return (Account) results.get(0);
    }
    
	
	

}
