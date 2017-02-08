package com.philli.zoopackage.main.java;

public class Bird extends Animal {

	public Bird(int age, String name, String species, String breed, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal) {
		super(age, name, species, breed, weight, height, enclosure, endangered, nocturnal);
		
	}

	@Override
	public void growth() {
		//growth method
	}
}
