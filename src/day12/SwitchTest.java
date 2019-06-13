package day12;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 2 numbers : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("Enter Operator + , -, *, / : ");
		String operator = scan.next();
		switch (operator) {
		case ("+"):
			System.out.println("the result is: " +(num1 + num2));
			break;
		case ("-"):
			System.out.println("the result is: " + (num1 - num2));
			break;
		case ("*"):
			System.out.println("the result is: "+ (num1 * num2));
			break;
		case ("/"):
			System.out.println("the result is: "+(num1 / num2));
			break;

		default:
			System.out.println("The entry is invalid");
			break;

		}

	}

}
