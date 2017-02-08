package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Bat;
import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class BatTest {
	Bat b = new Bat(11, "Batley", "fruitbat", 11, 5, EnclosureType.WORLD_OF_WINGS, false, false, "F");

	@Test
	public void testFlight() {
		b.setWeight(2);
		assertTrue("featherColour has been modified", b.getWeight() == 2);	
		assertFalse("featherColour has been modified", b.getWeight() != 2);	


	}

}
