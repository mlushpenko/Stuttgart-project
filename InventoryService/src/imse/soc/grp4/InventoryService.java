package imse.soc.grp4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(targetNamespace = "http://imse.soc.grp4.org/inventoryservice")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class InventoryService {
	private final static int SPECIAL_CODE = 123456789;
	private final static int RESUPPLY_AMOUNT = 50;

	public String getProductAvailability(int productId)
			throws InvalidProductIdFault {
		if (productId > SPECIAL_CODE) {
			int realID = productId - SPECIAL_CODE;
			InventoryDetails inventory = new InventoryDetails("UPDATE product_db SET stockamount = stockamount +" + RESUPPLY_AMOUNT +" WHERE id =" + realID);
			//reset inventory object
			inventory = new InventoryDetails();
			String stock = inventory.getInventoryDetails(realID);
			return stock;
		} else if (productId < 1 || productId > 1000) {
			throw new InvalidProductIdFault("Product Not Exist");
		} else {
			Integer ProductId = productId;

			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			String productavailability = "none";
			System.out.println(productavailability);
			/*
			 * if (productId % 2 == 0) { productavailability =
			 * ProductId.toString(); } else { Calendar cal =
			 * Calendar.getInstance();
			 * 
			 * cal.add(Calendar.DATE, productId);
			 * 
			 * productavailability = dateFormat.format(cal.getTime());
			 * 
			 * }
			 */

			InventoryDetails inventoryDetails = new InventoryDetails();
			productavailability = inventoryDetails
					.getInventoryDetails(productId);
			System.out.println(productavailability);

			return productavailability;
		}
	}
}
