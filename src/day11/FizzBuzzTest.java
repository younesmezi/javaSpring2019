package day11;

import java.util.Scanner;

public class FizzBuzzTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your number");
		int input = scan.nextInt();
		String result;
		result = ((input % 5 == 0) && (input % 3 == 0)) ? "fizzBuzz" : "notFizzbuzz";
		System.out.println(result);

	}

}
