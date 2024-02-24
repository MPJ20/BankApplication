package com.Operations;

import java.util.Scanner;

import com.Bank.Current;
import com.Bank.Savings;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings sv[]=new Savings[2];
		Current cu[]=new Current[2];
		for(int i=0;i<2;i++) {
			sv[i]=new Savings(2);
			sv[i].openAccount();
			System.out.println("Your Saving Account number is "+sv[i].getAccno());
		}
		for(int i=0;i<2;i++) {
			cu[i]=new Current();
			cu[i].openAccount();
			System.out.println("Your Current Account number is "+cu[i].getAccno());
		}
		int ch=0;
		int ac_type=1;
		char op_choice='N';
		int acno=0;
		boolean flg=false;
		int amt=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Select operation form list \n1)Withdrow\n2)Deposit\n3)Get Balance\n4)Exit");
			ch=sc.nextInt();
			if(op_choice=='N') {
				System.out.println("Select Account type \n1)Savings\n2)Current");
				ac_type=sc.nextInt();
				System.out.println("Enter Account Number");
				acno=sc.nextInt();
			}
			switch(ch) {
			case 1:
				if(ac_type==1) {
					for(int i=0;i<2;i++)
					{
						if(acno==sv[i].getAccno()) {
							flg=true;
							System.out.println("Enter withdraw amount");
							amt=sc.nextInt();
							sv[i].withdrow(amt);
							break;
						}
					}
				}
				else if(ac_type==2) {
					for(int i=0;i<2;i++)
					{
						if(acno==cu[i].getAccno()) {
							flg=true;
							System.out.println("Enter withdraw amount");
							amt=sc.nextInt();
							cu[i].withdrow(amt);
							break;
						}
					}
				}
				if(flg==false)
					System.out.println("Account number is incorrect");
				break;
			case 2:
				if(ac_type==1) {
					for(int i=0;i<2;i++)
					{
						if(acno==sv[i].getAccno()) {
							flg=true;
							System.out.println("Enter deposit amount");
							amt=sc.nextInt();
							sv[i].deposit(amt);
							break;
						}
					}
				}
				else if(ac_type==2) {
					for(int i=0;i<2;i++)
					{
						if(acno==cu[i].getAccno()) {
							flg=true;
							System.out.println("Enter deposit amount");
							amt=sc.nextInt();
							cu[i].deposit(amt);
							break;
						}
					}
				}
				if(flg==false)
					System.out.println("Account number is incorrect");
				break;
			case 3:
				if(ac_type==1) {
					for(int i=0;i<2;i++)
					{
						if(acno==sv[i].getAccno()) {
							flg=true;
							sv[i].showBalanceInfo();
							break;
						}
					}
				}
				else if(ac_type==2) {
					for(int i=0;i<2;i++)
					{
						if(acno==cu[i].getAccno()) {
							flg=true;
							cu[i].showBalanceInfo();;
							break;
						}
					}
				}
				if(flg==false)
					System.out.println("Account number is incorrect");
				break;
			case 4:
				System.exit(0);
			}
			System.out.println("Do you want to continue?? Y/N");
			op_choice=sc.next().charAt(0);
		}while(op_choice!='N');
	}

}
