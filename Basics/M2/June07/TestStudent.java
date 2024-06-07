package com.vasudev.m2.june7;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.accept(1, "Shayam", 70, 80, 90);
		s1.calculate();
		s1.displayDetails();
		s1.displayGrade();
		
		Student s2 = new Student();
		s2.accept(2, "Radha", 80, 90, 100);
		s2.calculate();
		s2.displayDetails();
		s2.displayGrade();
		
		Student s3 = new Student();
		s3.accept(3, "Narayan", 70, 100, 100);
		s3.calculate();
		s3.displayDetails();
		s3.displayGrade();
		
	}
	
	
}
