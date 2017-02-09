package com.philli.zoopackage.main.java;

public class Bat extends Mammal implements Flying {

	public Bat(int age, String name, String species, int weight, int height, EnclosureType worldOfWings,
			boolean nocturnal, boolean endangered, String gender, int hoursAfterEating) {
		super(age, name, species, weight, height, worldOfWings, nocturnal, endangered, gender, hoursAfterEating);
		// user defined
	}

	@Override
	public void nutrition() {
		// overridden nutrition method
		// if you weigh less than a number you need more nutrition
		if (getWeight() < 2) {
			System.out.println("weight is " + getWeight() + ", malnurished, eat more");
		} else {
			System.out.println("weight is " + getWeight() + ", nutrition levels are acceptable");

		}
	}

	@Override
	public void flight() {
		// flight method
		// if you weigh this much you can fly for this amount of time
		if (getWeight() > 10) {
			System.out.println("fat bat flies slower with a weight of " + getWeight());
		} else {
			System.out.println("bat flies fast with a weight of " + getWeight());

		}
	}

	@Override
	public void land() {
		// land method
		if (getWeight() > 10) {
			System.out.println("2 landing attempts with a weight of " + getWeight());
		} else {
			System.out.println("perfect landing first time with a weight of " + getWeight());

		}
	}

	@Override
	public void takeOff() {
		// take off method
		if (getWeight() > 10) {
			System.out.println("with a weight of " + getWeight() + " take off speed is 50 m/s");
		} else {
			System.out.println("with a weight of " + getWeight() + " take off speed is 100 m/s");

		}

	}

	@Override
	public void growth() {
		// growth method
		// different heights and weights link to different grown sizes?
		if (getHeight() < 2) {
			System.out.println("baby " + getSpecies());

		} else if (getHeight() > 2 && getHeight() < 10) {
			System.out.println("young adult " + getSpecies());

		} else {
			System.out.println("adult " + getSpecies());
		}

	}

	@Override
	public void movement() {
		if (getWeight() < 5) {
			System.out.println("weight is " + getWeight() + getName() + "is moving quickly");
		} else {
			System.out.println("weight is " + getWeight() + getName() + "is moving at a normal pace");
		}

	}

	@Override
	public void reproduction() {
		if (getGender().equals("F")) {
			System.out.println(getName() + " will have a gestation period of 40 days to 6 months and will feed their young with milk");
		} else if (getGender().equals("M")){
			System.out.println(getName() + " is male and cannot reproduce");
		}
		else {
			System.out.println(getName() + " is complicated");
		}
	}

	@Override
	public void sensitivity() {
	

	}

}
