package com.constructor;

public class Book {
	
	String title;
	String author;
	
	public Book(String tit , String aut) {
		title=tit;
		author=aut;
	}
	
	public void display(){
		System.out.println("Title: "+title+"\nAuthor: "+author);
	}

	public static void main(String[] args) {
		Book b=new Book("Java","James Gosling");
		b.display();
		
	}

}
