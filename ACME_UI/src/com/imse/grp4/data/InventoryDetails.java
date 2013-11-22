package com.imse.grp4.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class InventoryDetails {

	private final static String JDBC_URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String JDBC_USERNAME = "postgres";
	private final static String JDBC_PASSWORD = "niranjana@5l";

	public String getInventoryDetails(int productId) {

		String available = "";

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME,JDBC_PASSWORD);

			Statement stmt = null;

			stmt = conn.createStatement();

			String strSelect = "select * from product_db where id=" + productId;

			ResultSet rset = null;

			rset = stmt.executeQuery(strSelect);

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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return String.valueOf(available);

	}
}