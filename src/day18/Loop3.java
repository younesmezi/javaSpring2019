package day18;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DRY Principle 
	    // DO NOT REPEAT YOURSELF 
	    
	    /*
	     * */
	    
	    int x = 10 ; 
	    if(x>5) {
	      System.out.println("DO THIS");
	    }else {
	      System.out.println("DO THAT");
	    }
	    
	    /*
	     * while(as long as some condition is true){
	     *   
	     *   repeat this action 
	     * 
	     * }
	     * 
	     * 
	     * */
	    int y = 10 ;  
	    while( y > 5) {
	      
	      System.out.println(" do this " + y-- );
	      //y -- ; 
	      
	    }
	    
	    
	}

}
