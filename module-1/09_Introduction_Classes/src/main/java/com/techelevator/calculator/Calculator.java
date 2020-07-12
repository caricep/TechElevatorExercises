package com.techelevator.calculator;

public class Calculator {

	private int result;

	
	public int getResult() {
		return result;
	}
	
	public int add(int addend) {
		this.result = addend + result;
		return this.result;
	}
	
	public int multiply(int multiplier) {
		this.result = multiplier * result;
		return this.result;
	}
	
	public int power(int exponent) {
		this.result = (int) Math.pow(result, exponent);
		return this.result;
	}
	
	public void reset() {
		this.result = 0;	
	}
	
	public int subtract(int subtrahend) {
		this.result = result - subtrahend;
		return this.result;
	}
	
}
