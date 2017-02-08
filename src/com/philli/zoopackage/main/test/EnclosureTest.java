package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

import org.junit.Test;

public class EnclosureTest {

	@Test
	public void testCreateEnclousreTestObject() {
		EnclosureType e = EnclosureType.AMPHIBIAN_ARCADE;
		assertNotNull(e);

	}

	@Test
	public void testCheckEnclosureHasAmphibian() {
		EnclosureType testObject = EnclosureType.GUINEAPIG_GREENLAND;
		assertEquals(testObject, EnclosureType.GUINEAPIG_GREENLAND);
	}

}
