package day10;

import java.util.Scanner;

public class AmazonProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome Amazon Shoper");
		System.out.println("Are you a prime member ? ");
		boolean isPrimeMember = true;
		isPrimeMember = scan.nextBoolean();
		System.out.println("Enter your price");
		double price = scan.nextDouble();

		if (isPrimeMember) {
			System.out.println("free shipping");
		} else if (price > 35) {
			System.out.println("free shipping");
		} else {
			System.out.println("add $5 shipping");
		}

	}

}
