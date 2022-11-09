package com.xworkz.bankapp.bank;

public class BankAccount {
		public String name;
		String ifscCode;
		String branchName;
		String accountNo;
		
		//Encapsulation
		private double balance;
		
		
		public BankAccount() {
			System.out.println("bank acnt object");
		}
		
		public double withDraw(double balance)
		{
			this.balance = this.balance -balance;
			return balance;				
		}
		
		public double deposit(double balance)
		{
			this.balance = this.balance+balance;
			return balance;
		}
		
		public void transfer(double amount, BankAccount friendsAccount)
		{
			System.out.println("Transfering to another account");
				System.out.println("WithDraw amount is "+ withDraw(amount));
			  friendsAccount.deposit(amount);
			System.out.println("Transfering Done....");
		}
		
		public void transfer2(double amount, BankAccount friendsAccount2)
		{
			System.out.println("Transfering to another account");
				withDraw(amount);
			  friendsAccount2.deposit(amount);
			System.out.println("Transfering Done....");
		}
		
		public void setBalance(double balance) {
			this.balance =balance;
		}
		public double getBalance() {
			return balance ;
		}

}
