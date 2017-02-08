package com.philli.zoopackage.main.java;
public class Animal {

	private int age;
	private String name; 
	private String species; 
	private String breed; 
	private int weight; 
	private int height;
		
	/**
	 * @param age
	 * @param name
	 * @param species
	 * @param breed
	 * @param weight
	 * @param height
	 */
	public Animal(int age, String name, String species, String breed, int weight, int height) {
		super();
		this.age = age;
		this.name = name;
		this.species = species;
		this.breed = breed;
		this.weight = weight;
		this.height = height;
	}
	
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
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
	 * @param name the name to set
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
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}
	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}
	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
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
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	} 
	
}
