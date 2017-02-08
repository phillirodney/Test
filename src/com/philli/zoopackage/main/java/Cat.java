package com.philli.zoopackage.main.java;

public class Cat extends Mammal {


	private boolean dangerous;

	public Cat(int age, String name, String species, String breed, int weight, int height, EnclosureType enclosure, boolean endangered, boolean nocturnal, boolean dangerous) {
		super(age, name, species, breed, weight, height, enclosure, dangerous, dangerous);


		this.dangerous = dangerous; 
	}

	@Override
	public void nutrition() {
		// overridden nutrition method
	}

	@Override
	public void sprint() {
		// overridden sprint method from RUN interface
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
