package com.philli.zoopackage.main.java;

public class Bat extends Mammal implements Flying {

	public Bat(int age, String name, String species, int weight, int height, EnclosureType worldOfWings,
			boolean nocturnal, boolean endangered, String gender) {
		super(age, name, species, weight, height, worldOfWings, nocturnal, endangered, gender);
		// user defined
	}

	@Override
	public void nutrition() {
		// overridden nutrition method
		// if you weigh less than a number you need more nutrition
		if (getWeight() < getWeight() * 0.5) {
			System.out.println("malnurished, eat more");
		} else {
			System.out.println("nutrition levels are acceptable");

		}
	}

	@Override
	public void flight() {
		// flight method
		// if you weigh this much you can fly for this amount of time
		if (getWeight() > 10) {
			System.out.println("fat bat flies slower");
		} else {
			System.out.println("bat flies fast");

		}
	}

	@Override
	public void land() {
		// land method
		if (getWeight() > 10) {
			System.out.println("2 landing attempts");
		} else {
			System.out.println("perfect landing first time");

		}
	}

	@Override
	public void takeOff() {
		// take off method

	}

	@Override
	public void growth() {
		//growth method
		//different heights and weights link to different grown sizes?
		if (getHeight()< 5) {
			System.out.println("baby " + getSpecies());
			
		} else if (getHeight() > 5 && getHeight() < 20) {
			System.out.println("young adult " + getSpecies());

		}
			else {
				System.out.println("adult " + getSpecies());
			}
		
	}

}
