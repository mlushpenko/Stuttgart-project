
public class Account {
	private String email = null;
	private String[] address = null;
	private String password = null;
	private String firstName = null;
	private String lastName = null;
	private String phoneNumber = null;
	private long acoountID;
	
	public long getAcoountID() {
		return acoountID;
	}

	public Account(String email, String password, String name, String surname){
		this.email = email;
		this.password =password;
		firstName = name;
		lastName = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
