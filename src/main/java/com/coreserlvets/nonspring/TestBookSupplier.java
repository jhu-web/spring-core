package com.coreserlvets.nonspring;

import java.util.ArrayList;
import java.util.List;

import com.coreservlets.model.Book;

public class TestBookSupplier implements BookSupplier {

	@Override
	public String getSupplierName() {
		return "Test Book Suppplier: We have no books!";
	}

	@Override
	public List<Book> searchByTitle(String bookTitle) {
		List<Book> books = new ArrayList<Book>(1);
		books.add(new Book("Test Title", "Test Author", "TEST ISBN"));
		return books;
	}

	@Override
	public List<Book> searchByAuthorName(String authorName) {
		List<Book> books = new ArrayList<Book>(1);
		books.add(new Book("Test Title", "Test Author", "TEST ISBN"));
		return books;
	}
}
