package com.coreserlvets.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.coreservlets.model.Book;

/**
 * Amazon has Spring, Java, but NO RUBY books.
 */
@Component
@Qualifier("amazonBookSupplier")
public class AmazonBookSupplier implements BookSupplier {

	@SuppressWarnings("serial")
	private static List<Book> amazonBooks = new ArrayList<Book>() {
		{
			add(new Book("Spring in Action", "Craig Walls", "161729120X"));
			add(new Book("Spring Recipes: A Problem-Solution Approach",
					"Daniel Rubio", "1430259086"));
			add(new Book("Spring in Practice", "Willie Wheeler", "1935182056"));
			add(new Book(
					"Professional Java Development with the Spring Framework",
					"Rod Johnson", "1430259086"));
			add(new Book(
					"Core Servlets and Javaserver Pages: Advanced Technologies, Vol. 2",
					"Marty Hall", "0131482602"));
			add(new Book("Java Cookbook", "Ian F. Darwin", "144933704X"));
		}
	};

	@Override
	public List<Book> searchByTitle(String bookTitle) {
		List<Book> results = new ArrayList<Book>();
		for (Book book : amazonBooks) {
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
		for (Book book : amazonBooks) {
			if (book.getAuthorName().toLowerCase()
					.contains(authorName.toLowerCase())) {
				results.add(book);
			}
		}

		return results;
	}

	@Override
	public String getSupplierName() {
		return "Amazon Supplier (No Ruby Books)";
	}
}
