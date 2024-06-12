package com.vasudev.m2.w2.june12;

public class CountOfNumber {

	public static void main(String[] args) {

		int n = 3932;
		int count = 0;
		
		while(n>0) {
			n = n / 10;
			count++;
		}
		
		System.out.println(count);
		
	}

}
