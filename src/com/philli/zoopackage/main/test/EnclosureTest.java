package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;
import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

import org.junit.Test;

public class EnclosureTest{

	
	@Test
	public void testCreateEnclousreTestObject() {
		EnclosureType e = EnclosureType.AMPHIBIAN; 
		assertNotNull(e);
		
	}
	@Test
	public void testCheckEnclosureHasAmphibian() {
		EnclosureType testObject =  EnclosureType.AMPHIBIAN; 
assertEquals(testObject, "AMPHIBIAN");
	}



}
