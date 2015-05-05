package com.coreservlets.model;

import java.util.List;

public class BookUtil {

	public static void printBooks(String searchTerm, List<Book> books) {

		System.out.println("Searched for '" + searchTerm + "'...");

		if (books.isEmpty()) {
			System.out.println("No books with were found!");
		}

		for (Book book : books) {
			System.out.println("Book Title: " + book.getBookName()
					+ "\nAuthor Name: " + book.getAuthorName() + "\nISBN: "
					+ book.getISBN() + "\n********");
		}
	}
}
