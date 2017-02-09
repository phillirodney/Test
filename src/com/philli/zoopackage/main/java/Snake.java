package com.philli.zoopackage.main.java;

public class Snake extends Reptile implements Swim {

	private boolean venemous;
	private String colour;
	private String pattern;

	public Snake(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, boolean venemous, String colour, String pattern,
			int hoursAfterEating, int excretion, String stage, String enclosureSize, int respRate, String sensResp) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating, excretion,
				stage, enclosureSize, respRate, sensResp);

		this.venemous = venemous;
		this.colour = colour;
		this.pattern = pattern;
	}

	@Override
	public void growth() {
		if (getHeight() < 40) {
			this.setStage("baby");
		} else if (getHeight() > 40 && getHeight() < 300) {
			this.setStage("young adult");
		} else {
			this.setStage("adult");

		}
	}

	@Override
	public void nutrition() {
		switch (getStage()) {
		case "baby":
			this.setWeight(getWeight() + 10);
			break;
		case "young adult":
			this.setWeight(getWeight() + 15);

			break;
		case "adult":
			this.setWeight(getWeight() + 20);
			break;
		default:
			this.setWeight(getWeight());
			break;
		}
	}

	@Override
	public void reproduction() {
		if (("F").equals(getGender())) {
			setExcretion(getExcretion() + 11);
		} else {
			this.setEnclosureSize("small");
		}
	}

	@Override
	public void sensitivity() {
		if (getExcretion() > 5) {
			this.setSensResp("fever");
		} else {
			this.setSensResp("normal");
		}
	}

	@Override
	public void swim() {
		int swimSpeed = 0;
		switch (getStage()) {
		case "baby":
			swimSpeed = 600;
			break;
		case "young adult":
			swimSpeed = 1000;
			break;
		case "adult":
			swimSpeed = 800;
			break;
		default:
			swimSpeed = 750;
			break;
		}
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

}
