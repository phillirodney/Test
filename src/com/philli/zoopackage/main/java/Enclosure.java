package com.philli.zoopackage.main.java;

public class Enclosure {
	public enum EnclosureType {
	FISH_PARADISE,
	GUINEAPIG_GREENLAND, 
	CARRIBEAN_CHILL, 
	PENGUIN_SHORES,
	WORLD_OF_WINGS,
	FELINE_FUN,
	AMPHIBIAN_ARCADE,
	REPTILE_CREEK
	}

	protected EnclosureType enclosure;

	public Enclosure(EnclosureType enclosureType) {
		enclosure = enclosureType;
	}

	public EnclosureType getEnclosureType() {
		return enclosure;
	}

	public void setEnclosureType(EnclosureType enclosureType) {
		this.enclosure = enclosureType;
	}
}