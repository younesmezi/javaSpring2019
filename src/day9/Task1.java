package day9;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String userName = "Younes";
		String password = "abc";
		System.out.println("enter your username");
		String TrueUserName = scan.next();
		System.out.println("enter your password");
		String TruePassword = scan.next();
		if (TrueUserName.equals(userName) && TruePassword.equals(password)) {
			System.out.println("login successful");
		} else {
			System.out.println("login failed");
		}
	}

}
