package day43;

public class RaceGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car1 = new Vehicle();
	    car1.setMake ("Tesla");
	    car1.setModel ("Model X");
	    car1.setSpeed(100);
	    
	    System.out.println(car1.getMake());
	    
	    System.out.println(car1.getModel());
	    
	    car1.increaseSpeed(6);
	    car1.decreaseSpeed(10);
	    car1.stop();
	    
	    Vehicle car2 = new Vehicle();
	    car2.setMake ("BMW");
	    car2.setModel ("M6");
	    car2.setSpeed(10);
	    
	    
	    
	    
	}

}
