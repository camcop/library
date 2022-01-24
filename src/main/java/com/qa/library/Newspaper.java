package com.qa.library;

public class Newspaper extends Item implements Foldable {

	private String newspaperName;
	private String date;
	private int numPages;

	public Newspaper(String title, String publisher, String newspaperName, String date, int numPages) {
		super(title, publisher);
		this.newspaperName = newspaperName;
		this.date = date;
		this.numPages = numPages;
	}

	@Override
	public void fold() {
		System.out.println("You folded this newspaper: " + this);
	}

	public String getNewspaperName() {
		return newspaperName;
	}

	public void setNewspaperName(String newspaperName) {
		this.newspaperName = newspaperName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

}
