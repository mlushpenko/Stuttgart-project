
public class Customer {
	private Account account = null;
	private ShoppingCard card = null;
	private Order order = null;
	private boolean hasAccount = false;
	
	public Customer(Account account){
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public boolean getHasAccount() {
		return hasAccount;
	}

	public void setHasAccount(boolean hasAccount) {
		this.hasAccount = hasAccount;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public ShoppingCard getCard() {
		return card;
	}

	public void setCard(ShoppingCard card) {
		this.card = card;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	};
	
}
