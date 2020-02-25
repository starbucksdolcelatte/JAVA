package sec02.exam11;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.25
*/

public class ConditionalOperationExample {
	public static void main(String[] args)
	{ 
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		System.out.println("SCORE : " + score + "\tGRADE : " + grade);
	}
}
