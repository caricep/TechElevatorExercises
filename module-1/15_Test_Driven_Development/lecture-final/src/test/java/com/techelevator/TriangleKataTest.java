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
	
	@Test
	public void identifies_invalid_triangle_with_positive_sides() {
		Assert.assertEquals("invalid", triangleKata.classify(6, 6, 13));
	}
	
}
