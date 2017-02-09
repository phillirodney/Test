package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Crocodile;
import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class CrocodileTest {
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
	Crocodile croc = new Crocodile(10, "Francis", "button nose", 50, 40, EnclosureType.REPTILE_CREEK, false, false, "M",
			21, 20, "young adult", "extra large", 300, "fever");

	@Test
	public void testCrocodile() {
		final int age = 5;
		croc.setAge(age);
		assertEquals(5, croc.getAge());
	}

	@Test
	public void testNutrition() {
		croc.nutrition();
		assertEquals();
	}

	@Test
	public void testGrowth() {
		fail("Not yet implemented");
	}

	@Test
	public void testReproduction() {
		fail("Not yet implemented");
	}

	@Test
	public void testSensitivity() {
		fail("Not yet implemented");
	}

	@Test
	public void testSwim() {
		fail("Not yet implemented");
	}

}
