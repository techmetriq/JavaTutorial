package com.techmetriq.oo.poly;

/**
 * @author TechMetriq
 *
 */
public class Polymorphism {
	
	public static void main(String args[]) {
		Speak britishMouth = new BritishPerson();
		Speak russianMouth = new RussianPerson();
		System.out.print("BritishPerson : ");
		britishMouth.speak();
		System.out.print("RussianPerson : ");
		russianMouth.speak();
	}
}

/*
 * OUTPUT BritishPerson says Hello : Hello RussianPerson says Hello : привет
 */