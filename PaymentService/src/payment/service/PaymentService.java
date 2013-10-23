package payment.service;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import payment.service.model.PaymentResult;

@Stateless
@Path("payment")
public class PaymentService {
	private static final String SUCCESS = "success";

	// = connection factorie's JNDI name
	@Resource(mappedName = "jms/OrderConnectionFactory")
	private ConnectionFactory connectionFactory;

	// = Queue's JNDI name
	@Resource(mappedName = "jms/OrderProcessingQueue")
	private Queue queue;

	public PaymentService() {
	}

	@POST
	@Path("/doPayment")
	public PaymentResult doPayment(@FormParam("address") String address,
			@FormParam("name") String name, @FormParam("amount") float amount,
			@FormParam("card_number") long cardnumber,
			@FormParam("cvc_code") int cvccode) throws JMSException {

		Connection connection = connectionFactory.createConnection();
		Session session = connection.createSession(false,
				Session.AUTO_ACKNOWLEDGE);
		MessageProducer messageProducer = session.createProducer(queue);

		PaymentResult xmlResult = new PaymentResult();
		xmlResult.setName(name);
		xmlResult.setCardnumber(cardnumber);
		xmlResult.setAmount(amount);

		String validation = validatePayment(address, name, amount, cardnumber,
				cvccode);
		if (validation == SUCCESS) {
			connection.start();
			MapMessage message = session.createMapMessage();
			message.setString("address", address);
			message.setString("name", name);
			message.setFloat("amount", amount);
			message.setLong("card_number", cardnumber);
			message.setInt("cvc_code", cvccode);
			messageProducer.send(message);
			connection.close();

			xmlResult.setResult("Payment is successful");

		} else
			xmlResult.setResult(validation);

		return xmlResult;
	}

	private String validatePayment(String address, String name, float amount,
			long cardnumber, int cvccode) {
		// TODO Do some validation for parameters
		return "success";
	}

}