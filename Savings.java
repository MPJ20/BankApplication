package com.Bank;

public class Savings extends Account {
	int no_of_transaction;
	public Savings(int no_of_transaction) {
		this.no_of_transaction=no_of_transaction;
	}
	public int withdrow(int amt) {
		if(no_of_transaction==0) {
			System.out.println("Transaction limit is over");
			return 0;
		}else if(balance < amt) {
			System.out.println("Insufficient balance");
			return 0;
		}
		else if(balance<(amt-balance)) {
			System.out.println("Insufficient balance");
			return 0;
		}
		balance=balance-amt;
		no_of_transaction--;
		System.out.println("Available Balance "+balance);
		return amt;
	}
	public void deposit(int amt) {
		if(amt<0) {
			System.out.println("Wrong amount");
			return;
		}
		balance=balance+amt;
		System.out.println("Available Balance "+balance);
	}
	public void showBalanceInfo() {
		System.out.println("Customer Name: "+cust_name);
		System.out.println("Available Balance "+balance);
	}
}
