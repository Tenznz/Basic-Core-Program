package com.java_core.basic;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {

		System.out.println("Enter Only Alphabet");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch = str.charAt(0);
		sc.close();

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {

			System.out.println(ch + " is vowel letter");
		} else
			
			System.out.println(ch + " is consonant");

	}

}
