package com.philli.zoopackage.main.java;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class ZooMain {

	public static void main(String[] args) {
		System.out.println("Zoo Main");
		//age, name, species, weight, height, worldOfWings, nocturnal, endangered, gender
		Bat bat = new Bat(20, "Batley", "fruitbat", 2, 20, EnclosureType.WORLD_OF_WINGS, false, false, "F");
		bat.flight();
		bat.nutrition();
		bat.land();
		bat.growth();
		bat.takeOff();
		//int age, String name, String species, int weight, int height, EnclosureType enclosure,
		//boolean endangered, boolean nocturnal, String gender, String featherColour, double wingSpan
		Penguin penguin = new Penguin(3, "Captain Feathers", "emperor penguin", 8, 9, EnclosureType.WORLD_OF_WINGS, true, false, "M", "pink", 0, "single");
		penguin.growth();
		penguin.nutrition();
		Cat cat = new Cat(5, "Mr Floofy Poofs", "Ocelot", 11, 10, EnclosureType.FELINE_FUN, false, false, "F", false);
		cat.growth();
		cat.nutrition();
		cat.sprint();
		
		
	}
}
