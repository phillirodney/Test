package com.philli.zoopackage.main.java;

public class Pigeon extends Bird implements Flying {

	private int flightSpeed;
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
 * @param hoursAfterEating
 * @param excretion
 * @param stage
 * @param enclosureSize
 * @param respRate
 * @param sensResp
 * @param flightSpeed
 */
	public Pigeon(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, String featherColour, int wingSpan,
			int hoursAfterEating, int excretion, String stage, String enclosureSize, int respRate, String sensResp, int flightSpeed) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, featherColour, wingSpan,
				hoursAfterEating, excretion, stage, enclosureSize, respRate, sensResp);
		this.flightSpeed = flightSpeed;
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
		switch (flightSpeed) {
		case 100: this.setRespRate(150);
			break;
		case 200: this.setRespRate(100);
			break;
		case 300: this.setRespRate(50);
			break;
		default: this.setRespRate(75);
			break;
		}
	}

	@Override
	public void takeOff() {
		// take off method
		switch (getWeight()) {
		case 10:
			this.setFlightSpeed(300);
			break;
		case 20:
			this.setFlightSpeed(200);
			break;
		case 30:
			this.setFlightSpeed(100);
			break;
		default:
			this.setFlightSpeed(150);

			break;
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
			setExcretion(getExcretion() + 100);
		} else {
			setExcretion(getExcretion() + 60);
		}
	}

	@Override
	public void sensitivity() {
		if (getExcretion() > 20) {
			this.setSensResp("cold sweats");
		}
		else {
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
