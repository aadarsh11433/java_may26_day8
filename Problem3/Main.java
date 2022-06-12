package com.Problem3;

class Bird{
	void transport(){
		
		System.out.println("mainly by flying");
	}
}

class Penguin extends Bird{

	 @Override
	 void transport() {
		 System.out.println("mainly by walking and swimming");
	 }
 
}

class Ostrich extends Bird{

	 @Override
	 void transport() {
		 System.out.println("mainly by walking and running");
	 }

}

public class Main {

	public static void main(String[] args) {
		
		

	}

}
  /*
                <<---------------------------------DYNAMIC POLYMORPHISM------------------------------------->>
                   
                  --->>  Method overriding is dynamic polymorphism.
                  
                  --->>  method overloading is static polymorphism.(change in method signature)
                  
                  --->> DP is  also called runtime polymorphism. which method will be called decide at runtime.
                  
                  --->>  with inheritence we achieve it.(class extends to other)
                  
                  --->>  used to change the method implemantation if parent class or superclass implementation is not desirable.  
                   
                  --->>  In LINE 13 and 22 Penguin and Ostrich class are overriding the transport method accordiing to their 
                         relative specifications. 
                  
   



*/