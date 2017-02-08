package com.philli.zoopackage.main.java;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class ZooMain {

	public static void main(String[] args) {
		System.out.println("Zoo Main");
		Bat b = new Bat(11, "Batley", "fruitbat", 11, 5, EnclosureType.WORLD_OF_WINGS, false, false, "F");
		b.flight();
		b.nutrition();
		b.land();
		b.growth();

	}
}
