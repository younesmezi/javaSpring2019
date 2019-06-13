package day10;

import java.util.Scanner;

public class Refreshshshs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		System.out.println("welcome to Cybertek Banking App");
		System.out.println("please enter your account number: ");
		 long accountNumber = scan.nextLong();
		 System.out.println("please enter your password: ");
		 String password = scan.next();
		 accountNumber = 123456789L;
		 password = "cybertek";
		 if((accountNumber == 123456789)&&(password.equals("cybertek"))) { 
			System.out.println("access granted");
		 }else { 
				System.out.println("login failed");
		 }
	}

}
