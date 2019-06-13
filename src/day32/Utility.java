package day32;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Emine ";
	    System.out.println(  name.length()   );
	      /// There are two ways to call static methods 
	      /*
	       * 1, if the method is in same class 
	       *     we can just directly call the method by it's name 
	       *       and passing the value it required
	       * 2, or we can use className.staticmethodName(params..)
	       * */
	    
	     /// we can use directly staticMethod(params) to call static methods 
	     
	     // we are printing out so we can see the result of method call 
	     System.out.println(   giveMeFive()     );
	     //System.out.println(  5  );  -->> this is what it will become at runtime
	     
	     /// we can use className.staticMethod(params) to call static methods 
	     System.out.println(   Utility.giveMeFive()     );
	     
	     // here we are saving the result so we can use it again later 
	     // instead of calling method again
	     int myNum = giveMeFive(); 
	     System.out.println(myNum);

	    System.out.println(Utility.giveMe6DigitSalary());
	    System.out.println(giveMe6DigitSalary());
	    long twoYS = giveMe6DigitSalary()*2;
	    System.out.println(twoYS);
	   //SECOND YEAR 10% RAISE 
	     long firstYearSalary = giveMe6DigitSalary(); 
	     long secondYearSalary = (long) ( firstYearSalary * 1.1 ) ; 
     System.out.println(firstYearSalary +  secondYearSalary );
	  }
	  
	  public static int giveMeFive(){
	    
	    return 5 ; 
	    
	}

	  public static long giveMe6DigitSalary() {
		  return 110000L;
		  
	  }
}
