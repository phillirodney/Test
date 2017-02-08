package com.philli.zoopackage.main.java;

public class Mammal extends Animal implements Run {

	
	public Mammal(int age, String name, String species, String breed, int weight, int height, EnclosureType enclosure, boolean endangered, boolean nocturnal, String gender) {
		super(age, name, species, breed, weight, height, enclosure, endangered, nocturnal, gender);
	}

	@Override
	public void reproduction() {
		// reproduction method
	}

	@Override
	public void growth() {
		// growth method
	}

	@Override
	public void sprint() {
		// overridden run method, inherited from the Run interface
	}
}
