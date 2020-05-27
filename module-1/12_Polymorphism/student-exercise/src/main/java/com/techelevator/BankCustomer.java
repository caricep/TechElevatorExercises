package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {

	private String name;
	private String address;
	private String phoneNumber;
	
	private Accountable[] accounts;
	List<Accountable> accountsList = new ArrayList<Accountable> ();
	
	public void addAccount(Accountable newAccount) {
		accountsList.add(newAccount);
		
	}
	
	public boolean isVip() {
		if (getBalance() >= 25000) {
			return true;
		}
		return false;
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


	public Accountable[] getAccounts() {
		return accounts;
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


	@Override
	public int getBalance() {
		return 0;
	}

	@Override
	public int getTransferAmount() {
		return 0;
	}

	
	
	
}
