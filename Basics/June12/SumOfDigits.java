package com.vasudev.m2.w2.june12;

public class SumOfDigits {

	public static void main(String[] args) {

		int n = 376;
		int sum = 0,rem = 0,temp = n;
		
		while(n>0) {
			rem = n % 10;
			n = n / 10;
			sum = sum + rem;
		}
		
		n=temp;
		System.out.println("Sum of digits of the "
				+ "number "+n+" is "+sum+".");
		
	}

}
