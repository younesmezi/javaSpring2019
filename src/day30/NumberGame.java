package day30;

import java.util.Scanner;

public class NumberGame {
	public static void checkForAge(int age) {
		if(age>18) {
			System.out.println("adult");
		}else {
			System.out.println("not adult");
		}
		
	}
public static void printTheDoubleNumber(int number) {
	
	number*=2;
	System.out.println(number);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printTheDoubleNumber(10);
printTheDoubleNumber(4);
checkForAge(22);
checkForAge(15);
	}

}
