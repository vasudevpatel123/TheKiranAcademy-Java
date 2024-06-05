package com.vasudev.m2.june5;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.name = "Raj Patil";
		c1.age = 33;
		c1.address = "Pune";
		c1.mobile = 362423542;
		c1.email = "rajpatil@gmail.com";
		c1.adharNo = 35445663;
		c1.balance = 5000.00;

		System.out.println("---Customer Details---");
		System.out.println("Name : "+c1.name);
		System.out.println("Age : "+c1.age);
		System.out.println("Address : "+c1.address);
		System.out.println("Mobile : "+c1.mobile);
		System.out.println("Email : "+c1.email);
		System.out.println("Adhar No. : "+c1.adharNo);
		System.out.println("Balance : "+c1.balance);

		System.out.println("Methods---");
		c1.deposit();
		c1.withdrawal();
		c1.checkBalance();
		
	}
	
}
