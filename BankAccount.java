package com.constructor;

public class BankAccount {

	double balance;
	String customerName;
	String address;
	
	
	public BankAccount(double bal,String cus,String add) {
		balance=bal;
		customerName=cus;
		address=add;
		
	}
	public BankAccount() {
		balance=0;
		customerName="NA";
		address="NA";
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance=amount+balance;
			System.out.println("After deposite :" +balance);
			System.out.println("-----------------");
		}
	}
	
	public void withdraw(double amount) {
		
		if(amount<=0) {
			System.out.println("Invalid amount. Withdrawl failed");
		}
		else if(amount>balance) {
			System.out.println( "Insufficient funds. Withdrawal failed.");
		}
		else {
			System.out.println("after withdraw :"+(balance-amount));
		}
		System.out.println("-----------------");
	}
	
	public void updateAddress(String newAddress) {
		
		address=newAddress;
		System.out.println("Address updated successfully to: "+address);
	}
	
	public void updateCustomerName(String newCustomerName) {
		
		customerName=newCustomerName;
		System.out.println("Customer name updated successfully to: "+customerName);
		System.out.println("-----------------");
	}
	
	public void displayData() {
		
		System.out.println("Balance: "+balance+"\nCustomerName: "+customerName+"\nAddress: "+address);
	}
	
	public static void main(String[] args) {
		BankAccount bank=new BankAccount(1000.0,"Alice","123Street");
		bank.deposit(2000.0);
		bank.withdraw(0.0);
		bank.updateAddress("hyd");
		bank.updateCustomerName("chandu");
		BankAccount bank1=new BankAccount();
		bank1.displayData();
		
	}
}
