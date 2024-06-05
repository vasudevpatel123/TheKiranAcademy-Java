package com.vasudev.m2.june5;

public class Customer {

	String name;
	int age;
	String address;
	int mobile;
	String email;
	int adharNo;
	double balance;
	
	void deposit() {
		System.out.println("Amount is deposited.");
	}
	
	void withdrawal() {
		System.out.println("Amount is withdrawal.");
	}
	
	void checkBalance() {
		System.out.println("Balance is : "+balance);
	}
	
}
