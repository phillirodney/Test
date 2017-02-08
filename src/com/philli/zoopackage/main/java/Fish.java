package com.philli.zoopackage.main.java;

public class Fish extends Animal implements Swim {

	public Fish(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender);
	}

	@Override
	public void floats() {
		// float method

	}

	@Override
	public void growth() {
		// growth method
		if (getHeight()< 1) {
			System.out.println("baby " + getSpecies());
			
		} else if (getHeight() > 1 && getHeight() < 2) {
			System.out.println("young adult " + getSpecies());

		}
			else {
				System.out.println("adult " + getSpecies());
			}	

	}

	@Override
	public void movement() {
		// movement method
		super.movement();
	}

	@Override
	public void nutrition() {
		// nutrition method
		if (getWeight() < 1) {
			System.out.println("weight is " + getWeight() + ", malnurished, eat more");
		} else {
			System.out.println("weight is " + getWeight() + ", nutrition levels are acceptable");
		}

	}

	@Override
	public void respiration() {
		// respiration method
		super.respiration();
	}

	

}
