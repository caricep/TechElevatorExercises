package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

	private String name;
	private String address;
	private String phoneNumber;
	private int balance;
	private int debt;
	
	private Accountable[] accounts;
	List<Accountable> accountsList = new ArrayList<Accountable> ();
	
	public void addAccount(Accountable newAccount) {
		accountsList.add(newAccount);
		//Accountable[] = new Accountable[] (newAccount);
	}
	
	public boolean isVip() {
		if (balance >= 25000) {
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


}
