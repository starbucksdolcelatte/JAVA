package sec03.exam02;
/*
작성자 : StarbucksDolceLatte
작성일 : 2020.02.29
*/
public class KoreanExample {

	public static void main(String[] args) {
		Korean K1 = new Korean("박자바", "011225-1234567");
		System.out.println("K1.name = " + K1.name);
		System.out.println("K1.ssn = " + K1.ssn);
		
		Korean K2 = new Korean("김자바", "930525-2345678");
		System.out.println("K2.name = " + K2.name);
		System.out.println("K2.ssn = " + K2.ssn);
		
	}

}
