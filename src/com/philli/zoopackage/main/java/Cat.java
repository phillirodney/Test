package com.philli.zoopackage.main.java;

public class Cat extends Mammal {

	private boolean dangerous;

	public Cat(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, boolean dangerous, int hoursAfterEating,
			int excretion, String stage, String enclosureSize, int respRate) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating, excretion,
				stage, enclosureSize, respRate);

		this.dangerous = dangerous;
	}

	@Override
	public void nutrition() {
		// overridden nutrition method
		switch (getStage()) {
		case "baby":
			this.setWeight(getWeight() + 2);
			break;
		case "young adult":
			this.setWeight(getWeight() + 4);

			break;
		case "adult":
			this.setWeight(getWeight() + 6);
			break;
		default:
			this.setWeight(getWeight());
			break;
		}
	}

	@Override
	public void growth() {
		if (getHeight() < 5) {
			this.setStage("baby");
		} else if (getHeight() > 5 && getHeight() < 10) {
			this.setStage("young adult");
		} else {
			this.setStage("adult");

		}
	}

	@Override
	public void reproduction() {
		if (("F").equals(getGender())) {
			setExcretion(getExcretion() + 10);
		} else {
			this.setEnclosureSize("small");
		}
	}

	@Override
	public void sensitivity() {
		// TODO Auto-generated method stub

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
