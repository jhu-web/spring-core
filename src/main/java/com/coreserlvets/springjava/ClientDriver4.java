package com.coreserlvets.springjava;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coreservlets.model.Book;
import com.coreservlets.model.BookUtil;

public class ClientDriver4 {

	public static void main(String[] args) {

		@SuppressWarnings("all")
		ApplicationContext context = new AnnotationConfigApplicationContext(
				JavaSpringConfig.class);
		BookStoreService bookStoreService = context
				.getBean(BookStoreService.class);

		List<Book> results = bookStoreService.searchByBookTitle("ruby");
		BookUtil.printBooks("ruby", results);

		results = bookStoreService.searchByAuthorName("Marty");
		BookUtil.printBooks("Marty", results);
	}
}
