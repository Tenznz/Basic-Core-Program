package com.java_core.function;

import java.util.Scanner;

public class Distance {

	static void Euclidean(int x, int y) {
		System.out.println("Euclidean Distance is  " + Math.pow((x * x + y * y), 0.5));
	}

	public static void main(String[] args) {
		System.out.println("Euclidean distance from origin (0,0)");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x value ->");
		int x = sc.nextInt();
		System.out.print("Enter y value ->");
		int y = sc.nextInt();
		Euclidean(x, y);
		sc.close();

	}
}