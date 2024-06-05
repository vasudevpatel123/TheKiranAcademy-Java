package com.vasudev.m2.june5;

class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1.id = 321;
		e1.name = "Ritesh Deshmukh";
		e1.designation = "Systems Engineer";
		e1.salary = 300000;
		
		System.out.println("---Employee Details---");
		System.out.println("Id : "+e1.id);
		System.out.println("Name : "+e1.name);
		System.out.println("Designation : "+e1.designation);
		System.out.println("Salary : "+e1.salary);
		
		System.out.println(" ");
		e1.isEligibleForPromotion();
		e1.isHavingCompanyLaptop();
		
	}

}
