package sec02.exam08;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.25
*/

public class CompareOperatorExample2 {
	public static void main(String[] args)
	{ 
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2==v3); //v2�� double Ÿ������ ��ȯ�Ǿ� true
		
		double v4 = 0.1;
		float v5 = 0.1f; 
		System.out.println(v4==v5); //false : v5�� double�� �ڵ���ȯ������, 
		// �Ǽ��� ���� ����� �ε� �Ҽ��� ����� 0.1�� ��Ȯ�� ǥ���� �� ���� �����̴�.
		// 0.1f�� 0.1�� �ٻ簪���� ǥ���Ǳ� ������ 0.1���� ū ���� �Ǿ� ������.
		System.out.println((float)v4==v5);
	}
}
