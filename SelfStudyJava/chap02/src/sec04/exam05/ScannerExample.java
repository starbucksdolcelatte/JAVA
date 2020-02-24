package sec04.exam05;

import java.util.Scanner;

/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.24
*/

public class ScannerExample {
	
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력 : " + inputData);
			
			// String 비교할 때에는 String.equals("비교 문자열"); 
			// 결과값은 true or false
			if (inputData.equals("q")) break;
		}
		
		System.out.println("종료되었습니다.");
		
	}

}
