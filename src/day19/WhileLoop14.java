package day19;

import java.util.Scanner;

public class WhileLoop14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName, lastName, fullName, email, street, state, city, address, contacts;
	    int  age, zipcode;
	    double height, weight;
	    boolean isMarried;
	    long workPhoneNumber, personalPhoneNumber;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Welcome to the patient portal!");
	    System.out.println("Please enter your personal information");
	    System.out.println("Enter your first name");
	    firstName = scan.next();
	    System.out.println("Enter your last name");
	    lastName = scan.nextLine();
	    System.out.println("Enter your email");
	    email= scan.next();
	    System.out.println("Enter your street");
	    street = scan.next();
	    System.out.println("Enter your city");
	    city = scan.next();
	    System.out.println("Enter your state");
	    state = scan.next();
	    System.out.println("Enter your zip code");
	    zipcode =scan.nextInt();
	    System.out.println("Enter your work phone number");
	    workPhoneNumber= scan.nextLong();
	    System.out.println("Enter your personal phone number");
	    personalPhoneNumber= scan.nextLong();
	    System.out.println("Enter your age");
	    age = scan.nextInt();
	    System.out.println("Enter your height");
	    height = scan.nextDouble();
	    System.out.println("Enter your weight");
	    weight = scan.nextDouble();
	    System.out.println("Are you married?");
	    isMarried = scan.nextBoolean();
	    
	    
	    System.out.println("Patient personal information");
	    System.out.println("Full name : " + lastName +"," +firstName);
	    System.out.println("Address : " + street +" "+ city +","+ state +" "+ zipcode);
	    System.out.println("Contacts : "+"work phone number - "+ workPhoneNumber +","+ "personal phone number - "+ personalPhoneNumber+", "+ "email: " + email );
	    System.out.println("Age: "+ age);
	    System.out.println("Height: "+ height);
	    System.out.println("Weight: "+ weight);
	    System.out.println("Married?: "+isMarried);
	    
		 
		
	}

}
