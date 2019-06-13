package day35;

public class MetHodOverlo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Java";
	    
	    System.out.println(  name.indexOf("a") );
	    System.out.println(  name.indexOf("a",2) );
	    
	    System.out.println(  name.replace('a', 'B')    );
	    System.out.println(  name.replace("va", "java")    );
	    
	    printName(); 
	    printName("JAVA ");
	    printName("JAVA ", "Spartan");
	    printName(300);

	  }
	  
	  public static void printName() {
	    System.out.println("no arg print name");
	  }
	  
	  public static void printName(String name) {
	    System.out.println("1 String arg print name " + name);
	  }
	  
	  public static void printName(int number) {
	    System.out.println("1 int arg print name " + number);
	  }
	  
	  public static void printName(String firstName, String lastName) {
	    System.out.println("2 String args print name  " + firstName+lastName);
	    
	}

}
