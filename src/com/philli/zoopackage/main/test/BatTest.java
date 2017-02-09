package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Bat;
import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class BatTest {
	/**
	 * 
	 * @param age
	 * @param name
	 * @param species
	 * @param weight
	 * @param height
	 * @param worldOfWings
	 * @param nocturnal
	 * @param endangered
	 * @param gender
	 * @param hoursAfterEating
	 * @param excretion
	 * @param stage
	 * @param enclosureSize
	 * @param respRate
	 * @param sensResp
	 * @param flightSpeed
	 */
	Bat b = new Bat(11, "Batley", "fruitbat", 11, 5, EnclosureType.WORLD_OF_WINGS, false, false, "F", 5, 0,
			"young adult", "large", 0, null, 0);

	/**
	 * stage = "young adult" weight = 11 + 2
	 */
	@Test
	public void testNutrition() {
		b.nutrition();
		assertEquals(13, b.getWeight());
	}

	@Test
	public void testFlight() {
		b.flight();

		assertEquals(100, b.getFlightSpeed());
	}

	/**
	 * fight speed = 0 respRate = 100
	 */
	@Test
	public void testLand() {
		b.land();
		assertEquals(100, b.getRespRate());
	}

	/**
	 * weight = 11
	 * flight speed = 150
	 */
	@Test
	public void testTakeoff() {
		b.takeOff();
		assertEquals(150, b.getFlightSpeed());
	}
	/**
	 * height = 5 stage = adult
	 */
	@Test
	public void testGrowth() {
		b.growth();
		assertEquals("adult", b.getStage());
	}
/**
 * stage = young adult 
 * enclosuresize = small
 */
	@Test
	public void testMovement() {
		b.movement();
		assertEquals("small", b.getEnclosureSize());
	}
	/**
	 * gender = F
	 * excretion = 0 + 2 
	 */
	@Test
	public void testReproduction() {
		b.reproduction();
		assertEquals(2, b.getExcretion());
	}
	
	/**
	 * excretion = 0 
	 * sensResp = normal
	 */
	@Test
	public void testSensitivity() {
		b.sensitivity();
		assertEquals("normal", b.getSensResp());
	}
	
	
}
