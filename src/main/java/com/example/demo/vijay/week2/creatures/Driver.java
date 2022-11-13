package com.example.demo.vijay.week2.creatures;

import org.springframework.util.CommonsLogWriter;

public class Driver {

	public static void main(String[] args) {
		
		Cat catObject = new Cat();
		
		moveAnAnimal(catObject);
		// parent class refererence <- child class object
		
		
		Fish fishObject = new Fish();
		moveAnAnimal(fishObject);
		
		
	}
	
	
	static void moveAnAnimal(Animal animalObject) {
		animalObject.move();
	}
	

}
