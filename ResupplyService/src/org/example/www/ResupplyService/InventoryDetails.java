package org.example.www.ResupplyService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.grp4.soc.imse.inventoryservice.InvalidProductIdFault;
import org.grp4.soc.imse.inventoryservice.InvalidProductIdFault_Exception;

public class InventoryDetails {

	private final static String JDBC_URL = "jdbc:postgresql://129.69.214.67:5432/webshop";
	// private final static String JDBC_URL =
	// "jdbc:postgresql://localhost:5432/postgres";
	private final static String JDBC_USERNAME = "postgres";
	private final static String JDBC_PASSWORD = "max123";
	private Connection conn = null;
	private ResultSet rset = null;

	public InventoryDetails() {
		// empty constructor should be used for getInventoryService() method
		// because we expect result set to be product with specific ID
		// what is done in getInventoryService() method
	}

	public InventoryDetails(String query) {
		connectToDb(query);
	}

	private void connectToDb(String query) {
		try {
			Class.forName("org.postgresql.Driver");

			conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME,
					JDBC_PASSWORD);

			Statement stmt = conn.createStatement();

			rset = stmt.executeQuery(query);
		} catch (ClassNotFoundException e1) {
			System.out.println("Exception while connection the driver");
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String getInventoryDetails(int productId)
			throws InvalidProductIdFault_Exception {

		String available = "";
		if (conn == null && rset == null) {
			connectToDb("select * from product_db where id=" + productId);
		}

		try {

			if (!rset.isBeforeFirst()) {
				throw new InvalidProductIdFault_Exception("Product Not Exist", new InvalidProductIdFault());
			} else {

				while (rset.next()) {

					int availableitems = rset.getInt("stockamount");
					Date availabledate = rset.getDate("availabilitydate");
					int threshold = rset.getInt("stockthreshold");

					if (availableitems > threshold) {
						available = String.valueOf(availableitems);
					} else {
						available = String.valueOf(availabledate);
					}

				}
			}
		} catch (SQLException e) {

			available = e.toString();

			e.printStackTrace();
		}

		return String.valueOf(available);

	}
}