package com.philli.zoopackage.main.java;

public class Cat extends Mammal {

	private boolean endangered;
	private boolean nocturnal;
	private boolean dangerous;

	public Cat(int age, String name, String species, String breed, int weight, int height, EnclosureType enclosure, boolean endangered, boolean nocturnal, boolean dangerous) {
		super(age, name, species, breed, weight, height, enclosure);

		this.endangered = endangered; 
		this.nocturnal = nocturnal; 
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
	 * @return the endangered
	 */
	public boolean isEndangered() {
		return endangered;
	}

	/**
	 * @param endangered
	 *            the endangered to set
	 */
	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

	/**
	 * @return the nocturnal
	 */
	public boolean isNocturnal() {
		return nocturnal;
	}

	/**
	 * @param nocturnal
	 *            the nocturnal to set
	 */
	public void setNocturnal(boolean nocturnal) {
		this.nocturnal = nocturnal;
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
