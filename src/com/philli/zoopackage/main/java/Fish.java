package com.philli.zoopackage.main.java;

public class Fish extends Animal implements Swim {

	public Fish(int age, String name, String species, int weight, int height, EnclosureType enclosure,
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
	public void respiration() {
		// respiration method
		super.respiration();
	}

	@Override
	public void reproduction() {
		if (getGender().equals("F")) {
			System.out.println(getName()
					+ " will have a gestation period of 21-30 days, will lay anywhere between 2-2000 eggs and will feed their young with milk");
		} else if (getGender().equals("M")) {
			System.out.println(getName() + " is male and cannot reproduce");
		} else {
			System.out.println(getName() + " is complicated");
		}
	}

	@Override
	public void sensitivity() {
		// TODO Auto-generated method stub

	}

}
