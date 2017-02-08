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
	 */
	Penguin p = new Penguin(24, "Andrew", "Great Emperor", 9, 1, EnclosureType.PENGUIN_SHORES, false, false, "M",
			"grey", 1.00, "complicated");

	@Test
	public void testGetRelationshipStatus() {
		String rel = p.getRelationshipStatus();
		assertEquals(rel, "complicated");
	}

}
