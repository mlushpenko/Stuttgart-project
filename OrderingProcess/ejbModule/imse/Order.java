package imse;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Message-Driven Bean implementation class for: Order
 */
@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/OrderProcessingQueue"),
		@ActivationConfigProperty(propertyName = "connectionFactoryLookup", propertyValue = "jms/OrderConnectionFactory") }, mappedName = "jms/OrderProcessingQueue")
public class Order implements MessageListener {

	public Order() {
	}

	public void onMessage(Message message) {
		try {
			MapMessage paymentInfo = (MapMessage) message;
			System.out.print("Dear Mr." + paymentInfo.getString("name")
					+ "!/n " + paymentInfo.getFloat("amount")
					+ " euros were successfuly withdrawn from you account #"
					+ paymentInfo.getLong("card_number")
					+ "/n Stay stupid, we love you!");
		} catch (JMSException e) {
			e.printStackTrace();
		}

	}

}
