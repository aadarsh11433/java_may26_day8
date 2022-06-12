package com.Problem2;

public class Teacher extends School{

	String subject = "Maths";
	String designation = "Proffesor"; 
	double salary = 40000.00;
	
	
	void teach() {
		System.out.println("Teaches maths");
	}
	
	void timing() {
		System.out.println("from 8AM to 12 PM after this teacher leaves");
	}
}
