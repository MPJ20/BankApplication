package com.Bank;

public class Current extends Account {
	public int withdrow(int amt) {
		if(balance < amt) {
			System.out.println("Insufficient balance");
			return 0;
		}
		else if(balance<(amt-balance)) {
			System.out.println("Insufficient balance");
			return 0;
		}
		balance=balance-amt;
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
