package sec04.exam01;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.22
*/

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		/* ���ڿ��� �⺻Ÿ������ ������ ����
		 * Ÿ��.parseŸ��(���ڿ�) �޼ҵ� �̿�
		 */
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("15.1");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
		/* �⺻ Ÿ��(byte, short, char, int, long, float, double, boolean)
		 * �� ���� ���ڿ��� ������ ���� String.valueOf() �޼ҵ� ���
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
