package sec03.exam05;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.22
*/

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2;
		// type mismatch : cannot convert from int to byte
		// int ���� ���� ũ�� Ÿ���� ������ �ǿ������� �� int�� promotion �ȴ�.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;
		// type mismatch : cannot convert from int to char
		int intValue2 = charValue1 + charValue2;
		System.out.println("unicode : " + intValue2);
		System.out.println("��¹��� : " + (char)intValue2);
		
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		
		int intValue5 = 10;
		// int intValue6 = intValue5 / 4.0;
		// type mismatch : cannot convert double to int
		double doubleValue1 = intValue5 / 4.0;
		System.out.println(doubleValue1);
		
		
		int x = 1, y = 2;
		double result = x / y;
		System.out.println(result);
		result = (double)x / y;
		System.out.println(result);
		
				
	}

}
