package com.vasudev.m2.w2.june12;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int n=4079;
		int sum = 0,temp = n,rem=0,power,digit=0;
		
		while(n>0) {
			n=n/10;
			digit++;
		}
		
		n=temp;
		
		while(n>0) {
			rem = n % 10;
			power = (int) Math.pow(rem, digit);
			sum=sum+power;
			n=n/10;
		}
		
		n=temp;
		
		if(sum==n)
			System.out.println("Number is a Armstrong number.");
		else
			System.out.println("Number is Not a Armstrong number.");
		
		
	}
	
}

