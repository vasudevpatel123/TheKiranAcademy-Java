package com.vasudev.m2.june7;

public class Employee {

	int id;
	String name;
	double basicSalary;
	double DA;
	double HRA;
	double grossSalary;
	
	void accept(int id, String name, double basicSalary) {
		
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		
	}
	
	void calculateGrossSalary() {
		
		DA = (basicSalary * 15 ) / 100;
		HRA = (basicSalary * 10) / 100;
		grossSalary = basicSalary + DA + HRA; 
		
	}
	
	void displayEmployeeDetails() {
		
		System.out.println("\n--Employee Details--");
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Gross Salary : "+grossSalary);
		
	}
	
}
