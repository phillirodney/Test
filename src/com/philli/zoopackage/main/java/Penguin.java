package com.philli.zoopackage.main.java;

public class Penguin extends Bird implements Swim {

	private String relationshipStatus; 
	public Penguin(int age, String name, String species, String breed, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal) {
		super(age, name, species, breed, weight, height, enclosure, endangered, nocturnal);
	}

	@Override
	public void floats() {
		// float method

	}

	@Override
	public void nutrition() {
		// nutrition method

	}

	public String getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}
}
