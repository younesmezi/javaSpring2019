package day35;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	     * can i use same method name for different methods ? 
	     * 
	     * */ 
	    printName(); 
	    printName2("JAVA ");
	    printName3("JAVA ", "Spartan");
	    
	    
	  }
	  
	  public static void printName() {
	    System.out.println(" Method overloading ");
	  }
	  
	  public static void printName2(String name) {
	    System.out.println(" Method overloading " + name);
	  }
	  
	  public static void printName3(String firstName, String lastName) {
	    System.out.println(" Method overloading " + firstName+lastName);
	}

}
