package com.coreserlvets.nonspring;

import java.util.List;

import com.coreservlets.model.Book;
import com.coreservlets.model.BookUtil;

public class ClientDriver1 {

	public static void main(String[] args) {

		// Create Safari BookStoreService
		BookSupplier bookSupplier = new AmazonBookSupplier();
		BookStoreService bookStore = new BookStoreServiceImpl("Amazon",
				bookSupplier);
		List<Book> results = bookStore.searchByBookTitle("ruby");
		BookUtil.printBooks("ruby", results);

		results = bookStore.searchByAuthorName("Marty");
		BookUtil.printBooks("Marty", results);
	}
}
