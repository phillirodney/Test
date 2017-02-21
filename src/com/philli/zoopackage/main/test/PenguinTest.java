package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;
import com.philli.zoopackage.main.java.Penguin;

public class PenguinTest {
	/**
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
	 * @param relationshipStatus
	 * @param hoursAfterEating
	 * @param excretion
	 * @param stage
	 * @param enclosureSize
	 * @param respRate
	 * @param sensResp
	 * @param swimSpeed
	 */
	Penguin p = new Penguin(24, "Marty", "Great Emperor", 9, 1, EnclosureType.PENGUIN_SHORES, false, false, "M", "grey",
			1.00, "complicated", 2, 0, "young adult", "large", 0, "normal", 800);

	/**
	 * stage = young adult weight = 9 + 40
	 */
	@Test
	public void testNutrition() {
		p.nutrition();
		assertEquals(49, p.getWeight());
	}

	

	

	@Test
	public void testSwim() {
		p.swim();
		assertEquals(500, p.getSwimSpeed());
	}

	@Test
	public void testGetSwimSpeed() {
		assertEquals(800, p.getSwimSpeed());
	}

	@Test
	public void testSetSwimSpeed() {
		p.setSwimSpeed(1000);
		assertTrue(p.getSwimSpeed() == 1000);
	}

	@Test
	public void testGetRelationshipStatus() {
		String rel = p.getRelationshipStatus();
		assertEquals(rel, "complicated");
	}

	@Test
	public void testGetPenguinEnclosureType() {
		EnclosureType e = EnclosureType.PENGUIN_SHORES;
		assertEquals(e, EnclosureType.PENGUIN_SHORES);
	}
}
