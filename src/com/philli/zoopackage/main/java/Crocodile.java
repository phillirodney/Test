package com.philli.zoopackage.main.java;

public class Crocodile extends Reptile implements Swim {

	public Crocodile(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, int hoursAfterEating, int excretion, String stage,
			String enclosureSize, int respRate) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating, excretion,
				stage, enclosureSize, respRate);
	}

	@Override
	public void floats() {
		// float method

	}

	@Override
	public void nutrition() {
		// nutrition method
		switch (getStage()) {
		case "baby":
			this.setWeight(getWeight() + 10);
			break;
		case "young adult":
			this.setWeight(getWeight() + 20);

			break;
		case "adult":
			this.setWeight(getWeight() + 30);
			break;
		default:
			this.setWeight(getWeight());
			break;
		}
	}

	@Override
	public void growth() {
		if (getHeight() < 10) {
			this.setStage("baby");
		} else if (getHeight() > 10 && getHeight() < 50) {
			this.setStage("young adult");
		} else {
			this.setStage("adult");

		}
	}

	@Override
	public void reproduction() {
		if (("F").equals(getGender())) {
			setExcretion(getExcretion() + 30);
		} else {
			this.setEnclosureSize("small");
		}
	}

	@Override
	public void sensitivity() {
		// TODO Auto-generated method stub

	}

}
