package com.java_core.basic;

import java.util.Scanner;

public class Flip_Coin {

	public static void main(String[] args) {
		int n,head = 0,tail = 0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		
		for(int i =0;i<n;i++) {
		int coin=(int)((Math.random()*10)%2);
		
		if(coin<0.5) { 
			tail++;
		System.out.println("Head"); 
		}	
		else {
			head++;
		System.out.println("Tail"); 
}}
		int per_Head=(head*100)/n;
		int per_Tail=(tail*100)/n;
		System.out.println("Heads = "+per_Head+"% \n"+"Tails = "+per_Tail+"%");
	
		}

}
