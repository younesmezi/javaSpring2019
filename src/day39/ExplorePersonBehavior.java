package day39;

public class ExplorePersonBehavior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(); 
	    p.age = 19; 
	    p.gender = 'M'; 
	    p.name = "Abdul Khan"; 
	    
	    Person g = new Person(); 
	    g.age = 19; 
	    g.gender = 'F'; 
	    g.name = "Alina"; 
	    
	    p.eat();
	    p.tellMeYourName();
	    p.printPersonOnfo();
	    
	    g.eat();
	    g.tellMeYourName();
	    g.printPersonOnfo();
	    
	}

}
