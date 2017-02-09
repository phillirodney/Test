package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;
import com.philli.zoopackage.main.java.Snake;

public class SnakeTest {

	Snake s = new Snake(2, "fanta", "albino cornsnake", 2, 2, EnclosureType.REPTILE_CREEK, false, true, "f", false,
			"coral", "pentagons", 1, 0, "young adult", "large", 0, null);

	@Test
	public void testGetSpecies() {
		String species = s.getSpecies();
		assertEquals(species, "albino cornsnake");
	}

	@Test
	public void testGetEnclosureType() {
		EnclosureType e = EnclosureType.REPTILE_CREEK;
		assertEquals(e, EnclosureType.REPTILE_CREEK);
	}

	@Test
	public void testGetName() {
		String name = s.getName();
		assertEquals(name, "fanta");
	}

	@Test
	public void testIsVenemous() {
		Boolean venemous = s.isVenemous();
		assertTrue("snake is not venemous", venemous == false);
	}

	@Test
	public void testGetColour() {
		String colour = s.getColour();
		assertEquals(colour, "coral");
	}

	@Test
	public void testGetPattern() {
		String pattern = s.getPattern();
		assertEquals(pattern, "pentagons");
	}

}
