package com.company.bank005_interface;

public class UserInfo {
	String id;
	String pass;
	Double balance;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInfo(String id, String pass, Double balance) {
		super();
		this.id = id;
		this.pass = pass;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", pass=" + pass + ", balance=" + balance + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
}
