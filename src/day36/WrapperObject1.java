package day36;

public class WrapperObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i = 10 ; 
		    
		    // boolean , char , byte, short , int , long 
		    // float , double
		    
		    /*
		     * Wrapper class --> 
		     * specifically designed to 
		     * store primitive value as object 
		     * 
		     * */
		    Boolean b =  new Boolean(true) ; 
		    Boolean b1 = new Boolean("false"); 
		    Boolean b2 = Boolean.valueOf(true); 
		    Boolean b3 = Boolean.valueOf("true"); 
		    
		    System.out.println(  b );
		    System.out.println(  b1 );
		    System.out.println(  b2 );
		    System.out.println(  b3 );
		    
		    Integer i1 = new Integer(123); 
		    Integer i2 = new Integer("123"); 
		    Integer i3 = Integer.valueOf(123); 
		    Integer i4 = Integer.valueOf("123"); 

		    System.out.println("equal? "+  i1.equals(123) );
		    System.out.println(  i2 );
		    System.out.println(  i3 );
		    System.out.println(  i4 );
		    
		    
		    
		    
	}

}
