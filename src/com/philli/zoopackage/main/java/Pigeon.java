package com.philli.zoopackage.main.java;

public class Pigeon extends Bird implements Flying {

	public Pigeon(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, String featherColour, int wingSpan) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, featherColour, wingSpan);
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

	@Override
	public void nutrition() {
		// nutrition method

	}

}
