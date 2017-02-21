package com.philli.zoopackage.main.java;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public abstract class Mammal extends Animal implements Run {

	public Mammal(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, int hoursAfterEating, int excretion, String stage,
			String enclosureSize, int respRate, String sensResp) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating, excretion,
				stage, enclosureSize, respRate, sensResp);
	}

	@Override
	public void sprint() {
		switch (enclosure) {
		case AMPHIBIAN_ARCADE:
			this.setEnclosureSize("extra small");
			break;
		case FELINE_FUN:
			this.setEnclosureSize("extra large");
			break;
		case FISH_PARADISE:
			this.setEnclosureSize("medium");
			break;
		case GUINEAPIG_GREENLAND:
			this.setEnclosureSize("large");
			break;
		case PENGUIN_SHORES:
			this.setEnclosureSize("super large");
			break;
		case REPTILE_CREEK:
			this.setEnclosureSize("extra extra large");
			break;
		case WORLD_OF_WINGS:
			this.setEnclosureSize("medium large");
			break;
		default:
			this.setEnclosureSize("small");
			break;

		}
	}
}
