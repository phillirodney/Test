package com.philli.zoopackage.main.java;

public class Bat extends Mammal implements Flying {

	private boolean endangered;
	private boolean nocturnal;

	public Bat(int age, String name, String species, String breed, int weight, int height, EnclosureType enclosure, boolean endangered, boolean nocturnal, String gender) {
		super(age, name, species, breed, weight, height, enclosure, endangered, nocturnal, gender);
		// user defined
	}

	@Override
	public void nutrition() {
		// overridden nutrition method
	}

	@Override
	public void flight() {
		// flight method

	}

	@Override
	public void land() {
		// land method
	}

	@Override
	public void takeOff() {
		// take off method

	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

	public boolean isNocturnal() {
		return nocturnal;
	}

	public void setNocturnal(boolean nocturnal) {
		this.nocturnal = nocturnal;
	}

}
