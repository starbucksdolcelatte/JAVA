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
			System.out.println("�Է� : " + inputData);
			
			// String ���� ������ String.equals("�� ���ڿ�"); 
			// ������� true or false
			if (inputData.equals("q")) break;
		}
		
		System.out.println("����Ǿ����ϴ�.");
		
	}

}
