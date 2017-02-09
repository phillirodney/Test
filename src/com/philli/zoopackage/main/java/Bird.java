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
	 */
	public Bird(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, String featherColour, double wingSpan, int hoursAfterEating) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating);
this.setFeatherColour(featherColour); 
this.setWingSpan(wingSpan);
	}

	@Override
	public void growth() {
		// growth method
		if (getHeight()< 5) {
			System.out.println("baby " + getSpecies());
			
		} else if (getHeight() > 5 && getHeight() < 10) {
			System.out.println("young adult " + getSpecies());

		}
			else {
				System.out.println("adult " + getSpecies());
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
