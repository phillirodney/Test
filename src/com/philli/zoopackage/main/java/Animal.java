package com.philli.zoopackage.main.java;

public abstract class Animal extends Enclosure implements LivingThing {

	private int age;
	private String name;
	private String species;
	private int weight;
	private int height;
	private boolean endangered;
	private boolean nocturnal;
	private String gender;
	private int hoursAfterEating;

	/**
	 * @param age
	 * @param name
	 * @param species
	 * @param breed
	 * @param weight
	 * @param height
	 * @param enclosure
	 * @param endangered
	 * @param nocturnal
	 * @param gender
	 * @param hoursAfterEating
	 *
	 */
	public Animal(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, int hoursAfterEating) {
		super(enclosure);
		this.age = age;
		this.name = name;
		this.species = species;
		this.weight = weight;
		this.height = height;
		this.enclosure = enclosure;
		this.endangered = endangered;
		this.nocturnal = nocturnal;
		this.gender = gender;
		this.hoursAfterEating = hoursAfterEating;
	}

	@Override
	public void excretion() {

		if (hoursAfterEating < 2) {
			System.out.println(getName() + "may be sick");
		} else {
			System.out.println(getName() + "is exreting at a normal rate");

		}
	}

	@Override
	public void movement() {
		// movement method
		if (isEndangered() == true) {
			System.out.println(getName() + "needs a new enclosure of" + getEnclosureType() + "to breed");
		} else {
			System.out.println(getName() + "does not need to be moved from" + getEnclosureType() + "right now");

		}

	}

	@Override
	public void respiration() {
		// respiration method
		switch (hoursAfterEating) {
		case 1:
			System.out.println(getName() + "is breathing too slowly");
			break;
		case 2:
			System.out.println(getName() + "is breathing  slowly");
			break;
		case 3:
			System.out.println(getName() + "is breathing  regulary");
			break;
		case 4:
			System.out.println(getName() + "is breathing  quickly");
			break;
		case 5:
			System.out.println(getName() + "is breathing too quickly");
			break;
		default:
			System.out.println(getName() + "is sleeping and breathing regularly");
			break;
		}
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @param species
	 *            the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	@Override

	public EnclosureType getEnclosureType() {
		return enclosure;
	}

	@Override
	public void setEnclosureType(EnclosureType enclosure) {
		this.enclosure = enclosure;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getHoursAfterEating() {
		return hoursAfterEating;
	}

	public void setHoursAfterEating(int hoursAfterEating) {
		this.hoursAfterEating = hoursAfterEating;
	}

}
