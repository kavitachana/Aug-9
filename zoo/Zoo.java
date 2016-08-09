package com.kavita.zoo;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {

		ArrayList<Animal> myZoo = new ArrayList<>();
		
		Bovine cow = new Bovine("Lucy the cow", "Black & White", "Female", 2, 6.2f, 0, 4);
		Bovine buffalo = new Bovine("Bill the buffalo", "Brown", "Male", 2, 6.5f, 2, 4);
		Canine dog = new Canine("Fido the dog", "Light Brown", "Male", 2, 3.7f, 20, 4, true);
		Canine wolf = new Canine("Heather the wolf", "Gray & White", "Female", 2, 5.7f, 16, 4, false);
		Feline cat = new Feline("Moofali the cat", "Brown & Black", "Female", 2, 2.2f, 18, 4, false);
		Feline tiger = new Feline("Raja the tiger", "Orange & Black", "Male", 2, 6.3f, 20, 4, false);
		Primate gorilla = new Primate("Jane the gorilla", "Black", "Female", 2, 5.5f, 2, 2, false, "Omnivore");
		Primate tarsier = new Primate("Paul the tarsier", "Orange & White", "Male", 2, 4.2f, 2, 2, true, "Carnivore");
		Fish eel = new Fish("Edgar the eel", "Black", "Male", 2, 2.8f, 0, false);
		Fish grupper = new Fish("Ella the grupper", "Silver", "Female", 2, 3.6f, 4, true);
		
		myZoo.add(cow);
		myZoo.add(buffalo);
		myZoo.add(dog);
		myZoo.add(wolf);
		myZoo.add(cat);
		myZoo.add(tiger);
		myZoo.add(gorilla);
		myZoo.add(tarsier);
		myZoo.add(eel);
		myZoo.add(grupper);
	
		System.out.println("Today at the Zoo I saw: ");
		
		for (int i = 0; i < myZoo.size(); i++) {
			
			System.out.println(myZoo.get(i));
		}
		
	}
	
}
