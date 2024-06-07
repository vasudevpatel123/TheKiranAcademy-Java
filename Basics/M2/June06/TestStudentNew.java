package com.vasudev.m2.june6;

public class TestStudentNew {

	public static void main(String[] args) {
		
		StudentNew sn1 = new StudentNew();
		sn1.accept(1, "Hemal", 95, 90, 85);
		sn1.calculate();
		sn1.display();

		System.out.println("---------------------");

		StudentNew sn2 = new StudentNew();
		sn2.accept(2, "Shyam", 80, 70, 55);
		sn2.calculate();
		sn2.display();
		
		System.out.println("---------------------");
		
		StudentNew sn3 = new StudentNew();
		sn3.accept(3, "Raghav", 90, 90, 80);
		sn3.calculate();
		sn3.display();
		
		System.out.println("---------------------");

	}

}
