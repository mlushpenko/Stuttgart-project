package org.example.www.ResupplyService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class InventoryQuery {
	
	
	private final static String JDBC_URL = "jdbc:postgresql://129.69.214.67:5432/webshop";
//	private final static String JDBC_URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String JDBC_USERNAME = "postgres";
	private final static String JDBC_PASSWORD = "max123";
	
	
	public float getInventoryDetails(int productId){

		float priceof = 0;
 
	    try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				
				System.out.println("Exception while connection the driver");
				
				e1.printStackTrace();
			}		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME,JDBC_PASSWORD);

			Statement stmt = null;

			stmt = conn.createStatement();

			String strSelect = "select * from product_db where id=" + productId;

			ResultSet rset = null;

			rset = stmt.executeQuery(strSelect);

			if (!rset.isBeforeFirst() ) {    
				return priceof;
				} else
				{
			
			while (rset.next()) {
		
				priceof = rset.getFloat("productprice");
			
			}
				}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return priceof;

	}
}