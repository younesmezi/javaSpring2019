package day48_vasyl;

public class Notes {
/*WARM UP TASK 

	Create a Person class
		instance fields name , age , height , gender
		create static field counter
		increase counter whenever new object gets created   
		create constructor to set all values
		toString() method.

	Create a Student class
		instance fields name , age , height , gender , studentId
		create static field counter
		increase counter whenever new object gets created 
		create constructor to set all values
		toString() method.

 We will create a class Action to test our custom classes.

citizenship static variable that will be the same for all people

REMEMBER: Static variables/methods are shared. They don't belong to the object. They belong to the class. That's why, when you are calling static variable through the object, it's not correct. You need to call it through the class name. Regardless how do you access static variables, you will get the same value.

static block runs only ones, it is usually used to define static fields/variables. Static block always calls first. Because it will be executed when class is gonna be loaded. 

##################################################

We talked about OOP.....
What do you know about OOP?

OOP is object oriented programing.
What are the principles of OOP?

- Encapsulation (hiding data, we use private access modifier. in order to restrict access to the instance fields/variables.) 

- Inheritance - what is this? It's actually ability to inherit something... More properly, is ability to acquire properties and behavior from other class. 

one simple example:

class Animal{
	
	public void eat(){

	}
}

class Bird extends Animal{
	
	public void fly(){

	}
}

class Mammal extends Animal{
	
	public void giveMilk(){

	}
}


Every mammal is an animal
But every animal is not a mammal

Every animal can eat...
But not every animal can fly.

extends - this is a keyword that we use to inherit a class


public class Cat extends Animal{}

Animal is a super class of Cat.
Cat is a sub class of Animal class.
So sub class, is the class that inherits...

//BREAK TILL 9:20 

#####################

Do you remember toString() method?

it's actually coming from Object class....
We don't create a new toString(), we actually override toString() method.

What does it mean?

Overriding - is process of changing method implementation in the sub class.

super class.     sub class
Animal       Cat extends Animal
			
			 @Override	
eat(){	     eat(){			
	
}		     }	

Implementation is whatever is inside curly braces {}.
}
	

If method in the sub class has different name -> it's not overriding.
Also overriding happens between classes. NOT IN THE SAME CLASS.


One more thing. 

We cannot extend 2 classes at the same time.

class Cat extends Animal, Vehicle {}< -- IT'S WRONG, MULTIPLE INHERITANCE ILLEGAL. 

@Something --> it calls annotation.

@Override --> is also annotation.

we can put this annotation only on top of method that we can override. 


@Override
	public void fly() {
		
	}

Will not work, because there is no such a method in the animal class.

Overloading happens in the same class. 
Rules: same name, different parameters. Access modifier will not affect. CAN BE DONE ONLY WITHIN THE SAME CLASS.


Overriding: happens in the sub class (different classes, cannot be done in the same class. Opposite to overloading). 
Rules: same name, same parameters. How about access modifiers?
You can make method more accessible, but not less.

Cannot reduce the visibility of the inherited method from 
 Animal

if, in the super class (Animal) method was public, you cannot make it in the sub class (Cat) private. You can increase visibility, but not decrees.

		Animal
		/    \
	 Cat      Dog

Cat is an Animal
Dog is an Animal

Animal is a super class for Dog and Cat classes.

@Override is not required.
it will work without this too.

animal --> dog --> chihuahua

dog inherits from animal

chihuahua inherits from dog, and since dog inherits from animal, chihuahua will inherit all properties too. 
*/
}
