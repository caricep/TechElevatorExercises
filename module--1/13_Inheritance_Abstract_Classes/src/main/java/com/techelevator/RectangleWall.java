package com.techelevator;

public class RectangleWall extends Wall {

	private int length;
	private int height;
	
	
	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.length = length;
		this.height = height;
	}

	@Override
	public String toString() {
		return super.getName() + " (" + this.length + "x" + this.height + ") rectangle";
	}
	
	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int getArea() {
		return length * height;
	}

	
}
