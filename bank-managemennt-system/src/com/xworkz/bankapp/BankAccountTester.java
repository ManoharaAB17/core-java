package com.xworkz.bankapp;

import com.xworkz.bankapp.bank.BankAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount account =new BankAccount();		 
		account.deposit(5000);
		System.out.println("My account balance is .. "+account.getBalance()+"\n");
		
		BankAccount friendsAccount = new BankAccount();
		friendsAccount.deposit(4000);
		System.out.println("First Friends Acoount balance is  "+friendsAccount.getBalance()+"\n");
		
		account.transfer(500.0, friendsAccount);
		
		System.out.println("First Friends Acoount balance after transfer is  "+friendsAccount.getBalance()+"\n");
		System.out.println("  ");
		System.out.println("My account balance after transfer is .. "+account.getBalance()+"\n");
		System.out.println("  ");

		friendsAccount.transfer(500.0, account);
		System.out.println("My account balance after transfer is .. "+account.getBalance()+"\n");
		System.out.println("Friends Acoount balance after transfer is  "+friendsAccount.getBalance()+"\n");
		System.out.println("  ");
		
		BankAccount friendsAccount2 = new BankAccount();
		friendsAccount2.deposit(2475);
		System.out.println("Second Friends Acoount balance is  "+friendsAccount2.getBalance()+"\n");
		
		account.transfer(2345.0, friendsAccount2);
		account.transfer(2345.0, friendsAccount);
		System.out.println("First Friends Acoount balance after transfer is  "+friendsAccount2.getBalance()+"\n");
		System.out.println("  ");
		System.out.println("My account balance after transfer is .. "+account.getBalance()+"\n");
		System.out.println("Second Friends Acoount balance  after transfer  is  "+friendsAccount.getBalance()+"\n");
		
		SavingsAccount saving = new SavingsAccount(17.7);
		 saving.deposit(300);
		 System.out.println("Savings account bal"+saving.getBalance());
		 saving.periodcIntrest();
		 System.out.println("Savings account bal  "+saving.getBalance());
	}

}
