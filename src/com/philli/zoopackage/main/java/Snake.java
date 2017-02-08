package com.philli.zoopackage.main.java;

public class Snake extends Reptile implements Swim {

	private boolean venemous;
	private String colour;
	private String pattern;

	public Snake(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, boolean venemous, String colour, String pattern) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender);

		this.venemous = venemous;
		this.colour = colour;
		this.pattern = pattern;
	}

	@Override
	public void floats() {
		// float method

	}

	public boolean isVenemous() {
		return venemous;
	}

	public void setVenemous(boolean venemous) {
		this.venemous = venemous;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public void growth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nutrition() {
		// TODO Auto-generated method stub
		
	}

	

}
