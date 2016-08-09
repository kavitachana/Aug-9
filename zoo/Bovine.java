package com.kavita.zoo;

public class Bovine extends Animal {

	private int horns = 0;
	private int legs = 4;
	
	public Bovine(String name, String color, String gender, int eyes, float height, int horns, int legs) {
		super(name, color, gender, eyes, height);
		this.horns = horns;
		this.legs = legs;
	}

	public int getHorns() {
		return horns;
	}

	public void setHorns(int horns) {
		this.horns = horns;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String toString() {
		return ("A "+ gender + " bovine named " + name + " who had " + legs + " legs, " + horns + " horns, and " + eyes + " eyes. It was " + color + " and " + height + "ft tall.");   
		
		
	}
	
	
	
	
	
	
}
