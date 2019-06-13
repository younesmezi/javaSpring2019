package day8;

public class Reviewpostin {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int score = 10;
		int result = score++;
		score = score++ + ++score;
		System.out.println(score);
		System.out.println("score++ " + score++);
		System.out.println("++score " + ++score);
		System.out.println(score);
		System.out.println(result);
	}

}
