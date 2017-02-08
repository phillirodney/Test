package com.philli.zoopackage.main.java;

public class Cat extends Mammal {

	private boolean dangerous;

	public Cat(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, boolean dangerous) {
		super(age, name, species, weight, height, enclosure,endangered,nocturnal, gender);

		this.dangerous = dangerous;
	}

	@Override
	public void nutrition() {
		// overridden nutrition method
		if (getWeight()< 5) {
			System.out.println("weight is " + getWeight() + ", malnurished, eat more");
		} else {
			System.out.println("weight is " + getWeight() + ", nutrition levels are acceptable");

		}
	}

	@Override
	public void sprint() {
		// overridden sprint method from RUN interface
		super.sprint();
	}

	@Override
	public void growth() {
		if (getHeight()< 1) {
			System.out.println("baby " + getSpecies());
			
		} else if (getHeight() > 1 && getHeight() < 5) {
			System.out.println("young adult " + getSpecies());

		}
			else {
				System.out.println("adult " + getSpecies());
			}		
	}
	/**
	 * @return the dangerous
	 */
	public boolean isDangerous() {
		return dangerous;
	}

	/**
	 * @param dangerous
	 *            the dangerous to set
	 */
	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}

	



}
