package com.java_core.basic;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Dividend"); 
		int dividend =sc.nextInt();
		System.out.println("Enter Divisor"); 
		int divisor=sc.nextInt();
		sc.close();
		int Quotient=dividend/divisor;
		int Remainder=dividend %divisor;
		System.out.println("Quotient : "+Quotient);
		System.out.println("Remainder :"+Remainder);  
		
	}

}
