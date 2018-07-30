package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bag {
	private String name;
	private int size;
	
	public Bag() {
		super();
		System.out.println("This is Bag Constructor");
	}

	@Autowired
	private Books books;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}
	
	public void bagInfo()
	{
		System.out.println("What is there in Bag?");
		books.booksInfo();
	}
	

}
