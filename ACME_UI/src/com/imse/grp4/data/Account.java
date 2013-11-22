package com.imse.grp4.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_db")
public class Account {

	@Column(name="email")
	private String email = null;
	@Column(name="address")
	private String[] address = null;
	@Column(name="accountpassword")
	private String password = null;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getAddress() {
		return address;
	}

	public void setAddress(String[] address) {
		this.address = address;
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

	public long getAccountID() {
		return accountID;
	}

	public void setAccountID(long acoountID) {
		this.accountID = acoountID;
	}

	@Column(name="firstname")
	private String firstName = null;
	@Column(name="lastname")
	private String lastName = null;
	@Column(name="phonenumber")
	private String phoneNumber = null;
	
	@Id
	@Column(unique = true, nullable = false)
	private long accountID;
	
	public Account(String email, String password, String name, String surname){
		this.email = email;
		this.password =password;
		firstName = name;
		lastName = surname;
	}
	
	public Account()
	{
	}
	
}
