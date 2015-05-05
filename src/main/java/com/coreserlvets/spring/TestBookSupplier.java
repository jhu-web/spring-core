package com.coreserlvets.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.coreservlets.model.Book;

@Component
@Qualifier("testBookSupplier")
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
