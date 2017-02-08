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
