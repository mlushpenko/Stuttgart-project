package imse.soc.grp4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class InventoryDetails {

	private final static String JDBC_URL = "jdbc:postgresql://129.69.214.67:5432/webshop";
//	private final static String JDBC_URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String JDBC_USERNAME = "postgres";
	private final static String JDBC_PASSWORD = "max123";

	public String getInventoryDetails(int productId) throws InvalidProductIdFault {

		String available = "";
 
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
				throw new InvalidProductIdFault("Product Not Exist");
				} else
				{
			
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
			// TODO Auto-generated catch block
		//	System.out.println(e.toString());
			
			
			available=e.toString();
			
			e.printStackTrace();
		}

		return String.valueOf(available);

	}
}