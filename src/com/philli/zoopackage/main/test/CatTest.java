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
	Cat cat = new Cat(11, "Chrissy", "Persian", 10, 20, EnclosureType.FELINE_FUN, false, false, null, false, 3, 0,
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
