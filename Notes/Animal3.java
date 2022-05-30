package com.Notes;
class Animal3{
void eat(){
System.out.println("eating...");
}
}
class Dog2 extends Animal3{
void bark(){
System.out.println("barking...");
}
}

class Cat extends Animal3{
void meow(){
System.out.println("meowing...");
}
}


class BabyDog extends Dog2{
void weep(){
System.out.println("weeping...");
}
}
class AnimalMain{
public static void main(String args[]){
BabyDog d=new BabyDog();
d.weep();
d.bark();
d.eat();


                      Dog2 d2 = new Dog2();
//                      ((BabyDog)d2).weep();
                      
//                      BabyDog d3 =( BabyDog)d2;   //class cast exception can not downcast a parent class object to child cast 
                      // possible only when  the reference only is of parent and object is of child class
                      

//               d3.weep();
                      
                      Cat c=new Cat();
                      c.meow();
                      c.eat();
                      c.bark();//C.T.Error


}
}