package com.kavita.zoo;

public class Canine extends Animal {

	private int claws = 0;
	private int legs = 4;
	private boolean domestic = false;
	
	public Canine(String name, String color, String gender, int eyes, float height, int claws, int legs,
			boolean domestic) {
		super(name, color, gender, eyes, height);
		this.claws = claws;
		this.legs = legs;
		this.domestic = domestic;
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

	public boolean isDomestic() {
		return domestic;
	}

	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}

	public String toString() {
		String isWild = null;
		
		if (!(domestic)) {
			isWild = "non domesticated";
		}
		else 
			isWild = "domesticated";
		
		return 
		("A "+ gender +", " + isWild   + " canine named " + name + " who had " + legs + " legs, " + claws + " claws, and " + eyes + " eyes. It was " + color + " and " + height + "ft tall."); 
		
	}
	
	
	
}
