package day54;

public class FinalParemeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printItems("abc efg"); 
	    

	  }
	  
	  // Final method parameter will ensure the argument that passed to the methods 
	  //  DOES NOT CHANGE
	  public static void printItems(final String item) {
	    
	    
	    
	    //item = "some other value "; 
	    System.out.println( "the item is " + item);
	    
	  }
	  
	  
	//  public static void printItems() {
	//    
	    //String item = "abc efg"; 
	  
//	    item = "some other value "; 
//	    System.out.println( "the item is " + item);
	}


