package sec03.exam06;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.23
*/

public class StringConversionExample {

	public static void main(String[] args) {
		// ���� ����
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		// ���ڿ� ���� ����
		String str1 = 10 + 2 + "8"; //128
		System.out.println("str1 : " + str1);
		
		String str2 = 10 + "2" + 8; //1028
		System.out.println("str2 : " + str2);
		
		String str3 = "10" + 2 + 8; //1028
		System.out.println("str3 : " + str3);
		
		String str4 = "10" + (2 + 8); //1010
		System.out.println("str4 : " + str4);
	}

}
