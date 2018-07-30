package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class Books {
	public String book;
	public int price;
	public Books() {
		super();
		System.out.println("This is Books Constructor");
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void booksInfo()
	{
		System.out.println("There are many books in Bag");
	}

}
