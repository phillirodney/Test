package com.philli.zoopackage.main.java;

public class Bat extends Mammal implements Flying {

	public Bat(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender);
		// user defined
	}

	@Override
	public void nutrition() {
		// overridden nutrition method
	}

	@Override
	public void flight() {
		// flight method

	}

	@Override
	public void land() {
		// land method
	}

	@Override
	public void takeOff() {
		// take off method

	}

}
