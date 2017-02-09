package com.philli.zoopackage.main.java;

public class Cat extends Mammal {

	private boolean dangerous;

	public Cat(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, boolean dangerous, int hoursAfterEating) {
		super(age, name, species, weight, height, enclosure,endangered,nocturnal, gender, hoursAfterEating);

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


	@Override
	public void reproduction() {
		if (getGender().equals("F")) {
			System.out.println(getName() + " will have a gestation period of 64-67 days and will feed their young with milk");
		} else if (getGender().equals("M")){
			System.out.println(getName() + " is male and cannot reproduce");
		}
		else {
			System.out.println(getName() + " is complicated");
		}		
	}


	@Override
	public void sensitivity() {
		// TODO Auto-generated method stub
		
	}

	



}
