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
	 * @param excretion
	 * @param stage
	 * @param enclosureSize
	 * @param respRate
	 * @param sensResp 
	 */
	public Penguin(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, String featherColour, double wingSpan,
			String relationshipStatus, int hoursAfterEating, int excretion, String stage, String enclosureSize,
			int respRate, String sensResp) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, featherColour, wingSpan,
				hoursAfterEating, excretion, stage, enclosureSize, respRate, sensResp);
		this.relationshipStatus = relationshipStatus;
	}

	@Override
	public void floats() {
		// float method

	}

	@Override
	public void nutrition() {
		switch (getStage()) {
		case "baby":
			this.setWeight(getWeight() + 20);
			break;
		case "young adult":
			this.setWeight(getWeight() + 40);

			break;
		case "adult":
			this.setWeight(getWeight() + 60);
			break;
		default:
			this.setWeight(getWeight());
			break;
		}
	}

	@Override
	public void reproduction() {
		if (("F").equals(getGender())) {
			setExcretion(getExcretion() + 10);
		} else {
			this.setEnclosureSize("small");
		}
	}

	@Override
	public void sensitivity() {
		if (getExcretion() > 30) {
			this.setSensResp("shiver");
		}
		else {
			this.setSensResp("normal");
		}
	}

	public String getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}
}
