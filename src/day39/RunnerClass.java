package day39;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// local variable  
	    //String s = "abc" ; 
	    
	    Person p1 = new Person(); 
	    p1.name = "Talmurat" ;
	    p1.age = 1 ;
	    p1.gender = 'M' ; 
	    
	   
	    
	    // each objects attribues 
	    // are completely independent from
	    // any other objects that created 
	    // from same class 
	    
	    Horse h1 = new Horse(); 
	    h1.age = 4;
	    h1.breed= "Mongolian horse";
	    h1.color ="black";
	    h1.height= 5.10;
	    
	    Horse h2 = new Horse();
	        // Setting attributes of object
	        h2.breed = "Arabian" ;
	        h2.age = 5 ;
	        h2.color = "black";
	        h2.height = 5.5;
	        
	        System.out.println( h1.color );
	        System.out.println( h2.height);
	        // reassigned to new value 
	        h1.color = "brown"; 
	        
	        System.out.println(h1.color);
	        System.out.println(h2.color);
	        
	        
	        
	    
	    
	    
	}

}
