package com.constructor;

public class Circle {
	
	double radius;
	double pie=3.14;
	
	public Circle(double rad) {
		radius=rad;
	}
	
	public double getArea() {
		return radius*radius;
	}
	
	public double getCircumference() {
		return 2*pie*radius;
	}
	public static void main(String[] args) {
		Circle c=new Circle(3.3);
		System.out.println("Area Of a Circle: "+c.getArea());
		System.out.println("Area Of a Circumference: "+c.getCircumference());
	}

}
