package com.philli.zoopackage.main.java;

public class Fish extends Animal implements Swim {
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
	 * @param hoursAfterEating
	 * @param excretion
	 * @param stage
	 * @param enclosureSize
	 * @param respRate
	 * @param sensResp
	 * @param swimSpeed
	 */
	public Fish(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, int hoursAfterEating, int excretion, String stage,
			String enclosureSize, int respRate, String sensResp, int swimSpeed) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating, excretion,
				stage, enclosureSize, respRate, sensResp);

		this.swimSpeed = swimSpeed;
	}

	@Override
	public void growth() {
		// growth method
		if (getHeight() < 1) {
			this.setStage("baby");
		} else if (getHeight() > 1 && getHeight() < 2) {
			this.setStage("young adult");
		} else {
			this.setStage("adult");

		}

	}

	@Override
	public void nutrition() {
		// nutrition method
		switch (getStage()) {
		case "baby":
			this.setWeight(getWeight() + 1);
			break;
		case "young adult":
			this.setWeight(getWeight() + 2);

			break;
		case "adult":
			this.setWeight(getWeight() + 3);
			break;
		default:
			this.setWeight(getWeight());
			break;
		}

	}

	@Override
	public void reproduction() {
		if (("F").equals(getGender())) {
			setExcretion(getExcretion() + 3);
		} else {
			this.setEnclosureSize("small");
		}
	}

	@Override
	public void sensitivity() {
		if (getExcretion() > 100) {
			this.setSensResp("vomit");
		} else {
			this.setSensResp("normal");
		}
	}

	@Override
	public void swim() {
		switch (getStage()) {
		case "baby":
			this.setSwimSpeed(500);
			break;
		case "young adult":
			this.setSwimSpeed(1000);
			break;
		case "adult":
			this.setSwimSpeed(2000);
			break;
		default:
			this.setSwimSpeed(650);
			break;
		}
	}

	

	public int getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(int swimSpeed) {
		this.swimSpeed = swimSpeed;
	}
}
