package com.coreserlvets.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.coreservlets.model.Book;

@Service
public class BookStoreServiceImpl implements BookStoreService {

	private String storeName;

	@Autowired
	@Qualifier("safariBookSupplier")
	private BookSupplier bookSupplier;

	public BookStoreServiceImpl() {
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	@Override
	public List<Book> searchByBookTitle(String bookTitle) {
		return bookSupplier.searchByTitle(bookTitle);
	}

	@Override
	public List<Book> searchByAuthorName(String authorName) {
		return bookSupplier.searchByAuthorName(authorName);
	}

	@Override
	public String buy(Book book) {
		return "You just bought: " + book;
	}
}
