package com.Notes;

class Animal6{
void eat(){
System.out.println("eating...");
}
}
class Dog6 extends Animal6{
@Override
void eat(){
System.out.println("eating bread...");
}
//specific method of child class
void bark(){
System.out.println("barking...");

}
}
                class Main6{
            
                	void doSomething(Animal6 a){
                  a.eat();
             
                  if(a instanceof Dog6){
                         Dog6 d = (Dog6)a;
                 d.bark();
                 }
           }

                	public static void main(String args[]){

                		Main6 main = new Main6();

                		main.doSomething(new Animal6());

                		main.doSomething(new Dog6());
             }
     }