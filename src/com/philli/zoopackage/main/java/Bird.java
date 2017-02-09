package com.philli.zoopackage.main.java;

abstract class Bird extends Animal {

	private String featherColour;
	private double wingSpan;

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
	 */
	public Bird(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, String featherColour, double wingSpan,
			int hoursAfterEating, int excretion, String stage, String enclosureSize, int respRate) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating, excretion,
				stage, enclosureSize, respRate);
		this.setFeatherColour(featherColour);
		this.setWingSpan(wingSpan);
	}

	@Override
	public void growth() {
		// growth method
		if (getHeight() < 2) {
			this.setStage("baby");
		} else if (getHeight() > 1 && getHeight() < 20) {
			this.setStage("young adult");
		} else {
			this.setStage("adult");

		}
	}

	public String getFeatherColour() {
		return featherColour;
	}

	public void setFeatherColour(String featherColour) {
		this.featherColour = featherColour;
	}

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}

}
