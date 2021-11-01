package com.java_core;

import java.util.Scanner;

public class Harmonic_Number {

	public static void main(String[] args) {
		System.out.println("The Harmonic Value N.");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double H[] = new double[n];
		H[0] = 1;

		if (n != 0) {
			String str = "1/1 ";

			for (int i = 2; i <= n; i++) {
				str = str + " + 1/" + i;
				H[i - 1] = H[i - 2] + (1 / (double) i);

			}
			System.out.println("H" + n + " = " + str);
			System.out.println("Which value you want");
			int num = sc.nextInt();

			System.out.println("H" + num + " = " + H[num - 1]);

			sc.close();
		} else
			System.out.println("Enter valid number");
	}
}
