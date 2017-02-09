package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;
import com.philli.zoopackage.main.java.Penguin;

public class PenguinTest {
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
	 * @param relationshipStatus
	 * @param hoursAfterEating
	 * @param excretion
	 * @param stage
	 * @param enclosureSize
	 * @param respRate
	 * @param sensResp
	 */
	Penguin p = new Penguin(24, "Andrew", "Great Emperor", 9, 1, 
			EnclosureType.PENGUIN_SHORES, false, false, "M",
			"grey", 1.00, "complicated", 2, 0, "young adult", "large", 0, null);

	/**
	 * stage = young adult weight = 9 + 40
	 */
	@Test
	public void testNutrition() {
		p.nutrition();
		assertEquals(49, p.getWeight());
	}

	/**
	 * gender = M excretion = 0 + 0
	 */
	@Test
	public void testReproduction() {
		p.reproduction();
		assertEquals(0, p.getExcretion());

	}

	/**
	 * excretion = 0
	 * sensresp = "normal"
	 */
	@Test
	public void testSensitivity() {
		p.sensitivity();
		assertEquals("normal", p.getSensResp());

	}

	@Test
	public void testSwim() {

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
