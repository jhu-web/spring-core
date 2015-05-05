package com.coreserlvets.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coreservlets.model.Book;
import com.coreservlets.model.BookUtil;

public class ClientDriver3 {

	public static void main(String[] args) {

		@SuppressWarnings("all")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		BookStoreService bookStoreService = context
				.getBean(BookStoreService.class);

		List<Book> results = bookStoreService.searchByBookTitle("ruby");
		BookUtil.printBooks("ruby", results);

		results = bookStoreService.searchByAuthorName("Marty");
		BookUtil.printBooks("Marty", results);
	}
}
