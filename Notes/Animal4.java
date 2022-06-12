package com.Notes;

class Animal4{
String color="white";
}
class Dog3 extends Animal4{
String color="black";
void printColor(){
System.out.println(color);//prints color of Dog class
System.out.println(super.color);//prints color of Animal class
}
}
class Main4{
public static void main(String args[]){
Dog3 d=new Dog3();
d.printColor();
       }
}