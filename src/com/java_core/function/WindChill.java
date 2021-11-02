package com.java_core.function;

import java.util.Scanner;

public class WindChill {

	static void windchill(double t, double ws) {

		double w = 35.74 + 0.62158 * t + (0.4275 * t - 35.75) * Math.pow(ws, 0.16);
		System.out.println("Wind chill is "+w);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter temperature in Fahrenheitc -> ");
		double t = sc.nextDouble();
		System.out.print("Enter wind speed in miles per hour -> ");
		double ws = sc.nextDouble();
		if (Math.abs(t) > 50 || ws > 120 || ws < 3) {
			System.out.println("Enter correct input");
		} else {
			windchill(t, ws);

			sc.close();
		}
	}
}
