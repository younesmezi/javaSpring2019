package day46;

public class PersonCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Mavlida", 5.3f,'F');
	    System.out.println( p1.counter  );

	    Person p2 = new Person("Ganisher", 6.1f,'M');
	    System.out.println( p2.counter  );
	    
	    Person p3 = new Person("Manzire", 5.3f,'F');
	    System.out.println( p3.counter  );
	    
	    System.out.println(Person.counter);
	    
	    
	}

}
