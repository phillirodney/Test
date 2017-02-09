package com.philli.zoopackage.main.java;

public class Crocodile extends Reptile implements Swim {

	public Crocodile(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, int hoursAfterEating) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating);
	}

	@Override
	public void floats() {
		// float method

	}

	@Override
	public void nutrition() {
		// nutrition method
		if (getWeight()< 10) {
			System.out.println("weight is " + getWeight() + ", malnurished, eat more");
		} else {
			System.out.println("weight is " + getWeight() + ", nutrition levels are acceptable");

		}

	}

	@Override
	public void growth() {
		if (getHeight()< 10) {
			System.out.println("baby " + getSpecies());
			
		} else if (getHeight() > 10 && getHeight() < 40) {
			System.out.println("young adult " + getSpecies());

		}
			else {
				System.out.println("adult " + getSpecies());
			}			
	}

	@Override
	public void reproduction() {
		if (getGender().equals("F")) {
			System.out.println(getName() + " will have a gestation period of 65 days and will lay 35-90 eggs");
		} else if (getGender().equals("M")){
			System.out.println(getName() + " is male and cannot reproduce");
		}
		else {
			System.out.println(getName() + " is complicated");
		}		
	}

	@Override
	public void sensitivity() {
		// TODO Auto-generated method stub
		
	}

	
}
