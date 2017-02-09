package com.philli.zoopackage.main.java;

public class Bat extends Mammal implements Flying {

	public Bat(int age, String name, String species, int weight, int height, EnclosureType worldOfWings,
			boolean nocturnal, boolean endangered, String gender, int hoursAfterEating, int excretion, String stage,
			String enclosureSize, int respRate) {
		super(age, name, species, weight, height, worldOfWings, nocturnal, endangered, gender, hoursAfterEating,
				excretion, stage, enclosureSize, respRate);
		// user defined
	}

	@Override
	public void nutrition() {
		// overridden nutrition method
		// if you weigh less than a number you need more nutrition
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
	public void flight() {
		// flight method
		// if you weigh this much you can fly for this amount of time
		if (getWeight() > 10) {
			this.setRespRate(getRespRate()+ 10);
		} else {
			this.setRespRate(getRespRate()+ 5);

		}
	}

	@Override
	public void land() {
		// land method
	
	}

	@Override
	public void takeOff() {
		// take off method
	
	}

	@Override
	public void growth() {
		// growth method
		if (getHeight() < 2) {
			this.setStage("baby");
		} else if (getHeight() > 2 && getHeight() < 5) {
			this.setStage("young adult");
		} else {
			this.setStage("adult");

		}

	}

	@Override
	public void movement() {
		if (("adult").equals(getStage())) {
			this.setEnclosureSize("large");
		} else {
			this.setEnclosureSize("small");
		}

	}

	@Override
	public void reproduction() {
		if (("F").equals(getGender())) {
			setExcretion(getExcretion() + 6);
		} else {
			this.setEnclosureSize("small");
		}
	}

	@Override
	public void sensitivity() {

	}

}
