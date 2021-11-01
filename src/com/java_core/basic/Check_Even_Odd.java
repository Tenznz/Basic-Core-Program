package com.java_core.basic;

import java.util.Scanner;

public class Check_Even_Odd {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if (num % 2 == 0)
			System.out.println("EVEN");
		else
			System.out.println("ODD");

	}

}
