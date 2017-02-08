package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Animal;
import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class AnimalTest {

	/**
	 * @param age
	 * @param name
	 * @param species
	 * @param breed
	 * @param weight
	 * @param height
	 *
	 */
	Animal animal = new Animal(1, "salt", "mammal", "guineapig", 1, 1, EnclosureType.GUINEAPIG_GREENLAND, false, false, "M");

	@Test
	public void testGetAge() {
		int age = animal.getAge();
		assertEquals(age, 1);
	}
	
	@Test
	public void testGetName() {
		String name = animal.getName();
		assertEquals(name, "salt");
	}
	
	@Test
	public void testGetSpecies() {
		String species = animal.getSpecies();
		assertEquals(species, "mammal");
	}
	@Test
	public void testGetBreed() {
		String breed = animal.getBreed();
		assertEquals(breed, "guineapig");
	}
	@Test
	public void testGetWeight() {
		int weight = animal.getWeight();
		assertEquals(weight, 1);
	}
	@Test
	public void testGetHeight() {
		int height = animal.getHeight();
		assertEquals(height, 1);
	}
	        
	@Test
	public void testSetHeight() {
	animal.setHeight(5);
		assertTrue("animal height has been modified", animal.getHeight() == 5);
		assertFalse("animal height has not been modified", animal.getHeight() != 5);
	}

	@Test
	public void testGetEnclosureeType() {
		EnclosureType enclosureType = animal.getEnclosureType();
		assertEquals(enclosureType, EnclosureType.GUINEAPIG_GREENLAND);
	}
	
	@Test
	public void testConstructor() {
		final int age = 2; 
		Animal animal = new Animal(age, null, null, null, 0, 0, null, false, false, null);
		assertEquals("constructor accepts int values",age, animal.getAge());
	}
	}
