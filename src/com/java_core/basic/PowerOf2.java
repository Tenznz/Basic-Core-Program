package com.java_core.basic;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pow = sc.nextInt();
		sc.close();
		int sum = 1;
		for (int i = 0; i < pow; i++) {
			sum = sum * 2;
		}
		System.out.println("2ˆ" + pow + " = " + sum);

	}

}
