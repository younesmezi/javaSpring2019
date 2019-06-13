package day31;

public class Calculator {
public static void main(String[]args) {
	
	add(100,30);
	sub1(100,30);
	multi(100,30);
	div(100,30);

}
public static void add(int num, int num1) {
	int sum = num + num1;
	System.out.println(sum);
	
}

public static void sub1(int num, int num1) {
	int sum = num - num1;
	System.out.println(sum);
}

public static void multi(int num, int num1) {
	int mult = num*num1;
	System.out.println(mult);
}

public static void div(int num, int num1) {
	int div = num/num1;
	System.out.println(div);

	
       
	}

}
