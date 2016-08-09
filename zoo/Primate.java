package com.kavita.zoo;

public class Primate extends Animal {

	private int numOfArms = 2;
	private int numOfLegs = 2;
	private boolean tail = false;
	private String diet = "Omnivor";
	
	
	public Primate(String name, String color, String gender, int eyes, float height, int numOfArms, int numOfLegs,
			boolean tail, String diet) {
		super(name, color, gender, eyes, height);
		this.numOfArms = numOfArms;
		this.numOfLegs = numOfLegs;
		this.tail = tail;
		this.diet = diet;
	}


	public int getNumOfArms() {
		return numOfArms;
	}


	public void setNumOfArms(int numOfArms) {
		this.numOfArms = numOfArms;
	}


	public int getNumOfLegs() {
		return numOfLegs;
	}


	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}


	public boolean isTail() {
		return tail;
	}


	public void setTail(boolean tail) {
		this.tail = tail;
	}


	public String getDiet() {
		return diet;
	}


	public void setDiet(String diet) {
		this.diet = diet;
	}

	
	public String toString() {
		String hasTail = null;
		
		if (!(tail)) {
			hasTail = "no tail";
		}
		else 
			hasTail = "a tail";
		
		return 	("A "+ gender + " primate named " + name + " who had " + numOfArms + " arms, " + numOfLegs + " legs, " + hasTail + ", and " + eyes + " eyes. "
				+ "It was " + color + " and " + height + "ft tall and is a " + diet +".");
	}
	
	
	
	
	
}
