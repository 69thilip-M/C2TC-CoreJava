package com.cg.dayeight;

public class ConcreteClass implements interfaceBank {
	int currBalance=6000;
	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		if(amount>=MaxLimit) {
			System.out.println("limit exceeded");
		}
		else {
			currBalance+=amount;
			System.out.println("your current balance : "+currBalance);
		}
		
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if(amount>=currBalance-minBalance) {
			System.out.println("no sufficient balance is available in your account");
		}
		else {
			currBalance-=amount;
		}
		
	}
	public String Balance() {
		return "Balance[currBalance="+currBalance +"]";
	}
	

}
