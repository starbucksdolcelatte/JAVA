package sec05.exam05;
/*
�ۼ��� : StarbucksDolceLatte
�ۼ��� : 2020.03.04
*/
public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "������");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA"; // The final field Person.nation cannot be assigned
		//p1.ssn = "USA"; // The final field Person.ssn cannot be assigned
		p1.name = "������";

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
	}

}
