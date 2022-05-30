package com.Notes;

interface Animal {
 void move();
}
  
     class Fish implements Animal{
      
    	@Override
    public  void move(){
       System.out.print("swimming fish");
        }
   	 public static void main(String[] args) {
			
		   (new Dolphin()).move();
		(new Fish()).move();
	}
    
    	
    	
     }
  
  class Dolphin extends Fish {
 
   
  
}