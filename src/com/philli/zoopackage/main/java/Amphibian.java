package com.philli.zoopackage.main.java;

public class Amphibian extends Animal {

	public Amphibian(int age, String name, String species, String breed, int weight, int height,
			EnclosureType enclosure, boolean endangered, boolean nocturnal) {
		super(age, name, species, breed, weight, height, enclosure, endangered, endangered);
	}

	@Override
	public void nutrition() {
		// nutrition method
	}

	public void floats() {
		// floats method
	}

	@Override
	public void growth() {
		// growth method
	}

}
