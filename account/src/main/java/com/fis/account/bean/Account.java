package com.fis.account.bean;

public class Account {

	private long account;
	private String type;
	private double balance;
	public Account(){
		
	}
	public Account(long account,String type,double balance) {
		super();
		this.account=account;
		this.type=type;
		this.balance=balance;
	}
	public long getAccount() {
		return account;
	}
	public void setAccount(long account) {
		this.account = account;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [account=" + account + ", type=" + type + ", balance=" + balance + "]";
	}
	
	
}

