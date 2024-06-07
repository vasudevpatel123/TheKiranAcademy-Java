package com.vasudev.m2.june7;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.accept(1, "Krishna", 500000);
		e1.calculateGrossSalary();
		e1.displayEmployeeDetails();
		
		Employee e2 = new Employee();
		e2.accept(2, "Radha", 900000);
		e2.calculateGrossSalary();
		e2.displayEmployeeDetails();
		
		Employee e3 = new Employee();
		e3.accept(3, "Bhramha", 100000);
		e3.calculateGrossSalary();
		e3.displayEmployeeDetails();
		
	}
	
}
