package com.vasudev.m2.june5;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.Id = 41;
		s1.name = "Vasudev Patel";
		s1.course = "Java";
		s1.percentage = 72.4;
		
		System.out.println("---Student Details---");
		System.out.println("Id : "+s1.Id);
		System.out.println("Name : "+s1.name);
		System.out.println("Course : "+s1.course);
		System.out.println("Percentage : "+s1.percentage);
		
		s1.resultCheck();
		s1.isFootballPlayer();
		
	}

}
