package payment.service.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Payment Result")
@XmlType(propOrder = { "name", "cardnumber", "amount", "result" })
public class PaymentResult {
	private String name;
	private float amount;
	private long cardnumber;
	private String result;

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@XmlElement
	public long getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}

	@XmlElement
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
