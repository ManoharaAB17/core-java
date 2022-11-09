package com.xworkz.bankapp.current;

import com.xworkz.bankapp.bank.BankAccount;

public class CurrentAccount extends BankAccount  {
	public static void main(String args[]) {
		CurrentAccount medAcc = new CurrentAccount();
		medAcc.deposit(500);		
		System.out.println("MEDICAL Account balance is  "+ medAcc.getBalance());
		
		CurrentAccount genAcc = new CurrentAccount();
		genAcc.deposit(500);		
		System.out.println("GENERAL Account balance is  "+ genAcc.getBalance());
		
		genAcc.transfer(238, medAcc);
		System.out.println("GENERAL Account balance is  "+ genAcc.getBalance());
		System.out.println("MEDICAL Account balance is  "+ medAcc.getBalance());
				
	}

}
