package com.cg.dayeight;

public class Mainclass_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteClass c=new ConcreteClass();
		c.deposit(2500);
		System.out.println(c.Balance());
		c.withdraw(12000);

	}

}
