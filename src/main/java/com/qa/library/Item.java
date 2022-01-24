package com.qa.library;

public abstract class Item {

	private int id;
	private String title;
	private String publisher;
	private int checkedOutBy = -1;

	public Item(String title, String publisher) {
		super();
		this.title = title;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCheckedOutBy() {
		return checkedOutBy;
	}

	public void setCheckedOutBy(int checkedOutBy) {
		this.checkedOutBy = checkedOutBy;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", publisher=" + publisher + ", checkedOutBy=" + checkedOutBy
				+ "]";
	}

}
