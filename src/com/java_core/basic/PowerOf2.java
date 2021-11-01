package com.java_core.basic;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 0-30");  
		int pow = sc.nextInt();
		
		int sum = 1;
		if(pow>30||pow<0) {
			while(pow>30||pow<0) {
				System.out.println("Enter Valid number from 0-30");    
				pow=sc.nextInt();
			}
		}
		sc.close();
	
		for (int i = 0; i <= pow; i++) {
			System.out.println("2ˆ" + (i) + " = " + sum);
			sum = sum*2;
			
		}
		
		
		
	}

}
