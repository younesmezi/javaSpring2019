package day8;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * if(/// put some boolean expression in here) { do some action if its true }
		 * else { do something else if its false } // HackerRank , CodingBat , LeetCode
		 * and so on TASK 1 IMPROVE THIS CODE WITH SCANNER ask user to enter the score
		 * then execute below conditional program
		 *
		 */
		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("What is your score ?"); int score = input.nextInt() ;
		 * 
		 * System.out.println("current score is "+ score);
		 * 
		 * if( score > 60 ){ System.out.println("YOU SHALL PASS ! "); }else{
		 * System.out.println(" YOU SHALL NOT PASS! "); }
		 */

		Scanner scan = new Scanner(System.in);
		double iphonePrice = 599.99;
		double ipadPrice = 899.99;
		// int phoneCount, int tabletCount;

		System.out.println("What is your budget?: ");
		double budget = scan.nextDouble();
		System.out.println("How many do you want to buy?: ");
		int quantity = scan.nextInt();

		if (budget > quantity * iphonePrice) {
			System.out.println("You can buy " + quantity + " iphone");
		} else {
			System.out.println("You cannot buy " + quantity + " iphone");

		}

		if (budget > quantity * ipadPrice) {
			System.out.println("You can buy " + quantity + " ipad");
		} else {
			System.out.println("You cannot buy " + quantity + " ipad");

		}
	}
}
