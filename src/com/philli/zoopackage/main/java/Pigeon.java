package com.philli.zoopackage.main.java;

public class Pigeon extends Bird implements Flying {

	public Pigeon(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, String featherColour, int wingSpan,
			int hoursAfterEating, int excretion, String stage, String enclosureSize, int respRate) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, featherColour, wingSpan,
				hoursAfterEating, excretion, stage, enclosureSize, respRate);
	}

	@Override
	public void flight() {
		// flight method
		if (getWeight() > 25) {
			this.setRespRate(getRespRate()+ 20);
		} else {
			this.setRespRate(getRespRate()+ 5);

		}

	}

	@Override
	public void land() {
		// land method
		if (getWeight() > 25) {
			System.out.println("2 landing attempts with a weight of " + getWeight());
		} else {
			System.out.println("perfect landing first time with a weight of " + getWeight());

		}
	}

	@Override
	public void takeOff() {
		// take off method
		if (getWeight() > 25) {
			System.out.println("with a weight of " + getWeight() + " take off speed is 30 m/s");
		} else {
			System.out.println("with a weight of " + getWeight() + " take off speed is 60 m/s");

		}
	}

	@Override
	public void nutrition() {
		// nutrition method
		switch (getStage()) {
		case "baby":
			this.setWeight(getWeight() + 2);
			break;
		case "young adult":
			this.setWeight(getWeight() + 5);

			break;
		case "adult":
			this.setWeight(getWeight() + 10);
			break;
		default:
			this.setWeight(getWeight());
			break;
		}
	}

	@Override
	public void reproduction() {
		if (("F").equals(getGender())) {
			setExcretion(getExcretion() + 2);
		} else {
			this.setEnclosureSize("small");
		}
	}

	@Override
	public void sensitivity() {
		// TODO Auto-generated method stub

	}

}
