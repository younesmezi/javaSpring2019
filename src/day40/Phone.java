package day40;

public class Phone {
	

		  String brand;
		  String OS;
		  int capacity;

		  public void ring() {
		    System.out.println("ringing");
		  }

		  public void dial(long number) {
		    System.out.println("dialing " + number);
		  }
		  public void displayBrand() {
		        
		        System.out.println("brand: "+  brand );
		  }
}