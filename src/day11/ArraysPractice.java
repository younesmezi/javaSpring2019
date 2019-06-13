package day11;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args) {
		// DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:

		// WRITE YOUR CODE BELOW THIS LINE:

		String []heros= {"amina","jamal","younes","noufyssa","bouchra"};
		String []herosCopy = new String[heros.length];
		//for(int i =0; i<herosCopy.length; i++) {
		
			System.out.println(Arrays.toString(heros));
			//System.out.println(Arrays.toString(herosCopy));
			Arrays.sort(heros);
			System.out.println(Arrays.toString(heros));
			//for (String hero: heros) {
				//System.out.print(hero+ " ");
				String [] copy2=Arrays.copyOf(heros, 2);
				System.out.println(Arrays.toString(copy2));
				String []copy3 = Arrays.copyOfRange(heros,1, 5);
				System.out.println(Arrays.toString(copy3));
				
			}
			
		}
	
