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
	public void identifies_invalid_triangle_with_1_and_2_lessThan_3() {
		Assert.assertEquals("invalid", triangleKata.classify(6, 6, 13));
		Assert.assertEquals("invalid", triangleKata.classify(6, 6, 12));
	}
	
	@Test
	public void identifies_invalid_triangle_with_2_and_3_lessThan_1() {
		Assert.assertEquals("invalid", triangleKata.classify(13, 6, 6));
		Assert.assertEquals("invalid", triangleKata.classify(12, 6, 6));
	}
	
}
