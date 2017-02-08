package com.philli.zoopackage.main.java;
public class Enclosure {
public enum EnclosureType {MAMMAL, INVERTIBRATE, AMPHIBIAN, REPTILE }


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