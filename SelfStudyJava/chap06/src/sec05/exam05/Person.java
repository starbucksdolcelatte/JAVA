package sec05.exam05;
/*
�ۼ��� : StarbucksDolceLatte
�ۼ��� : 2020.03.04
*/

// final field �� �ʱⰪ�� ����Ǹ� �̰��� �������� ���� �Ǿ 
// ���α׷� ���� ���߿� ������ �� ���� �ȴ�.
public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
