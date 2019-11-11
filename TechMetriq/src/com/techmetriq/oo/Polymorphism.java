package com.techmetriq.oo;

/**
 * @author TechMetriq
 *
 */
public class Polymorphism {
	
	public static void main(String args[]) {
		Mouth britishMouth = new BritishPerson();
		Mouth frenchMouth = new FrenchPerson();
		System.out.print("BritishPerson : ");
		britishMouth.speak();
		System.out.print("FrenchPerson : ");
		frenchMouth.speak();
	}
}

/*
 * OUTPUT 
 * BritishPerson : How Are You TechMetriq 
 * FrenchPerson : Comment allez-vous TechMetriq
 */