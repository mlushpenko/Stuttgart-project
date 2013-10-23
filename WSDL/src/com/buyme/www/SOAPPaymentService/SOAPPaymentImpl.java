/**
 * SOAPPaymentImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.buyme.www.SOAPPaymentService;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.representation.Form;

public class SOAPPaymentImpl implements
		com.buyme.www.SOAPPaymentService.SOAPPaymentService_PortType {
	public java.lang.String doPayment(java.lang.String address,
			java.lang.String name, float amount, long card_number, int cvc_code)
			throws java.rmi.RemoteException {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		Form form = new Form();
		form.add("address", address);
		form.add("name", name);
		form.add("amount", amount);
		form.add("card_number", card_number);
		form.add("cvc_code", cvc_code);
		ClientResponse response = service.path("rest").path("payment")
				.path("doPayment").type(MediaType.APPLICATION_FORM_URLENCODED)
				.post(ClientResponse.class, form);
		return response.getEntity(String.class);
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/PaymentService")
				.build();
	}

}
