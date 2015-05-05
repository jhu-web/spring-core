package com.coreservlets.model;

public class Book {

	private String bookName;
	private String authorName;
	private String ISBN;

	public Book(String bookName, String authorName, String ISBN) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.ISBN = ISBN;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	@Override
	public String toString() {
		return "***** \nBook: \nbookName= " + bookName + "\nauthorName= " + authorName
				+ "\nISBN= " + ISBN + "\n********\n";
	}
}
