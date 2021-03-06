package com.techelevator;

public class FruitTree {

	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit - piecesOfFruitLeft;
	}
	
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (numberOfPiecesToRemove <= piecesOfFruitLeft) {
			piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
			return true;
		}
		return false;
	}
	
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
	
}
