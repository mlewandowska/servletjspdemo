package com.zadanie2.servlet.domain;

public class Book {
	private String title = "Title";
	private int year = 0;
	private String author = "Author";
	private String ph= "Publishing house";
	
	
	public Book() {
		super();
	}
	
	public Book(String title, int year, String author, String ph) {
		super();
		this.title = title;
		this.year = year;
		this.author = author;
		this.ph = ph;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
}
