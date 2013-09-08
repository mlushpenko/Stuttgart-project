
public class Account {
	private String email = null;
	private String[] address = null;
	private String password = null;
	private String firstName = null;
	private String lastName = null;
	private String phoneNumber = null;
	private long acoountID;
	
	public Account(String email, String password, String name, String surname){
		this.email = email;
		this.password =password;
		firstName = name;
		lastName = surname;
	}

	private String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	private String getPassword() {
		return password;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	private String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String getLastName() {
		return lastName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String getPhoneNumber() {
		return phoneNumber;
	}

	private void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
