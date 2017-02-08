package com.philli.zoopackage.main.java;

public class Pigeon extends Bird implements Flying{

	public Pigeon(int age, String name, String species, String breed, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal) {
		super(age, name, species, breed, weight, height, enclosure, endangered, nocturnal);
	}

	@Override
	public void flight() {
		// flight method
	}

	@Override
	public void land() {
		//land method
	}

	@Override
	public void takeOff() {
		//take off method
	}
	

	@Override
	public void nutrition() {
		// nutrition method

	}

}
