package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;
import com.philli.zoopackage.main.java.Fish;

public class FishTest {

	/**
	 * 
	 * @param age
	 * @param name
	 * @param species
	 * @param weight
	 * @param height
	 * @param enclosure
	 * @param endangered
	 * @param nocturnal
	 * @param gender
	 * @param hoursAfterEating
	 * @param excretion
	 * @param stage
	 * @param enclosureSize
	 * @param respRate
	 * @param sensResp
	 */

	Fish fish = new Fish(3, "Destiny", "whale fish", 20, 2, EnclosureType.FISH_PARADISE, true, true, "F", 8, 6,
			"adult", "extra large", 300, "normal");

	@Test
	public void testFish() {
		final String gender = "M";
		fish.setGender(gender);
		assertEquals("M", fish.getGender());

	}

	/**
	 * height = 200
	 * stage = adult
	 */
	@Test
	public void testGrowth() {
		fish.growth();
		assertEquals("adult", fish.getStage());
	}

	/**
	 * stage = adult
	 * weight = 23
	 */
	@Test
	public void testNutrition() {
		fish.nutrition();
		assertEquals(23, fish.getWeight());
	}

	/**
	 * gender = F 
	 * excretion = 6 + 3
	 */
	@Test
	public void testReproduction() {
		fish.reproduction();
		assertEquals(9, fish.getExcretion());	}

	/**
	 * excretion = 6 
	 * sensResp = normal
	 */
	@Test
	public void testSensitivity() {
		fish.sensitivity();
		assertEquals("normal", fish.getSensResp());	}

	/*@Test
	public void testSwim() {
		fail("Not yet implemented");
	}*/

}
