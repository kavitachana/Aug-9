package com.kavita.zoo;

public class Fish extends Animal {

	private int numOfFins = 0;
	private boolean hasScales = true;
	
	
	public Fish(String name, String color, String gender, int eyes, float height, int numOfFins, boolean hasScales) {
		super(name, color, gender, eyes, height);
		this.numOfFins = numOfFins;
		this.hasScales = hasScales;
	}


	public int getNumOfFins() {
		return numOfFins;
	}


	public void setNumOfFins(int numOfFins) {
		this.numOfFins = numOfFins;
	}


	public boolean isHasScales() {
		return hasScales;
	}


	public void setHasScales(boolean hasScales) {
		this.hasScales = hasScales;
	}

	
	public String toString() {
		String withScales = null;
		
		if (hasScales) {
			withScales = "with scales";
		}
		else 
			withScales = "without scales";
		
		return 	("A "+ gender + " fish named " + name + " who had " + numOfFins + " fins, " + withScales +  ", and " + eyes + " eyes. "
				+ "It was " + color + " and " + height + "ft tall.");
	}
	
}
