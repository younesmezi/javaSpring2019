package day48;

public class Notes {
	/*Class is a blueprint for object 

	What can we have inside a Class 

	public Person{
		
		// instance fields can be used to define properties of objects , instance fileds belong to object  
		int age ; 
		String name ; 
		
		// static fields belong to the class 
		// there is only one copy of this value among all objects created out of this class 
		static String race = "Human"; 

		// constructor 
			// has same name as class name and no return type
			// it run automatically when object is being created 
			// mostly used for creating object with initial state
				// or setting the value of instance fields 
				// it can be overloaded
		public Person(){
			/// no arg constructor 
		}

		public Person(String name., int age){
			/// 2 args constructor 
		}


		// instance methods 
			// we need an object to access insatance method 
			// personObj.printPersonInfo()
			// mostly used to read or modify instance field value 

		public void printPersonInfo(){
			// print name and age 
		}

		// there are special purpose instance methods called 
			// getters and setters 
			// are best practice of encapsulating private fileds
				// to protect data 
			public int getAge(){
				return age; 
			}
			public void setAge(int age){
				this.age = age ; 
			}	


		// static methods 
			static members (fields, methods) should be accessed
			in static way  : 
				Classname.staticField
				Classname.staticMethod(args...)
			when is the good time to use static method 
				if your method have actions that not related to 
				properties of the objects / instance fields 
				then it's always good to just make it static 

		public static void showMeTheRace(){
			// print race 
		}

		initilizer block :  it has no name (static){ }

				static block 

	 			it will only run once when class is loaded 
				when does the class actually load
				 any of it's static members being accesed for the first time 
				 print Person.race
				 or 
				 Person p = new Person() ;  
				
				static {
					It will only run once when class is loaded
				}

		instance block : 
				
				{
					// this will run every time an object is created
				}
				this is almost like having above code
				in each and every constructor 

				This is the piece of code that run right before you enter constructor of that class */

}
