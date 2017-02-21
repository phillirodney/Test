package com.philli.zoopackage.main.java;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

abstract class Invertibrate extends Animal {

	public Invertibrate(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, int hoursAfterEating, int excretion, String stage,
			String enclosureSize, int respRate, String sensResp) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating, excretion,
				stage, enclosureSize, respRate, sensResp);
	}

}
