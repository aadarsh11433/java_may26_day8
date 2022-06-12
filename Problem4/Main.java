package com.Problem4;

public class Main {

	public static void main(String[] args) {
		
		
		Animal[] animalArr = new Animal[3];
		
		Dog d1  = new Dog();
		 Cat c1  = new Cat();
		Tiger t1  = new Tiger();
		
		animalArr[0] = d1;
		animalArr[1] = c1;

		animalArr[2] = t1;
		
	    for(Animal a : animalArr) {
	    	a.eat();
	    	a.makeNoise();
	    	a.walk();
	    }
		

		
	}

}
