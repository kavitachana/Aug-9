package com.kavita.zoo;

public class Feline extends Animal {

	private int claws = 0;
	private int legs = 4;
	private boolean hairless = false;
	
	public Feline(String name, String color, String gender, int eyes, float height, int claws, int legs,
			boolean hairless) {
		super(name, color, gender, eyes, height);
		this.claws = claws;
		this.legs = legs;
		this.hairless = hairless;
	}

	public int getClaws() {
		return claws;
	}

	public void setClaws(int claws) {
		this.claws = claws;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public boolean isHairless() {
		return hairless;
	}

	public void setHairless(boolean hairless) {
		this.hairless = hairless;
	}

	
	public String toString() {
		return 
		("A "+ gender + " feline named " + name + " who had " + legs + " legs, " + claws + " claws, and " + eyes + " eyes. It was " + color + " and " + height + "ft tall."); 
	}
	
	
	
}
