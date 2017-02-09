package com.philli.zoopackage.main.java;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class ZooMain {

	public static void main(String[] args) {
		System.out.println("Zoo Main");
		System.out.println("\n");

		//age, name, species, weight, height, worldOfWings, nocturnal, endangered, gender
		Bat bat = new Bat(20, "Batley", "fruitbat", 2, 20, EnclosureType.WORLD_OF_WINGS, false, false, "F", 1);
		bat.flight();
		bat.nutrition();
		bat.land();
		bat.growth();
		bat.takeOff();
		System.out.println("\n");

		Cat cat = new Cat(5, "Mr Floofy Poofs", "Ocelot", 11, 10, EnclosureType.FELINE_FUN, false, false, "F", false, 0);
		cat.growth();
		cat.nutrition();
		cat.sprint();
		System.out.println("\n");

		Crocodile croc = new Crocodile(150, "noot noot", "broad snouted caiman", 80, 90, EnclosureType.REPTILE_CREEK, false, false, "M", 0);
		croc.nutrition();
		croc.floats();
		croc.growth();
		System.out.println("\n");

		Fish fish = new Fish(2, "Sarah", "black ghost knifefish", 3, 5, EnclosureType.FISH_PARADISE, false, false, "F", 0);
		fish.floats();
		fish.growth();
		fish.movement();
		fish.nutrition();
		fish.respiration();
		System.out.println("\n");

		//int age, String name, String species, int weight, int height, EnclosureType enclosure,
		//boolean endangered, boolean nocturnal, String gender, String featherColour, double wingSpan
		Penguin penguin = new Penguin(3, "Captain Feathers", "emperor penguin", 8, 9, EnclosureType.WORLD_OF_WINGS, true, false, "M", "pink", 0, "single", 0);
		penguin.growth();
		penguin.nutrition();
		System.out.println("\n");

		Pigeon pigeon = new Pigeon(30, "Greg", "nicobar pigeon", 10, 10, EnclosureType.WORLD_OF_WINGS, false, false, "F", "yellow", 10, 0);
		pigeon.flight();
		pigeon.land();
		pigeon.takeOff();
		pigeon.nutrition();
		System.out.println("\n");

		Snake snake = new Snake(4, "Cola", "cornsnake", 5, 7, EnclosureType.REPTILE_CREEK, false, false, "F", false, "black", "circles", 0);
		snake.floats();
		System.out.println("\n");

		
	}
}
