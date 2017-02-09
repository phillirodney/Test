package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Cat;
import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class CatTest {
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
	 * @param dangerous
	 * @param hoursAfterEating
	 * @param excretion
	 * @param stage
	 * @param enclosureSize
	 * @param respRate
	 * @param sensResp
	 */
	Cat cat = new Cat(11, "Chrissy", "Persian", 10, 20, EnclosureType.FELINE_FUN, true, true, "F", false, 3, 0,
			"baby", "large", 0, null);

	/**
	 * stage = baby weight = 10 + 2
	 */
	@Test
	public void testNutrition() {
		cat.nutrition();
		assertEquals(12, cat.getWeight());
	}

	/**
	 * height = 20 
	 * stage = adult
	 */
	@Test
	public void testGrowth() {
		cat.growth();
		assertEquals("adult", cat.getStage());
	}
	/**
	 * gender = F
	 * excretion = 0 + 10
	 */
	@Test
	public void testReproduction() {
		cat.reproduction();
		assertEquals(10, cat.getExcretion());
	}

	/**
	 * excretion = 0 
	 * sensResp = normal
	 */
	@Test
	public void testSensitivity() {
		cat.sensitivity();
		assertEquals("normal", cat.getSensResp());
	}
	
	/**
	 * excretion = 100
	 * sensResp = normal
	 */
	@Test
	public void testSetExcretionAndGetSensitivity() {
		cat.setExcretion(100);
		cat.sensitivity();
		assertEquals("shiver", cat.getSensResp());
	}
	
	@Test
	public void testIsDangerous() {
		cat.setDangerous(true);
		assertTrue("animal has been updated to status: not nocturnal", cat.isDangerous() == true);
	}

	@Test
	public void testGetCatEnclosureType() {
		EnclosureType e = EnclosureType.FELINE_FUN;
		assertEquals(e, EnclosureType.FELINE_FUN);
	}

}
