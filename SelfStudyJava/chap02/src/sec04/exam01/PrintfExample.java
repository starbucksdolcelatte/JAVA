package sec04.exam01;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.24
*/

public class PrintfExample {
	
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("��ǰ�� ���� : %d��\n", value);
		System.out.printf("��ǰ�� ���� : %6d��\n", value);
		System.out.printf("��ǰ�� ���� : %06d��\n", value);
		System.out.printf("��ǰ�� ���� : %-6d��\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ���� : %10.2f\n", 10, area);
		
		String name = "HAON";
		String job = "traveler";
		String hobby = "tai chi meditation";
		
		String s1 = "name", s2 = "job", s3 = "hobby";
		System.out.printf("%6s | %-10s | %10s | %20s\n", "No.", s1, s2, s3);
		System.out.printf("%6d | %-10s | %10s | %20s\n", 1, name, job, hobby);
	}

}
