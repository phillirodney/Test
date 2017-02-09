package com.philli.zoopackage.main.java;

public abstract class Mammal extends Animal implements Run {

	public Mammal(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, int hoursAfterEating, int excretion, String stage,
			String enclosureSize, int respRate) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating, excretion,
				stage, enclosureSize, respRate);
	}

	@Override
	public void sprint() {
		// overridden run method, inherited from the Run interface
		// not all mammals can sprint
		// current speed , top speed, distance.
		if (getEnclosureType().equals(EnclosureType.AMPHIBIAN_ARCADE)) {
			System.out.println(getSpecies() + "cannot sprint");
		} else if (getEnclosureType().equals(EnclosureType.FELINE_FUN)) {
			System.out.println(getSpecies() + "will sprint");
		} else if (getEnclosureType().equals(EnclosureType.FISH_PARADISE)) {
			System.out.println(getSpecies() + "cannot sprint");
		} else if (getEnclosureType().equals(EnclosureType.GUINEAPIG_GREENLAND)) {
			System.out.println(getSpecies() + "will sprint");
		} else if (getEnclosureType().equals(EnclosureType.PENGUIN_SHORES)) {
			System.out.println(getSpecies() + "will sprint");
		} else if (getEnclosureType().equals(EnclosureType.REPTILE_CREEK)) {
			System.out.println(getSpecies() + "will sprint");
		} else if (getEnclosureType().equals(EnclosureType.WORLD_OF_WINGS)) {
			System.out.println(getSpecies() + "will sprint");
		}
	}
}
