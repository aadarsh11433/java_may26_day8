package com.Notes;
class Animal5{
void eat(){
System.out.println("eating...");
}
}
class Dog4 extends Animal5{
void eat(){
System.out.println("eating bread...");
}
void bark(){
System.out.println("barking...");
}
void work(){
super.eat(); // calling method of parent Class using Super keyword 
bark();
}
}
class Main5{
public static void main(String args[]){
Dog4 d=new Dog4();
d.work();
}
}