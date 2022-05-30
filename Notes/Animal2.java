package com.Notes;

//parent class
 class Animal2 {
//field and method of the parent class
String name;
public void eat() {
System.out.println("I can eat in the Animal class");
}
}
//child class inherit from Animal
//Dog is an Animal
class Dog extends Animal2 {
//new method in subclass
public void display() {
System.out.println("My name is " + name);
}
}
class Main {
public static void main(String[] args) {
	
	Dog labrador = new Dog();
	// access field of superclass
	labrador.name = "Rohu";
	labrador.display();
	// call method of superclass
	// using object of subclass
	labrador.eat();
	}
	}