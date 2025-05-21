package com.constructor;

public class Employee {
	
	String name;
	double salary;
	
	public Employee(String na,double sal) {
		name=na;
		salary=sal;
		
		if(salary<0) {
			salary=0;
		}
	}
	
	public void displayDetails() {
		System.out.println("Employee Name: "+name+"\nEmployee Salary: "+salary);
	}

	public static void main(String[] args) {
		Employee emp=new Employee("Chandana",-1);
		emp.displayDetails();
	}

}
