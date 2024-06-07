package com.vasudev.m2.june7;

public class Student {

	int id; 
	String name;
	double per;
	double marks1;
	double marks2; 
	double marks3;
	double totalMarks;
	
	void accept(int id, String name,double marks1, double marks2, double marks3) {
		
		this.id = id;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		
	}
	
	void calculate() {
		
		totalMarks = marks1 + marks2 + marks3;
		per = (totalMarks / 300 ) * 100;
		
	}
	
	void displayDetails() {
		
		System.out.println("\n---Student Details---");
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Percentage : "+per);
		
	}
	
	void displayGrade() {
		
		if(per>75)
			System.out.println("Your grade is : A");
		else if(per>60 && per<75)
			System.out.println("Your Grade is : B");
		else if(per>40 && per<60)
			System.out.println("Your Grade is : C");
		else if(per<40 && per>=0)
			System.out.println("You have failed the course");
		else
			System.out.println("Wrong input of marks");
	}
}
