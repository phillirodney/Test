package com.philli.zoopackage.main.java;

public class Bat extends Mammal implements Flying {

	private int flightSpeed;
/**
 * 
 * @param age
 * @param name
 * @param species
 * @param weight
 * @param height
 * @param worldOfWings
 * @param nocturnal
 * @param endangered
 * @param gender
 * @param hoursAfterEating
 * @param excretion
 * @param stage
 * @param enclosureSize
 * @param respRate
 * @param sensResp
 * @param flightSpeed
 */
	public Bat(int age, String name, String species, int weight, int height, EnclosureType worldOfWings,
			boolean nocturnal, boolean endangered, String gender, int hoursAfterEating, int excretion, String stage,
			String enclosureSize, int respRate, String sensResp, int flightSpeed) {
		super(age, name, species, weight, height, worldOfWings, nocturnal, endangered, gender, hoursAfterEating,
				excretion, stage, enclosureSize, respRate, sensResp);
		this.flightSpeed = flightSpeed;
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
		if (getWeight() > 10) {
			this.flightSpeed = 100;
		} else {
			this.flightSpeed = 200;
		}
	}

	@Override
	public void land() {
		// land method
		switch (flightSpeed) {
		case 100: this.setRespRate(200);
			break;
		case 200: this.setRespRate(300);
			break;
		case 300: this.setRespRate(400);
			break;
		default: this.setRespRate(100);
			break;
		}
	}

	@Override
	public void takeOff() {
		// take off method
		switch (getWeight()) {
		case 10:
			this.flightSpeed = 400;
			break;
		case 20:
			this.flightSpeed = 300;
			break;
		case 30:
			this.flightSpeed = 100;
			break;
		default:
			this.flightSpeed = 150;

			break;
		}
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
			setExcretion(getExcretion() + 2);
		} else {
			setExcretion(getExcretion());
		}
	}

	@Override
	public void sensitivity() {
		if (getExcretion() > 20) {
			this.setSensResp("sweat");
		} else {
			this.setSensResp("normal");
		}
	}

	public int getFlightSpeed() {
		return flightSpeed;
	}

	public void setFlightSpeed(int flightSpeed) {
		this.flightSpeed = flightSpeed;
	}

}
