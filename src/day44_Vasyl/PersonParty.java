package day44_Vasyl;

import java.util.ArrayList;

public class PersonParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this one public Person() {}
				Person person1 = new Person();
				System.out.println(person1);
				Person person2 = new Person("Alina", "alina@gmail.com");
				System.out.println(person2);
				Person person3 = new Person("Aliya", "aliya@gmail.com", 18);
				System.out.println(person3);
				ArrayList<Person> people = new ArrayList<Person>();
				people.add(person1);
				people.add(person2);
				people.add(person3);
				System.out.println("Let's print list of people");
				System.out.println(people);
	}

}
