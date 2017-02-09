package com.philli.zoopackage.main.java;

public class Pigeon extends Bird implements Flying {

	public Pigeon(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, String featherColour, int wingSpan, int hoursAfterEating) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, featherColour, wingSpan, hoursAfterEating);
	}

	@Override
	public void flight() {
		// flight method
		if (getWeight() > 25) {
			System.out.println("fat pigeon flies slower with a weight of " + getWeight());
		} else {
			System.out.println("pigeon flies fast with a weight of " + getWeight());

		}

	}

	@Override
	public void land() {
		// land method
		if (getWeight() > 25) {
			System.out.println("2 landing attempts with a weight of " + getWeight());
		} else {
			System.out.println("perfect landing first time with a weight of " + getWeight());

		}
	}

	@Override
	public void takeOff() {
		// take off method
		if (getWeight() > 25) {
			System.out.println("with a weight of " + getWeight() + " take off speed is 30 m/s");
		} else {
			System.out.println("with a weight of " + getWeight() + " take off speed is 60 m/s");

		}
	}

	@Override
	public void nutrition() {
		// nutrition method
		if (getWeight() < 5) {
			System.out.println("weight is " + getWeight() + ", malnurished, eat more");
		} else {
			System.out.println("weight is " + getWeight() + ", nutrition levels are acceptable");

		}
	}

	@Override
	public void reproduction() {
		if (getGender().equals("F")) {
			System.out.println(getName() + " will have a gestation period of 17-19 days. She will sit on the eggs from late afternoon to 10am");
		} else if (getGender().equals("M")){
			System.out.println(getName() + " will do the day shift when looking after the eggs");
		}
		else {
			System.out.println(getName() + " is complicated");
		}			
	}

	@Override
	public void sensitivity() {
		// TODO Auto-generated method stub
		
	}

}
