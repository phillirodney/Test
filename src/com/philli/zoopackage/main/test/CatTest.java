package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Cat;
import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class CatTest {
	// int age, String name, String species, String breed,
	// int weight, int height, EnclosureType enclosure,
	// boolean endangered, boolean nocturnal, String gender, boolean dangerous

	Cat cat = new Cat(11, "Chrissy", "Persian", 0, 0, EnclosureType.FELINE_FUN, false, false, null, false);

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

	@Test
	public void testNutrition() {
		cat.nutrition();
	}

	@Test
	public void testGrowth() {

	}
}
