
public class Session {
	private Customer user = null;
	
	public Session(Customer user){
		this.user = user;
	}

	public Customer getUser() {
		return user;
	}

	public void setUser(Customer user) {
		this.user = user;
	}
}
