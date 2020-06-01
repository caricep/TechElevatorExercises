package com.techelevator;

import org.junit.*;

public class TriangleKataTest {

	private TriangleKata triangleKata;
	
	@Before
	public void setup() {
		triangleKata = new TriangleKata();
	}
	
	@Test
	public void identify_equilateral_triange() {
		Assert.assertEquals("equilateral", triangleKata.classify(4, 4, 4));
	}
	
}
