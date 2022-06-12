package com.Notes;

class Vehicle{
	//defining a method
	void run(){
	System.out.println("Vehicle is running");
	}
	}
	//Creating a child class
	class Bike extends Vehicle{
	//defining the same method as in the parent class
	@Override
	void run(){
	System.out.println("Bike is running safely");
	}
	public static void main(String args[]){
	Bike obj = new Bike();//creating object
	obj.run();//calling method
	
	System.out.println(obj.hashCode()); 
	
	Object object =new Object();
	
	System.out.println(obj.equals(object));
	
	 Object o1  =obj.getClass();
	
	System.out.println(o1);

	
	}
}
