package com.techelevator;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
		
	}
	
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
		
	}
	
	@Override
	public int withdraw(int amountToWithdraw) {
		if (amountToWithdraw > getBalance()) {
			super.withdraw(0);
			
		} else if (super.getBalance() > 150) {
			super.withdraw(amountToWithdraw);
			
		} else if (super.getBalance() < 150 && super.getBalance() >= 0) {
			super.withdraw(amountToWithdraw + 2);
			
		} 
		return super.getBalance();
		
	}
	
}
