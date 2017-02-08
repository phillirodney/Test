package com.philli.zoopackage.main.java;

public class Pigeon extends Bird implements Flying {

	public Pigeon(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, String featherColour, int wingSpan) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, featherColour, wingSpan);
	}

	@Override
	public void flight() {
		// flight method
		if (getWeight() > 25) {
			System.out.println("fat pigeon flies slower with a weight of " + getWeight());
		} else {
			System.out.println("pigeon flies fast with a weight of " + getWeight());

		}

	}

	@Override
	public void land() {
		// land method
		if (getWeight() > 25) {
			System.out.println("2 landing attempts with a weight of " + getWeight());
		} else {
			System.out.println("perfect landing first time with a weight of " + getWeight());

		}
	}

	@Override
	public void takeOff() {
		// take off method
		if (getWeight() > 25) {
			System.out.println("2 landing attempts with a weight of " + getWeight());
		} else {
			System.out.println("perfect landing first time with a weight of " + getWeight());

		}
	}

	@Override
	public void nutrition() {
		// nutrition method
		super.nutrition();

	}

}
