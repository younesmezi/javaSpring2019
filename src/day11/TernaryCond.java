package day11;

import java.util.Scanner;

public class TernaryCond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int score;
		String result;
		System.out.println("Enter your score");
		score = scan.nextInt();

		if (score > 75) {
			result = "pass";
		} else {
			result = "fail";
		}
		System.out.println("result is " + result);
	}

}
