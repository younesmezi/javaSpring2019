package replit;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class Accumulator{
int sum;

public Accumulator(int sum) {
	
	this.sum = sum;
}

public int getSum() {
	return sum;
}

public void setSum(int sum) {
	this.sum = sum;
}
public void add(int a) {
	sum+=a;
	
	
}
public void remove(int b) {
	sum-=b;
}

@Override
public String toString() {
	return "Accumulator [sum=" + sum + "]";
}
}
	
	

