package com.vasudev.m2.june6;

public class StudentNew {

	int id;
	String name;
	float per;
	float marks1;
	float marks2;
	float marks3;
	float totalMarks;
	
	void accept(int id, String name,float marks1, float marks2, float marks3) {
		
		this.id=id;
		this.name=name;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
		
	}
	
	void calculate() {
		
		totalMarks = marks1+marks2+marks3;
		per = (totalMarks/300)*100;
		
	}
	
	void display() {
		
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Percentage : "+per);
		
	}
	
}
