package com.vasudev.m2.june6;

public class Employee {

	int id;
	String name;
	int age;
	double salary;
	
	void accept(int id, String name, int age, double salary) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	
	}
	
	void display() {
		System.out.println("---Employee Details---");
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
	}
	
}
