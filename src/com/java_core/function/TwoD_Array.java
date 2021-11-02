package com.java_core.function;

import java.util.Scanner;

public class TwoD_Array {

	public static Scanner sc = new Scanner(System.in);

	static void intArray(Object x, Object y) {
		int row = (int) x;
		int col = (int) y;
		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("arr[" + i + "][" + j + "] -->");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < row; i++) {
			System.out.print("|\t");
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println("|");
		}
	}

	static void doubleArray(Object x, Object y) {

		int row = (int) x;
		int col = (int) y;
		double[][] arr = new double[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("arr[" + i + "][" + j + "] -->");
				arr[i][j] = sc.nextDouble();
			}
		}
		for (int i = 0; i < row; i++) {
			System.out.print("|\t");
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println("|");
		}
	}

	static void booleanArray(Object x, Object y) {

		int row = (int) x;
		int col = (int) y;
		boolean[][] arr = new boolean[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("arr[" + i + "][" + j + "] -->");
				arr[i][j] = sc.nextBoolean();
			}
		}
	
		for (int i = 0; i < row; i++) {
			System.out.print("|\t");
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println("|");
		}
	}

	public static void main(String[] args) {

		System.out.println("Choose the following option \n 1.Integer \n 2.Double \n 3.Boolean");
		int opt = sc.nextInt();
		System.out.println("Enter the number of row");
		Object row = sc.nextInt();
		System.out.println("Enter the number of column");
		Object col = sc.nextInt();
		System.out.println("Enter the 2D value");

		if (opt == 1)
			intArray(row, col);
		else if (opt == 2)
			doubleArray(row, col);
		else if (opt == 3)
			booleanArray(row, col);
		else
			System.out.println("Incorrect Option");
		sc.close();
	}

}
