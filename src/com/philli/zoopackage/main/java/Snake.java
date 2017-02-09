package com.philli.zoopackage.main.java;

public class Snake extends Reptile implements Swim {

	private boolean venemous;
	private String colour;
	private String pattern;

	public Snake(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, boolean venemous, String colour, String pattern,
			int hoursAfterEating) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating);

		this.venemous = venemous;
		this.colour = colour;
		this.pattern = pattern;
	}

	@Override
	public void floats() {
		// float method

	}

	public boolean isVenemous() {
		return venemous;
	}

	public void setVenemous(boolean venemous) {
		this.venemous = venemous;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public void growth() {
		if (getHeight() < 5) {
			System.out.println("baby " + getSpecies());

		} else if (getHeight() > 5 && getHeight() < 30) {
			System.out.println("young adult " + getSpecies());

		} else {
			System.out.println("adult " + getSpecies());
		}
	}

	@Override
	public void nutrition() {
		if (getWeight() < 2) {
			System.out.println("weight is " + getWeight() + ", malnurished, eat more");
		} else {
			System.out.println("weight is " + getWeight() + ", nutrition levels are acceptable");

		}
	}

	@Override
	public void reproduction() {
		if (getGender().equals("F")) {
			System.out.println(getName() + " will have a gestation period of 3 - 9 months");
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
