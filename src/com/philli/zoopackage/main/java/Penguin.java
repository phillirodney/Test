package com.philli.zoopackage.main.java;

public class Penguin extends Bird implements Swim {

	private String relationshipStatus;

	public Penguin(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender,  String featherColour, double wingSpan, String relationshipStatus) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, featherColour, wingSpan);
		this.relationshipStatus = relationshipStatus;
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
