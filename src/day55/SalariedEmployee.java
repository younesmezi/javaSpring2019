package day55;

public class SalariedEmployee extends Employee {
	int monthlySalary;

	  
	  
	  @Override
	  public void calculateAnnualSalary() {
	    
	    System.out.println( monthlySalary * 12 );
	    
	  } 

	  
	  
	}
