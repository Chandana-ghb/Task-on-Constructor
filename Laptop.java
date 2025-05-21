package com.constructor;
import java.util.Scanner;
public class Laptop {
	
	String brand;
	int ramSize;
	
	public Laptop(String bra,int ram) {
		brand=bra;
		ramSize=ram;
	}
	
	public void showSpecs() {
	
		System.out.println("-----------------");
		System.out.println("Laptop Brand: "+brand+"\nLaptop RamSize: "+ramSize+"GB");
		
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.print("Enter laptop brand: ");
	    String userBrand = scanner.nextLine();
	    System.out.print("Enter RAM size (in GB): ");
	    int userRamSize = scanner.nextInt();
	    
		Laptop lap=new Laptop("Dell",16);
		lap.showSpecs();
		Laptop lap1=new Laptop(userBrand,userRamSize);
		lap1.showSpecs();
		
		scanner.close();
	}

}
