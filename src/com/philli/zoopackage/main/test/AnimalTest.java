package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Bat;
import com.philli.zoopackage.main.java.Cat;
import com.philli.zoopackage.main.java.Crocodile;
import com.philli.zoopackage.main.java.Fish;
import com.philli.zoopackage.main.java.Penguin;
import com.philli.zoopackage.main.java.Snake;
import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class AnimalTest {
	Bat bat = new Bat(20, "Batley", "fruitbat", 2, 20, EnclosureType.WORLD_OF_WINGS, false, false, "F", 1, 0,
			"young adult", "large", 0, "shiver", 800);
	Cat cat = new Cat(5, "Mr Floofy Poofs", "Ocelot", 11, 10, EnclosureType.FELINE_FUN, false, false, "F", false, 0, 0,
			"young adult", "large", 0, "shiver");
	Crocodile croc = new Crocodile(150, "noot noot", "broad snouted caiman", 80, 90, EnclosureType.REPTILE_CREEK, false,
			false, "M", 0, 0, "young adult", "large", 0, "shiver");
	Fish fish = new Fish(2, "Sarah", "black ghost knifefish", 3, 5, EnclosureType.FISH_PARADISE, false, false, "F", 0,
			0, "young adult", "large", 0, "shiver", 0);
	Penguin penguin = new Penguin(3, "Captain Feathers", "emperor penguin", 8, 9, EnclosureType.WORLD_OF_WINGS, true,
			false, "M", "pink", 0, "single", 3, 0, "young adult", "large", 0, "shiver", 100);
	Snake snake = new Snake(4, "Cola", "cornsnake", 5, 7, EnclosureType.REPTILE_CREEK, false, false, "F", false,
			"black", "circles", 0, 0, "young adult", "large", 20, "shiver", 0);

	@Test
	public void testExcretion() {
		penguin.excretion();
		assertEquals(1, penguin.getExcretion());
	}

	@Test
	public void testMovement() {
		cat.movement();
		assertEquals("large", cat.getEnclosureSize());

	}

	@Test
	public void testRespiration() {
		snake.respiration();
		assertEquals(80, snake.getRespRate());

	}

	// tests for getters and setters
	@Test
	public void testGetAge() {
		assertEquals(3, penguin.getAge());
	}

	@Test
	public void testSetAge() {
		penguin.setAge(5);
		assertEquals(5, penguin.getAge());
	}

	@Test
	public void testGetName() {
		assertEquals("Captain Feathers", penguin.getName());
	}

	@Test
	public void testSetName() {
		penguin.setName("Cheeky Chappy");
		;
		assertTrue(("Cheeky Chappy").equals(penguin.getName()));
	}

	@Test
	public void testGetSpecies() {
		assertEquals("cornsnake", snake.getSpecies());
	}

	@Test
	public void testSetSpecies() {
		snake.setSpecies("orange mamba");
		assertTrue(("orange mamba").equals(snake.getSpecies()));
	}
}
