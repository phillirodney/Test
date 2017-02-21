package com.philli.zoopackage.main.java;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class Snake extends Reptile implements Swim {

	private boolean venemous;
	private String colour;
	private String pattern;
	private int swimSpeed;

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
	 * @param venemous
	 * @param colour
	 * @param pattern
	 * @param hoursAfterEating
	 * @param excretion
	 * @param stage
	 * @param enclosureSize
	 * @param respRate
	 * @param sensResp
	 * @param swimSpeed 
	 */
	public Snake(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, boolean venemous, String colour, String pattern,
			int hoursAfterEating, int excretion, String stage, String enclosureSize, int respRate, String sensResp, int swimSpeed) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating, excretion,
				stage, enclosureSize, respRate, sensResp);

		this.venemous = venemous;
		this.colour = colour;
		this.pattern = pattern;
		this.swimSpeed = swimSpeed;

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
			setExcretion(getExcretion());
		}
	}

	@Override
	public void sensitivity() {
		if (getExcretion() > 1) {
			this.setSensResp("normal");
		} else {
			this.setSensResp("cold");
		}
	}

	@Override
	public void swim() {
		switch (getStage()) {
		case "baby":
			this.setSwimSpeed(300);
			break;
		case "young adult":
			this.setSwimSpeed(600);
			break;
		case "adult":
			this.setSwimSpeed(1000);
			break;
		default:
			this.setSwimSpeed(350);
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

	public int getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(int swimSpeed) {
		this.swimSpeed = swimSpeed;
	}

}
