
public class Customer {
	private Account account = null;
	private ShoppingCard card = null;
	private Order order = null;
	private boolean hasAccount = false;
	
	public Customer(){}

	private Account getAccount() {
		return account;
	}

	private void setAccount(Account account) {
		this.account = account;
	}

	private ShoppingCard getCard() {
		return card;
	}

	private void setCard(ShoppingCard card) {
		this.card = card;
	}

	private Order getOrder() {
		return order;
	}

	private void setOrder(Order order) {
		this.order = order;
	};
	
}
