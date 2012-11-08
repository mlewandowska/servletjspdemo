package com.zadanie2.servlet.storage;

import java.util.ArrayList;
import java.util.List;

import com.zadanie2.servlet.domain.Book;

public class StorageService {
private List<Book> baza = new ArrayList<Book>();
	
	public void add(Book book){
		Book newBook = new Book(book.getTitle(), book.getYear(),
				book.getAuthor(), book.getPh());
		baza.add(newBook);
	}
	
	public List<Book> getAllBooks(){
		return baza;
	}

}
