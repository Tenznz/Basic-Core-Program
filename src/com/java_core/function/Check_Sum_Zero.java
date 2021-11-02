package com.java_core.function;

import java.util.Scanner;

public class Check_Sum_Zero {
	static Scanner sc = new Scanner(System.in);
	private static void sum(int n) {
		
	
		int[] num = new int[n];
		System.out.println("Enter the number");
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		} // input
		sc.close();
		int count = 0;
		int len = num.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				for (int k = j + 1; k < len; k++) {
					int sum = num[i] + num[j] + num[k];
					if (sum == 0) {
						count++;
						System.out.println("(" + num[i] + ") + (" + num[j] + ") + (" + num[k] + ") = 0");
					}
				} // k loop ends
			} // j loop ends
		} // i loop ends
		if (count == 0)
			System.out.println("Zero not occur");

	}

	public static void main(String[] args) {
		System.out.print("Enter the total number");

		int n = sc.nextInt();
		if(n>=3) {
		sum(n);
		}
		else
			System.out.println("Enter more than 3 number"); 
	}
}