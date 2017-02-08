package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Bat;
import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class BatTest {
	Bat b = new Bat(11, "Batley", "fruitbat", 11, 5, EnclosureType.WORLD_OF_WINGS, false, false, "F");

	@Test
	public void testFlight() {
		b.flight();

	}

	@Test
	public void testNutrition() {
		b.nutrition();
	}

	@Test
	public void testLand() {
		b.land();
	}

	@Test
	public void testGrowth() {
		b.growth();
	}

}
