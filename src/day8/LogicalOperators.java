package day8;

public class LogicalOperators {

	public static void main(String[] args) {
		boolean isHungry = true ; 
	    boolean isBreakTime = true ;
	    boolean isYourLunchReady = true ; 
	    
	  System.out.println("are you hungry and is it break time " + (isHungry && isBreakTime) ) ;

	  System.out.println("are you hungry or is it break time " + (isHungry || isBreakTime) ) ;

	  boolean reverseIsHungry = ! isHungry ; 
	  System.out.println(" Original ishungry " + isHungry);
	  System.out.println( " After reversing isHungry " + reverseIsHungry);
	  
	  boolean areWeSuperReady = isHungry && isBreakTime && isYourLunchReady ; 
	  System.out.println("hungry , break time , meal is ready " + areWeSuperReady);
	    
	    // Logical and operator &&
	    // Logical or operator ||
	    // Logical not operator !
	    
	    

	  }

	

		
	}


