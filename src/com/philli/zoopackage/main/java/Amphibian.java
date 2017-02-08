package com.philli.zoopackage.main.java;

public abstract class Amphibian extends Animal implements Swim {

	public Amphibian(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender);
	}

	@Override
	public void nutrition() {
		// nutrition method
	}

	@Override
	public void floats() {
		// floats method
	}

	@Override
	public void growth() {
		// growth method
	}

}
