package com.philli.zoopackage.main.java;

public class Penguin extends Bird implements Swim {

	private String relationshipStatus;

	/**
	 * 
	 * @param age
	 * @param name
	 * @param species
	 * @param weight
	 * @param height
	 * @param enclosure
	 * @param endangered
	 * @param nocturnal
	 * @param gender
	 * @param featherColour
	 * @param wingSpan
	 * @param relationshipStatus
	 * @param hoursAfterEating 
	 */
	public Penguin(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, String featherColour, double wingSpan,
			String relationshipStatus, int hoursAfterEating) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, featherColour, wingSpan, hoursAfterEating);
		this.relationshipStatus = relationshipStatus;
	}

	@Override
	public void floats() {
		// float method

	}

	@Override
	public void nutrition() {
		if (getWeight() < 30) {
			System.out.println("weight is " + getWeight() + ", malnurished, eat more");
		} else {
			System.out.println("weight is " + getWeight() + ", nutrition levels are acceptable");
		}		}

	public String getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	@Override
	public void reproduction() {
		if (getGender().equals("F")) {
			System.out.println(getName() + " will have a gestation period of 63 days and will take turns with the male penguin to incubate the egg");
		} else if (getGender().equals("M")){
			System.out.println(getName() + " will incubate the egg while the female penguin goes off to feed");
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
