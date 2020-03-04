package sec05.exam05;
/*
작성자 : StarbucksDolceLatte
작성일 : 2020.03.04
*/
public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "김지수");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA"; // The final field Person.nation cannot be assigned
		//p1.ssn = "USA"; // The final field Person.ssn cannot be assigned
		p1.name = "배주현";

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
	}

}
