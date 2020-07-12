package com.techelevator;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
		
	}
	
	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
		
	}
	
	@Override
	public int withdraw(int amountToWithdraw) {
		if (amountToWithdraw <= super.getBalance()) {
			super.withdraw(amountToWithdraw);
			
		} else if (super.getBalance() <= -100) {
			super.withdraw(0);
			
		} else if (super.getBalance() < 0) {
			super.withdraw(amountToWithdraw + 10);
			
		}
		return super.getBalance();
		
	}

	
}
