package com.constructor;

public class Rectangle {

	int length;
	int breadth;
	
	public Rectangle() {
		System.out.println("Length: "+length+"\nBreadth: "+breadth);
	}
	
	public Rectangle(int len,int bred) {
		length=len;
		breadth=bred;
	}
	
	public int area() {
		return length*breadth;
	}
	
	public static void main(String[] args) {
		Rectangle rec=new Rectangle(7,8);
		System.out.println("Area Of a Rectangle: "+rec.area());
		Rectangle rec1=new Rectangle();
		rec1.area();
	}

}
