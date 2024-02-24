package com.Bank;

import java.util.Scanner;

public class Account {
	private static int acno;
	protected int accno;
	protected String cust_name;
	protected String addr;
	protected String email;
	protected float balance;
	
	static {
		acno=101;
	}
	public void openAccount() {
		Scanner sc=new Scanner(System.in);
		accno=acno++;
		System.out.println("Enter Name");
		cust_name=sc.nextLine();
		System.out.println("Enter Address");
		addr=sc.nextLine();
		System.out.println("Enter email");
		email=sc.next();
		System.out.println("Enter Initial balance");
		balance=sc.nextFloat();
	}
	public void showCustomerInfo() {
		System.out.println("Customer Name: "+cust_name);
		System.out.println("Email "+email);
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	
}
