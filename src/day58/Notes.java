package day58;

public class Notes {

	/*2 way to achive abstraction in java 

	abstract class 
	interface 



	interface 

		constant -->> public static final field 
		abstract method -->> 
		/// till java 8 -->> an interface could only have above members
		default method 
			it is declared using default keyword and it has body 
			It makes easier to add new functionality into intercace without breaking existing functionalities
		static method 
			it's mostly used as utility method that not attatched any object 
			We can only access static method of interface 
			using static way  -->> InterfaceName.staticMethod() 
			IT'S NOT INHERITED 

		By default , access modifier for interface members are 
			ALL PUBLIC 

	any fields are autimatically public static final 
	any method without a body --automatically public abstract 

	How many interface a class can implemnet -->> NO LIMIT 
		public class Student implement Teachable, Hirable, Offerable {}

	CAN a interface extends anotehr interface -->> YES , ONE OR MORE 
		public interface Mammal extends Animal, Pet, OtherInterfaces{

		} 
		the purpose is to reuse the methods that exists in interface 	that being extended 


	Abstract class 
		it is declared using abstract keyword 
		public abstract class Student{

		}
		it can not be instantiated -->> NO OBJECT 
		it may contain abstract method 


		fields --->>
			instance + static 
			final + non-final 
			private , protected , default , public  

		constructor -->>
			any constructor it can have like normal class 

		methods -->> 
			it can have abstract method 
			it can have non-abstratc method 
			instance + static 
		blocks -->> 
			instance + static block 

		How many class a class can extend -->>> ONLY 1 !!!!!



	can a abstract class implements a interface 
		
		public interfce Pet{
			public abstract void feedPet(); 
		}
		would this code compile ? 
		
		public abstract class Cat implements Pet{

			//public abstract void feedPet(); 

		}	
		public class SpartanCat extends Cat{
			public void feedPet(){
				//feed your cat with milk 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
