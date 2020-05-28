package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

	private String name;
	private String address;
	private String phoneNumber;
	private int balance;
	private int debt;
	
	private List<Accountable> accountsList = new ArrayList<>();
	
	
	public void addAccount(Accountable newAccount) {
		accountsList.add(newAccount);		
	}
	
	public Accountable[] getAccounts() {
		Accountable[] accounts = accountsList.toArray(new Accountable[accountsList.size()]);
		return accounts;
	}
	
	public boolean isVip() {
		if (balance >= 25000 || balance - debt >= 25000 ) {
			return true;
		} 
		return false;
	}
	
	public int getBalance() {
        return balance;
    }
	
	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


}
