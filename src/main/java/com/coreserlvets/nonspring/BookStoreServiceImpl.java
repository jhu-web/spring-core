package com.coreserlvets.nonspring;

import java.util.List;

import com.coreservlets.model.Book;

public class BookStoreServiceImpl implements BookStoreService {

	private String storeName;
	private BookSupplier bookSupplier;

	public BookStoreServiceImpl(String storeName, BookSupplier bookSupplier) {
		System.out.println("Using " + bookSupplier.getSupplierName());
		this.storeName = storeName;
		this.bookSupplier = bookSupplier;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public BookSupplier getBookSupplier() {
		return bookSupplier;
	}

	public void setBookSupplier(BookSupplier bookSupplier) {
		this.bookSupplier = bookSupplier;
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
