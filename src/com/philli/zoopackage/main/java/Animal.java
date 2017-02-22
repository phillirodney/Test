package com.philli.zoopackage.main.java;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public abstract class Animal implements LivingThing {

	private int age;
	private String name;
	private String species;
	private int weight;
	private int height;
	private boolean endangered;
	private boolean nocturnal;
	private String gender;
	private int hoursAfterEating;
	private int excretion;
	private String stage;
	private String enclosureSize;
	private int respRate;
	private String sensResp;
	protected EnclosureType enclosure;

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
	 * @param excretion
	 * @param stage
	 * @param enclosureSize
	 * @param respRate
	 * @param sensResp
	 *
	 */

	public Animal(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, int hoursAfterEating, int excretion, String stage,
			String enclosureSize, int respRate, String sensResp) {
		super();
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
		this.excretion = excretion;
		this.stage = stage;
		this.enclosureSize = enclosureSize;
		this.respRate = respRate;
		this.sensResp = sensResp;
	}

	public Animal(int age, String name, String species) {
		this.age = age;
		this.name = name;
		this.species = species;
	}

	public Animal(EnclosureType enclosure, int hoursAfterEating, int excretion, String stage, String enclosureSize, int respRate, String sensResp) {
		this.enclosure = enclosure;
		this.hoursAfterEating = hoursAfterEating;
		this.excretion = excretion;
		this.stage = stage;
		this.enclosureSize = enclosureSize;
		this.respRate = respRate;
		this.sensResp = sensResp;
	}
	public Animal(String name, String species, int hoursAfterEating, int excretion) {
		this.name = name;
		this.species = species;
		this.hoursAfterEating = hoursAfterEating;
		this.excretion = excretion;
	}
	@Override
	public void excretion() {

		if (hoursAfterEating < 2) {
			this.excretion = 0;
		} else {
			this.excretion = excretion + 1;

		}
	}

	@Override
	public void movement() {
		// movement method
		switch (stage) {
		case "baby":
			this.enclosureSize = "small";
			break;
		case "young adult":
			this.enclosureSize = "large";
			break;
		case "adult":
			this.enclosureSize = "extra large";
			break;
		default:
			this.enclosureSize = "standard medium enclosure";
			break;
		}

	}

	@Override
	public void respiration() {
		// respiration method
		switch (stage) {
		case "baby":
			this.respRate = 50;
			break;
		case "young adult":
			this.respRate = 80;
			break;
		case "adult":
			this.respRate = 60;
			break;
		default:
			this.respRate = 75;
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

	public EnclosureType getEnclosureType() {
		return enclosure;
	}

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

	public int getExcretion() {
		return excretion;
	}

	public void setExcretion(int excretion) {
		this.excretion = excretion;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getEnclosureSize() {
		return enclosureSize;
	}

	public void setEnclosureSize(String enclosureSize) {
		this.enclosureSize = enclosureSize;
	}

	public int getRespRate() {
		return respRate;
	}

	public void setRespRate(int respRate) {
		this.respRate = respRate;
	}

	public String getSensResp() {
		return sensResp;
	}

	public void setSensResp(String sensResp) {
		this.sensResp = sensResp;
	}

}
