package com.philli.zoopackage.main.java;

public class Bat extends Mammal implements Flying {

	public Bat(int age, String name, String species, int weight, int height,
			EnclosureType worldOfWings, boolean nocturnal, boolean endangered, String gender) {
		super(age, name, species, weight, height, worldOfWings, nocturnal, endangered, gender);
		// user defined
	}

	@Override
	public void nutrition() {
		// overridden nutrition method
	}

	@Override
	public void flight() {
		// flight method
		//if you weigh this much you can fly for this amount of time
		if(getWeight() > 10) {
			System.out.println("fat bat flies slower");
		}
		else  {
			System.out.println("bat flies fast");

		}
	}

	@Override
	public void land() {
		// land method
	}

	@Override
	public void takeOff() {
		// take off method

	}

	@Override
	public void growth() {
		// growth method
		
	}

	@Override
	public void sensitivity() {
		// sensitivity
		
	}

}
