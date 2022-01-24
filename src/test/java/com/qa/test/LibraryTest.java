package com.qa.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.qa.library.Book;
import com.qa.library.Item;
import com.qa.library.Library;
import com.qa.library.Map;
import com.qa.library.Member;
import com.qa.library.Newspaper;

public class LibraryTest {

	Book book1 = new Book("Dickens' Great Expectations", "Pengiun Classic", "Great Expectations", "Charles Dickens",
			"Comedy", 458);
	Book book2 = new Book("Duckens' Low Expectations", "Pigeon Basic", "Low Expectations", "Cheese Duckens", "Comedy",
			123);
	Map map1 = new Map("OS Map London June 2021", "Ordinance Survey", "Greater London", "OS");
	Newspaper paper1 = new Newspaper("FT 20 Jan 22", "Nikkei", "The Financial Times", "2022-01-20", 46);
	Member member1 = new Member("John", "Doe");

	Library lib1 = new Library();

	@Test
	public void testAddItem() {
		ArrayList<Item> testList = new ArrayList<>();
		testList.add(book1);
		lib1.addItem(book1);
		assertEquals(testList, lib1.getContents());
	}

//	@Test
//	public void testUpdateItem() {
//		ArrayList<Item> testList = new ArrayList<>();
//		testList.add(book1);
//		lib1.addItem(book1);
//		testList.set(0, book2);
//		lib1.updateItem(0, book2);
//		assertEquals(testList, lib1.getContents());
//	}

	@Test
	public void testRemoveItem() {
		ArrayList<Item> testList = new ArrayList<>();
		testList.add(book2);
		lib1.addItem(book2);
		testList.remove(0);
		lib1.removeItem(1);
		assertEquals(testList, lib1.getContents());
	}

}
