public class SessionManager {
  
	public static Session Login(String login, String password, Session session){
		// get current user
		Customer user = session.getUser();
		Account userAccount = DataExchangeManager.getAccount(login, password);
		// if credentials are valid - we connect this user with his account
		if (!userAccount.equals(null)){
			user.setAccount(userAccount);
			user.setHasAccount(true);
			long accountId = user.getAccount().getAcoountID();
			ShoppingCard card = DataExchangeManager.getCard(accountId);
			Order order = DataExchangeManager.getOrder(accountId); 
			user = setCardOrOrder(user, card, order);
		} 
		// update the user data for this session, the user will be the same one
		// if credentials are worng
		session.setUser(user);
		return session;
	}

	private static Customer setCardOrOrder(Customer user, ShoppingCard card,
			Order order) {
		// if the user has some order from the previous
		// login - we override current oder and clean shopping card
		// else - if card is empty, we load card from account, if any
		if (!(order.equals(null))){
			user.setCard(null);
			user.setOrder(order);
		} else if (user.getCard().isEmpty()){
			user.setCard(card);
			user.setOrder(null);
		}
		return user;
	}
	
	public static Session logOut(Session session){
		Customer user = session.getUser();
		long accountId = user.getAccount().getAcoountID();
		// save card or order to db
		DataExchangeManager.saveCard(accountId, user.getCard());
		DataExchangeManager.saveOrder(accountId, user.getOrder());
		// reset the user to the usual user, but leave his shopping card as it is
		user.setOrder(null);
		user.setHasAccount(false);
		user.setAccount(null);
		session.setUser(user);
		return session;
	}
	
	public static Session createSession(){
		Customer user = new Customer(null);
		user.setCard(new ShoppingCard());
		return new Session(user);
	}
	
	public static void destroySession(Session session){
		Customer user = session.getUser();
		if (user.getHasAccount() == true){
			logOut(session);
			session = null;
		} else {
			session = null;
		}
	}
	
}
