package com.techelevator;

import org.junit.*;

public class CigarPartyTest {

	private CigarParty cigarParty;
	
	@Before
	public void setup() {
		cigarParty = new CigarParty();
	}
	
	
	@Test
	public void is_the_weekend_and_successful_party_40_cigars() {
		//Arrange
		//Act
		boolean partySuccessful = cigarParty.haveParty(40, true);
		//Assert
		Assert.assertTrue(partySuccessful);
	}
	
	@Test
	public void is_the_weekend_and_successful_party_100_cigars() {
		//Arrange
		//Act
		boolean partySuccessful = cigarParty.haveParty(100, true);
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
	public void successful_party_on_a_weekday_40_or_more_cigars() {
		//Arrange
		//Act
		boolean partySuccessful = cigarParty.haveParty(45, false);
		//Assert
		Assert.assertTrue(partySuccessful);
	}
	
	@Test
	public void not_a_successful_party_on_a_weekday_less_than_40_cigars() {
		//Arrange
		//Act
		boolean partySuccessful = cigarParty.haveParty(20, false);
		//Assert
		Assert.assertFalse(partySuccessful);
	}
	
	@Test
	public void not_a_successful_party_on_a_weekday_exceeds_60_cigars() {
		//Arrange
		//Act
		boolean partySuccessful = cigarParty.haveParty(70, false);
		//Assert
		Assert.assertFalse(partySuccessful);
	}
	
	@Test
	public void successful_party_60_cigars_on_a_weekday() {
		//Arrange
		//Act
		boolean partySuccessful = cigarParty.haveParty(60, false);
		//Assert
		Assert.assertTrue(partySuccessful);
	}	
	
}
