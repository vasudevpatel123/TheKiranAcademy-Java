package com.vasudev.m2.w2.june12;

public class Palindrome {

	public static void main(String[] args) {

		int n =323;
		int temp = n, rev = 0, rem = 0;
		
		while(n>0) {
			rem = n % 10;
			n = n /10;
			rev = (rev * 10) + rem;
		}
		
		n = temp;
		if(n==rev)
			System.out.println("Number is a Palindrome.");
		else 
			System.out.println("Number is NOT a Palindrome.");
		
	}

}
