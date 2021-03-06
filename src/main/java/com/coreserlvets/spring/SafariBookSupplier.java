package com.coreserlvets.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.coreservlets.model.Book;

/**
 * Safai has Spring, Ruby, but NO JAVA books.
 */
@Component
@Qualifier("safariBookSupplier")
public class SafariBookSupplier implements BookSupplier {

	@SuppressWarnings("serial")
	private static List<Book> safariBooks = new ArrayList<Book>() {
		{
			add(new Book("Spring in Action", "Craig Walls", "161729120X"));
			add(new Book("Spring Recipes: A Problem-Solution Approach",
					"Daniel Rubio", "1430259086"));
			add(new Book("Spring in Practice", "Willie Wheeler", "1935182056"));
			add(new Book("The Ruby Programming Language", "David Flanagan",
					"0596516177"));
			add(new Book("Ruby Cookbook", "Lucas Carlson", "0596523696"));
		}
	};

	@Override
	public List<Book> searchByTitle(String bookTitle) {
		List<Book> results = new ArrayList<Book>();
		for (Book book : safariBooks) {
			if (book.getBookName().toLowerCase()
					.contains(bookTitle.toLowerCase())) {
				results.add(book);
			}
		}

		return results;
	}

	@Override
	public List<Book> searchByAuthorName(String authorName) {
		List<Book> results = new ArrayList<Book>();
		for (Book book : safariBooks) {
			if (book.getAuthorName().toLowerCase()
					.contains(authorName.toLowerCase())) {
				results.add(book);
			}
		}

		return results;
	}

	@Override
	public String getSupplierName() {
		return "Safari Supplier (No Java Books)";
	}
}
