package com.techelevator;

public class SquareWall extends RectangleWall {

	private int sideLength;

	public SquareWall(String name, String color, int sideLength) {
		super(name, color, 0, 0);
		this.sideLength = sideLength;
	}

	
	public int getSideLength() {
		return sideLength;
	}
	
	@Override
	public int getArea() {
		return sideLength * sideLength;
	}
	
	@Override
	public String toString() {
		return super.getName() + " (" + this.sideLength + "x" + this.sideLength + ") square";
	}
	
	
}
