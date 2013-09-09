
public class DataExchangeManager {

	public static Account getAccount(String login, String password) {
		// TODO Get account from the db
		return null;
	}

	public static ShoppingCard getCard(long accountId) {
		// TODO Get user's shopping card, if any
		return null;
	}

	public static Order getOrder(long accountId) {
		// TODO get user's order, if any
		return null;
	}

	public static void saveCard(long accountId, ShoppingCard card) {
		// TODO Save user's card to db
	}

	public static void saveOrder(long accountId, Order order) {
		// TODO Save user's order to db
	}

}
