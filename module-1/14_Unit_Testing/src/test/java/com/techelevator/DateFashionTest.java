package com.techelevator;

import org.junit.*;

public class DateFashionTest {

	private DateFashion dateFashion;
	
	@Before
	public void setup() {
		dateFashion = new DateFashion();
	}	
	
	@Test
	public void yes_if_you_are_very_stylish_but_date_is_not() {
		int youStyleScore = dateFashion.getATable(9, 6);
		
		Assert.assertEquals(2, youStyleScore);
	}
	
	@Test
	public void yes_if_date_is_very_stylish_but_you_are_not() {
		int dateStyleScore = dateFashion.getATable(7, 8);
		
		Assert.assertEquals(2, dateStyleScore);
	}
	
	@Test
	public void no_if_either_you_or_date_is_2_or_less() {
		int youStyleScore = dateFashion.getATable(2, 6);
		int dateStyleScore = dateFashion.getATable(7, 1);
		
		Assert.assertEquals(0, youStyleScore);
		Assert.assertEquals(0, dateStyleScore);
	}
	
	@Test
	public void no_if_you_and_date_are_both_0() {
		int youStyleScore = dateFashion.getATable(0, 0);
		int dateStyleScore = dateFashion.getATable(0, 0);
		
		Assert.assertEquals(0, youStyleScore);
		Assert.assertEquals(0, dateStyleScore);
	}
	
	@Test
	public void maybe_if_you_and_date_have_style_score_between_2_and_8() {
		int youStyleScore = dateFashion.getATable(6, 5);
		int dateStyleScore = dateFashion.getATable(5, 5);
		
		Assert.assertEquals(1, youStyleScore);
		Assert.assertEquals(1, dateStyleScore);
	}
	
}
