package com.qa.library;

public class Book extends Item {

	private String bookTitle;
	private String author;
	private String genre;
	private int numPages;

	public Book(String title, String publisher, String bookTitle, String author, String genre, int numPages) {
		super(title, publisher);
		this.bookTitle = bookTitle;
		this.author = author;
		this.genre = genre;
		this.numPages = numPages;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

}
