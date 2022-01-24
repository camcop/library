package com.qa.library;

import java.util.ArrayList;

public class Library {

	private ArrayList<Item> contents = new ArrayList<>();
	private ArrayList<Member> members = new ArrayList<>();
	private static int currentIdContents;
	private static int currentIdMembers;

	public Library() {
		super();
	}

	public Library(ArrayList<Item> contents, ArrayList<Member> members) {
		super();
		this.contents = contents;
		this.members = members;
	}

	public void addItem(Item item) {
		item.setId(++currentIdContents);
		this.contents.add(item);
		return;
	}

	public void removeItem(int itemId) {
		this.contents.remove(itemId - 1);
		return;
	}

	public void addMember(Member member) {
		member.setId(++currentIdMembers);
		this.members.add(member);
		return;
	}

	public void removeMember(int memberId) {
		this.members.remove(memberId - 1);
		return;
	}

	public void checkOutItem(int memberId, int itemId) {
		this.contents.get(itemId - 1).setCheckedOutBy(memberId);
		return;
	}

	public void checkInItem(int memberId, int itemId) {
		this.contents.get(itemId - 1).setCheckedOutBy(-1);
		return;
	}

	public ArrayList<Item> getContents() {
		return contents;
	}

	public void setContents(ArrayList<Item> contents) {
		this.contents = contents;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	public void setCustomers(ArrayList<Member> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "Library [contents=" + contents + ", members=" + members + "]";
	}

}
