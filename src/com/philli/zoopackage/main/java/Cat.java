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
		if (getGender().equals("F")) {
			System.out.println(
					getName() + " will have a gestation period of 64-67 days and will feed their young with milk");
		} else if (getGender().equals("M")) {
			System.out.println(getName() + " is male and cannot reproduce");
		} else {
			System.out.println(getName() + " is complicated");
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
