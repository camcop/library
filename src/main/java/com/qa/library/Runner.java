package com.qa.library;

public class Runner {

	public static void main(String[] args) {

		Book book1 = new Book("Dickens' Great Expectations", "Pengiun Classic", "Great Expectations", "Charles Dickens",
				"Comedy", 458);
		Book book2 = new Book("Duckens' Low Expectations", "Pigeon Basic", "Low Expectations", "Cheese Duckens",
				"Parody", 123);
		Map map1 = new Map("OS Map London June 2021", "Ordinance Survey", "Greater London", "OS");
		Newspaper paper1 = new Newspaper("FT 20 Jan 22", "Nikkei", "The Financial Times", "2022-01-20", 46);
		Member member1 = new Member("John", "Doe");

		map1.fold();
		paper1.fold();

		Library lib1 = new Library();

		lib1.addItem(book1);
		lib1.addItem(book2);
		lib1.addItem(map1);
		lib1.addItem(paper1);

		lib1.addMember(member1);

		lib1.checkOutItem(1, 1);
		System.out.println(lib1);
	}

}
