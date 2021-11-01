package com.java_core.basic;

import java.util.Scanner;

public class Swap_Number {

	public static void main(String[] args) {
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		System.out.println("BEFORE: \n First number : " + num1 + "\n Second number : " + num2);
		sc.close();
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("AFTER \n First number : " + num1 + "\n Second number : " + num2);

	}

}
