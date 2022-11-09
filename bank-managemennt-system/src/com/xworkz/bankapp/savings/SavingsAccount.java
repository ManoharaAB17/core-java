package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.bank.BankAccount;



public class SavingsAccount extends BankAccount{
	double intrestRate;
	public   SavingsAccount() {
		super();
		System.out.println("saving acnt obeject");
	}
	
	public SavingsAccount(double intrestRate) {
		this.intrestRate= intrestRate;
	}
	
	 public void periodcIntrest() {
		double newBalance = getBalance()* intrestRate/100; 
		deposit(newBalance);
	 }
}
