package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Pigeon;
import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class PigeonTest {
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
	 * @param featherColour
	 * @param wingSpan
	 * @param hoursAfterEating
	 * @param excretion
	 * @param stage
	 * @param enclosureSize
	 * @param respRate
	 * @param sensResp
	 * @param flightSpeed
	 */
	Pigeon pidg = new Pigeon(11, "Brian", "wood pigeon", 10, 8, 
			EnclosureType.WORLD_OF_WINGS
			, false, false, "M", "wine red", 5, 2, 100, 
			"baby", "small", 100, "cold sweats", 150);

	/**
	 * weight = 10
	 * resp rate = 100
	 */
	@Test
	public void testFlight() {
		pidg.flight();
		assertEquals(105, pidg.getRespRate());
	}
	
	/**
	 * flight speed = 150
	 * resp rate = 75
	 */
	@Test
	public void testLand() {
		pidg.land();
		assertEquals(75, pidg.getRespRate());

	}
	
	/**
	 * weight = 10
	 * flight speed = 300
	 */
	@Test
	public void testTakeOff() {
		pidg.takeOff();
		assertEquals(300, pidg.getFlightSpeed());

	}
	/**
	 * stage = baby
	 * weight = 10 + 2 
	 */
	@Test
	public void testNutrition() {
		pidg.nutrition();
		assertEquals(12, pidg.getWeight());

	}

	/**
	 * gender = M 
	 * excretion = 100 + 60
	 */
	@Test
	public void testReprodction() {
		pidg.reproduction();
		assertEquals(160, pidg.getExcretion());
	}
	
	/**
	 * excretion = 100
	 * sens resp = cold sweats
	 */
	@Test
	public void testSensitivity() {
		pidg.sensitivity();
		assertEquals("cold sweats", pidg.getSensResp());
	}

	@Test
	public void testGetFlightSpeed() {
		assertEquals(150, pidg.getFlightSpeed());
	}

	@Test
	public void testSetFlightSpeed() {
		pidg.setFlightSpeed(1000);
		assertTrue(pidg.getFlightSpeed() == 1000);
	}
}
