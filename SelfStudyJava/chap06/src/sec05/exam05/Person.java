package sec05.exam05;
/*
작성자 : StarbucksDolceLatte
작성일 : 2020.03.04
*/

// final field 는 초기값이 저장되면 이것이 최종적인 값이 되어서 
// 프로그램 실행 도중에 수정할 수 없게 된다.
public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
