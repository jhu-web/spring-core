package com.coreserlvets.spring;

import java.util.List;

import com.coreservlets.model.Book;

public interface BookStoreService {

	public String getStoreName();

	public void setStoreName(String storeName);

	public List<Book> searchByBookTitle(String bookTitle);

	public List<Book> searchByAuthorName(String authorName);

	public String buy(Book book);
}
