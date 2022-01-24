package com.qa.library;

public class Map extends Item implements Foldable {

	private String location;
	private String mapType;

	public Map(String title, String publisher, String location, String mapType) {
		super(title, publisher);
		this.location = location;
		this.mapType = mapType;
	}

	@Override
	public void fold() {
		System.out.println("You folded this map: " + this);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMapType() {
		return mapType;
	}

	public void setMapType(String mapType) {
		this.mapType = mapType;
	}

}
