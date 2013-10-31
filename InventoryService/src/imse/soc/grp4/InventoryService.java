package imse.soc.grp4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(targetNamespace = "http://imse.soc.grp4.org/inventoryservice")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class InventoryService {

	public String getProductAvailability(int productId)
			throws InvalidProductIdFault {
		if (productId < 1 || productId > 1000) {
			throw new InvalidProductIdFault("Product Not Exist");
		} else {
			Integer ProductId = productId;

			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			String productavailability ="none";
			System.out.println(productavailability);
/*			if (productId % 2 == 0) {
				productavailability = ProductId.toString();
			} else {
				Calendar cal = Calendar.getInstance();

				cal.add(Calendar.DATE, productId);

				productavailability = dateFormat.format(cal.getTime());

			}*/
			
			InventoryDetails inventoryDetails = new InventoryDetails();
			productavailability =	inventoryDetails.getInventoryDetails(productId);
			System.out.println(productavailability);

			return productavailability;
		}
	}
}
