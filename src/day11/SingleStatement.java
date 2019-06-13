package day11;

public class SingleStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.println(true && true); //true
        System.out.println(true&&false); //false
        System.out.println(true & true); //true
        System.out.println(true&false); //false
        System.out.println(true|| true); //true
        System.out.println(true||false); //true
        System.out.println(true|true); //true
        System.out.println(true|false); //true*/
		String username = "user12321";
	    String password = "pass22";

	    if(username.equals("user") && password.equals("pass")){
	      System.out.println(" \" login successful \" ");
	    }else{
	      
	      if( ! username.equals("user") ){
	        System.out.println("USERNAME NOT FOUND");
	      }else{
	        System.out.println("PASSWORD NOT CORRECT");
	      }
	    }
	}
}

	      
	      
	    
	
	


