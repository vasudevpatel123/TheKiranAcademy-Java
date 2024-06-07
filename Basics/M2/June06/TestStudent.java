package com.vasudev.m2.june6;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.accept(1,"Ria",72.4f);
		s2.accept(2, "Shahrukh", 87.5f);
		s3.accept(3, "Shyam", 79.9f);
		
		s1.display();
		s2.display();
		s3.display();
		
		System.out.println("\n==Name of Student who scored more then 75 percentage==");
		s1.display75();
		s2.display75();
		s3.display75();
		
	}
	
}
