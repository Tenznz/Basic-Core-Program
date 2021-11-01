package com.java_core.basic;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				num = num / i;
				System.out.print(i + " ");
			}
		}
	}
	
}