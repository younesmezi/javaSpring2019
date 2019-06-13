package day32;

import java.util.Scanner;

public class MoreMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int i = input.nextInt();
		boolean result = isAdultOrNot(i);
		System.out.println(result);
		System.out.println(isAdultOrNot(i));
		
		
	}
	public static boolean isAdultOrNot(int age) {
		
		if (age>18) {
			return true;
		}
		else {
			return false;
		}
	}

}
