package com.cg.dayseven;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principle=20000;
		int time=2;
		
		RBI r;
		r=new RBI();
		System.out.println("RBI INTEREST : "+r.interest(principle, time));
		r=new SBI();
		System.out.println("SBI INTEREST : "+r.interest(principle, time));
		r=new HDFC();
		System.out.println("HDFC INTEREST : "+r.interest(principle,time));

	}

}
