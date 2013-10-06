package payment.service;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

@Stateless
@Path("payment")
public class PaymentService {

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
	public void doPayment(
			@QueryParam("address") String address,
			@QueryParam("name") String name,
			@QueryParam("amount") float amount,
			@QueryParam("card_number") long cardnumber,
			@QueryParam("cvc_code") int cvccode) throws JMSException {

		Connection connection = connectionFactory.createConnection();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		MessageProducer messageProducer = session.createProducer(queue);

		connection.start();
		MapMessage message = session.createMapMessage();
		message.setString("address", address);
		message.setString("name", name);
		message.setFloat("amount", amount);
		message.setLong("card_number", cardnumber);
		message.setInt("cvc_code", cvccode);
		messageProducer.send(message);
		connection.close();
	}

}