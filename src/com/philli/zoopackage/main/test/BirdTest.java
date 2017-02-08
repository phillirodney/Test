package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Bird;
import com.philli.zoopackage.main.java.Enclosure;
import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class BirdTest {
	Bird b = new Bird(5, "Peppi", "bird of paradise", 20, 10, EnclosureType.WORLD_OF_WINGS, true, true, "F", "blue",
			20.00);

	@Test
	public void testGrowth() {

	}

	@Test
	public void testBird() {
	}

	@Test
	public void testGetFeatherColour() {
		String colour = b.getFeatherColour();
		assertEquals(colour, "blue");
	}

	@Test
	public void testSetFeatherColour() {
		b.setFeatherColour("orange");
		assertTrue("featherColour has been modified", b.getFeatherColour().equals("orange"));	
		assertFalse("featherColour has not been modified", b.getFeatherColour().equals("blue"));	}


	@Test
	public void testSetWingSpan() {
		b.setWingSpan(10.00);
		assertTrue("wingSpan has been modified", b.getWingSpan()== 10.00);
		assertFalse("wingSpan has not been modified", b.getWingSpan()!= 10.00);

	}
	@Test
	public void testGetBirdEnclosureType() {
		EnclosureType e = EnclosureType.WORLD_OF_WINGS;
		assertEquals(e, EnclosureType.WORLD_OF_WINGS);
	}
}
