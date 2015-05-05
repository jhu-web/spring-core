package com.coreserlvets.nonspring;

import java.util.List;

import com.coreservlets.model.Book;
import com.coreservlets.model.BookUtil;

public class ClientDriver2 {

	public static void main(String[] args) {

		// Get an instance of the factory
		BookSupplierFactory bookSupplierFactory = new BookSupplierFactory();

		BookSupplier safariBookSupplier = bookSupplierFactory
				.getSafariBookSupplier();
		BookStoreService bookStoreService = new BookStoreServiceImpl("Safari",
				safariBookSupplier);
		
		List<Book> results = bookStoreService.searchByBookTitle("ruby");
		BookUtil.printBooks("ruby", results);

		results = safariBookSupplier.searchByAuthorName("Marty");
		BookUtil.printBooks("Marty", results);
	}
}
