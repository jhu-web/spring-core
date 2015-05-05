package com.coreserlvets.nonspring;

import java.util.List;

import com.coreservlets.model.Book;

public interface BookSupplier {

	public String getSupplierName();

	public List<Book> searchByTitle(String bookTitle);

	public List<Book> searchByAuthorName(String authorName);
}
