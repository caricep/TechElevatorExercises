package com.techelevator;

import java.util.HashMap;
import java.util.Map;

import org.junit.*;

public class AnimalGroupNameTest {

	private AnimalGroupName animalGroupName;
	
	@Before
	public void createAnimalGroup() {
		animalGroupName = new AnimalGroupName();
	}
	
	
	@Test
	public void animal_and_animal_group_created_and_found_in_map() {
		//Arrange
		Map<String, String> animalGroup = new HashMap<>();
		//Act
		animalGroup.put("rhino", "Crash");
		animalGroup.put("giraffe", "Tower");
		animalGroup.put("elephant", "Herd");
		animalGroup.put("lion", "Herd");
		animalGroup.put("crow", "Murder");
		animalGroup.put("pigeon", "Kit");
		animalGroup.put("flamingo", "Pat");
		animalGroup.put("deer", "Herd");
		animalGroup.put("dog", "Pack");
		animalGroup.put("crocodile", "Float");
		
		//Assert
		Assert.assertEquals("Crash", animalGroupName.getHerd("rhino"));
		Assert.assertEquals("Tower", animalGroupName.getHerd("giraffe"));
		Assert.assertEquals("Herd", animalGroupName.getHerd("elephant"));
	}
	
	@Test
	public void animals_with_same_animal_group_name() {
		//Arrange
		Map<String, String> animalGroup = new HashMap<>();
		//Act
		animalGroup.put("rhino", "Crash");
		animalGroup.put("giraffe", "Tower");
		animalGroup.put("elephant", "Herd");
		animalGroup.put("lion", "Herd");
		animalGroup.put("crow", "Murder");
		animalGroup.put("pigeon", "Kit");
		animalGroup.put("flamingo", "Pat");
		animalGroup.put("deer", "Herd");
		animalGroup.put("dog", "Pack");
		animalGroup.put("crocodile", "Float");
		
		//Assert
		Assert.assertEquals("Herd", animalGroupName.getHerd("elephant"));
		Assert.assertEquals("Herd", animalGroupName.getHerd("lion"));
		Assert.assertEquals("Herd", animalGroupName.getHerd("deer"));
	}
	
	@Test
	public void get_animal_group_case_insensitive() {
		//Arrange
		Map<String, String> animalGroup = new HashMap<>();
		//Act
		animalGroup.put("rhino", "Crash");
		animalGroup.put("giraffe", "Tower");
		animalGroup.put("elephant", "Herd");
		animalGroup.put("lion", "Herd");
		animalGroup.put("crow", "Murder");
		animalGroup.put("pigeon", "Kit");
		animalGroup.put("flamingo", "Pat");
		animalGroup.put("deer", "Herd");
		animalGroup.put("dog", "Pack");
		animalGroup.put("crocodile", "Float");		
		
		//Assert
		Assert.assertEquals("Crash", animalGroupName.getHerd("Rhino"));
		Assert.assertEquals("Crash", animalGroupName.getHerd("RHINO"));
		Assert.assertEquals("Crash", animalGroupName.getHerd("rhiNO"));
		Assert.assertEquals("Crash", animalGroupName.getHerd("rHiNo"));
	}
	
	@Test
	public void animal_group_unknown() {
		//Arrange
		Map<String, String> animalGroup = new HashMap<>();
		//Act
		animalGroup.put("rhino", "Crash");
		animalGroup.put("giraffe", "Tower");
		animalGroup.put("elephant", "Herd");
		animalGroup.put("lion", "Herd");
		animalGroup.put("crow", "Murder");
		animalGroup.put("pigeon", "Kit");
		animalGroup.put("flamingo", "Pat");
		animalGroup.put("deer", "Herd");
		animalGroup.put("dog", "Pack");
		animalGroup.put("crocodile", "Float");			
		
		//Assert
		Assert.assertEquals("unknown", animalGroupName.getHerd(""));
		Assert.assertEquals("unknown", animalGroupName.getHerd("walrus"));
	}	
	
	@Test
	public void animal_name_entered_as_plural_returns_unknown() {
		//Arrange
		Map<String, String> animalGroup = new HashMap<>();
		//Act
		animalGroup.put("rhino", "Crash");
		animalGroup.put("giraffe", "Tower");
		animalGroup.put("elephant", "Herd");
		animalGroup.put("lion", "Herd");
		animalGroup.put("crow", "Murder");
		animalGroup.put("pigeon", "Kit");
		animalGroup.put("flamingo", "Pat");
		animalGroup.put("deer", "Herd");
		animalGroup.put("dog", "Pack");
		animalGroup.put("crocodile", "Float");			
		
		//Assert
		Assert.assertEquals("unknown", animalGroupName.getHerd("elephants"));
		Assert.assertEquals("unknown", animalGroupName.getHerd("dogs"));
	}		
	
	@Test
	public void update_animal_group_name_in_map() {
		//Arrange
		Map<String, String> animalGroup = new HashMap<>();
		//Act
		animalGroup.put("rhino", "Crash");
		animalGroup.put("giraffe", "Tower");
		animalGroup.put("elephant", "Herd");
		animalGroup.put("lion", "Herd");
		animalGroup.put("crow", "Murder");
		animalGroup.put("pigeon", "Kit");
		animalGroup.put("flamingo", "Pat");
		animalGroup.put("deer", "Herd");
		animalGroup.put("dog", "Pack");
		animalGroup.put("crocodile", "Float");			
		
		//Updates lion's animal group name to "Pride" instead of "Herd"
		animalGroup.put("lion", "Pride");
		
		
		//Assert
		Assert.assertEquals("Pride", animalGroupName.getHerd("lion"));
	}		
	
	@Test
	public void animal_case_insensitive_found_in_updated_map() {
		//Arrange
		Map<String, String> animalGroup = new HashMap<>();
		//Act
		animalGroup.put("rhino", "Crash");
		animalGroup.put("giraffe", "Tower");
		animalGroup.put("elephant", "Herd");
		animalGroup.put("lion", "Pride");
		animalGroup.put("crow", "Murder");
		animalGroup.put("pigeon", "Kit");
		animalGroup.put("flamingo", "Pat");
		animalGroup.put("deer", "Herd");
		animalGroup.put("dog", "Pack");
		animalGroup.put("crocodile", "Float");
		
		//Assert
		Assert.assertEquals("Pride", animalGroupName.getHerd("LION"));
		Assert.assertEquals("Tower", animalGroupName.getHerd("Giraffe"));
		Assert.assertEquals("Herd", animalGroupName.getHerd("elePHANT"));
	}	
	
	@Test
	public void updated_lion_group_name_animals_with_same_animal_group_name() {
		//Arrange
		Map<String, String> animalGroup = new HashMap<>();
		//Act
		animalGroup.put("rhino", "Crash");
		animalGroup.put("giraffe", "Tower");
		animalGroup.put("elephant", "Herd");
		animalGroup.put("lion", "Herd");
		animalGroup.put("crow", "Murder");
		animalGroup.put("pigeon", "Kit");
		animalGroup.put("flamingo", "Pat");
		animalGroup.put("deer", "Herd");
		animalGroup.put("dog", "Pack");
		animalGroup.put("crocodile", "Float");
		
		animalGroup.put("lion", "Pride");
		
		//Assert
		Assert.assertEquals("Herd", animalGroupName.getHerd("elephant"));
		Assert.assertEquals("Pride", animalGroupName.getHerd("lion"));
		Assert.assertEquals("Herd", animalGroupName.getHerd("deer"));
	}	
}