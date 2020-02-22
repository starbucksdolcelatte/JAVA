package sec01.exam03;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.22
*/

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int temp;
		
		System.out.println("x : " + x + "\t y : " + y);
		
		temp = y;
		y = x;
		x = temp;
		System.out.println("x : " + x + "\t y : " + y);

	}

}
