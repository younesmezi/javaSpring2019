package day39;

import java.util.Random;
import java.util.Scanner;

public class Person {

  // properties of the object are defined
  // by instance variable/field
  String name;
  int age;
  char gender;
  
//properties| attributes of 
 // the object are defined
 // by instance variable/field
 
 //public static void eat() {
 // any non-static method is called instance method 
 public void eat() {
   
   System.out.println(" eating ");
   
 }
 
 public void tellMeYourName() {
   System.out.println("My Name is " + name);
  
  
}
 public void printPersonOnfo() {
		System.out.println("My name is: " + name
				+ " | my age is: " + age
				+ " | my gender is : " + gender);
}
}
