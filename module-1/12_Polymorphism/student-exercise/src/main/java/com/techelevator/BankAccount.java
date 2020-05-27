package com.techelevator;

public class BankAccount implements Accountable {

    private String accountHolderName;
    private String accountNumber;
    private int balance;
    private int transferAmount;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount transferTo(BankAccount destinationAccount, int transferAmount) {
    	this.transferAmount = balance - transferAmount;
    	return destinationAccount;
    }
    
    public int getTransferAmount() {
		return transferAmount;
	}

	public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    // Update the balance by using the DollarAmount.Plus method
    public int deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance;
    }

    // Update the balance by using the DollarAmount.Minus method
    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;
    }

}
