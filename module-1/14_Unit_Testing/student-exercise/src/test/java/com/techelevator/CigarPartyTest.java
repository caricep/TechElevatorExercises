package com.techelevator;

import org.junit.*;

public class CigarPartyTest {

	private CigarParty cigarParty;
	
	@Before
	public void setup() {
		cigarParty = new CigarParty();
	}
	
	
	@Test
	public void is_the_weekend_and_successful_party() {
		//Arrange
		//Act
		boolean partySuccessful = cigarParty.haveParty(40, true);
		//Assert
		Assert.assertTrue(partySuccessful);
	}
	
	@Test
	public void is_the_weekend_but_not_a_successful_party() {
		//Arrange
		//Act
		boolean partySuccessful = cigarParty.haveParty(30, true);
		//Assert
		Assert.assertFalse(partySuccessful);
	}
	
	
	@Test
	public void number_of_cigars_for_successful_party_on_a_weekday() {
		//Arrange
		
		//Act
		//Assert
	}
	
}
