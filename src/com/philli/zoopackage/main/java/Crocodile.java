package com.philli.zoopackage.main.java;

public class Crocodile extends Reptile implements Swim {

	public Crocodile(int age, String name, String species, String breed, int weight, int height,
			EnclosureType enclosure, boolean endangered, boolean nocturnal, String gender) {
		super(age, name, species, breed, weight, height, enclosure, endangered, nocturnal, gender);
	}

	@Override
	public void floats() {
		// float method

	}
	@Override
	public void nutrition() {
		// nutrition method

	}
}
