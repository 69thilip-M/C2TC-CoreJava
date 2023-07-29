package com.cg.daytwo;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing numbers from user input to 1");
		int n = sc.nextInt();
		while(n>0) {
			System.out.println(n);
			n--;
		}

	}

}
