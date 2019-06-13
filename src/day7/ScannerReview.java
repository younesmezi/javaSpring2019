package day7;
import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println( "Enter your full name please : ");
		//String name = scan.next();
		String name = scan.nextLine();
		System.out.println("Hello Fellow coder " + name);
		System.out.println("Enter you age please : ");
		int age = scan.nextInt();
		System.out.println("Hello Feloow coder, your name is "+ name + " your age is " + age);
	
		/*import java.util.Scanner;

		public class Main {
		  public static void main(String[] args) {
		    //WRITE YOUR CODE HERE:
		    Scanner scan = new Scanner(System.in);
		    
		    
		    System.out.println ("Enter 3 numbers:");
		    int num1 = scan.nextInt();
		    int num2 = scan.nextInt();
		    int num3 = scan.nextInt();
		    int sum = num1+num2+num3;
		    System.out.println("Sum of numbers: " + sum);
		
	}*/
	}
}
