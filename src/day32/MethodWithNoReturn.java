package day32;

public class MethodWithNoReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Aliya" ;
	    
	    // name.charAt(0) actually return a value so println can print out 
	    System.out.println( name.charAt(0) );

	    //  printSomething() does not return a value when being run 
	    // but println method is expecting a value so it does not compile
	   // System.out.println(  printSomething()  );
	    
	    
	  }
	  
	  public static void printSomething() {
	    System.out.println("CLASS IS OVER");
	  
	}

}
