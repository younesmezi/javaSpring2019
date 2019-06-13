package day52_vasyl;

public class Notes_vasyl {
	/* ###Hello!

	Agenda for today:

	- we will recap inheritance (extends keyword, super/sub classes).
	- we will practice super(), super.
	- we will talk about final keyword. (final variable, class, method)
	- then method overriding (@Override)
	- last hour, we will talk about abstraction (general idea, abstract class, abstract method, etc.) 

	#####################################

	1. Inheritance - what is this? First things first, is one of 4 OOP concepts. It's an ability to inherit all visible members from another class. We can inherit variables, methods but not constructor. 

	How does it work?

	We use keyword extends

	We can extend only one class at the time.

	WE can have a multi level inheritance - it's when subclass is also a super class for another class.

	class Person{ - super class
		
	} 

	class Student extends Person{ - student class is a sub class of Person class
		
	}

	class StudentOnline extends Student{ - StudentOnline class is a sub class of 										Student class
		
	}

	class StudentOncampus extends Student{ - StudentOncampus class is a sub 
											 class of Student class
		
	}

	We cannot see private members in the subclass.


	- private is an access modifier.

	We should make instance fields private.
	Then, we need to create getters/setters for each instance variable.
	it's.

	The idea of toString() method is ti provide string representation of an object.
	To convert object into readable string. 
	It translates from java language to human readable language.


	Actually, toString() method is coming from Object class.
	Object - is a super class for all java classes.
	Every class automatically extends Object class.

	Since toString() method is coming from Object class,
	we are actually changing behavior of original method.
	This process calls method overriding. 

	When inherited method is re-created in a sub class (same name, same parameters, same return type)

	this annotation @Override - is optional. 
	But, you can put this annotation only on top of overridden method.

	If you would like to change method implementation in the child class, we free to override method... 

	What is method implementation? whatever is inside curly braces. {}

	Let's say if we will not override toString() method in our custom class - we will not be able to translate (make readable for us) object of custom class.


	super it's about being super cool..
	it's about calling parent class.
	If we need to call parent class constructor, we use super().

	so we have to match arguments of super constructor.

	Student student1 = new Student("Firuz", 36, 'M', 1);
			System.out.println(student1);
			//Student [name=Firuz, age=36, gender=M, student_id=1] toString() only in Student
			//Person [name=Firuz, age=36, gender=M] - toString() only in Person
			//day52_night_session.Student@7852e922 - no toString()
		}*/
}
