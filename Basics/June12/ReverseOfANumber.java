package com.vasudev.m2.w2.june12;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n = 8491;
		int reverse = 0,rem = 0;
		
		while(n>0) {
			rem = n % 10;
			n = n / 10;
			reverse = (reverse * 10 ) + rem ;
		}
		
		System.out.println(reverse);
		
	}

}
