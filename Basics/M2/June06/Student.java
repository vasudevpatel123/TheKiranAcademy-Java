package com.vasudev.m2.june6;

public class Student {

	int id;
	String name;
	float per;
	
	void accept(int id, String name, float per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	void display() {
		System.out.println("\n---- Student Details ----");
		System.out.println("Id - "+id);
		System.out.println("Name - "+name);
		System.out.println("Percentage - "+per);
	}
	
	void display75() {
		if(per>75) {
		System.out.println("Name : "+name);
	}

}
}
