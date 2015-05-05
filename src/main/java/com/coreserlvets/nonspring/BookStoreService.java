package com.coreserlvets.nonspring;

import java.util.List;

import com.coreservlets.model.Book;

public interface BookStoreService {

	public String getStoreName();

	public BookSupplier getBookSupplier();

	public void setStoreName(String storeName);

	public void setBookSupplier(BookSupplier bookSupplier);

	public List<Book> searchByBookTitle(String bookTitle);

	public List<Book> searchByAuthorName(String authorName);

	public String buy(Book book);
}
