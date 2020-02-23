package sec04.exam01;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.22
*/

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		/* 문자열을 기본타입으로 변경할 때는
		 * 타입.parse타입(문자열) 메소드 이용
		 */
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("15.1");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
		/* 기본 타입(byte, short, char, int, long, float, double, boolean)
		 * 의 값을 문자열로 변경할 때는 String.valueOf() 메소드 사용
		 */
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(value2);
		String str4 = String.valueOf(value3);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
