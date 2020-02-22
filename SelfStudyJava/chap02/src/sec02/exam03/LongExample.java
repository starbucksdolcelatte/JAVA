package sec02.exam03;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.22
*/

public class LongExample {

	public static void main(String[] args) {
		/*
		 * 기본적으로 컴파일러는 정수 리터럴을 int 타입으로 간주합니다.
		 * 정수 리터럴이 int 타입 허용 범위를 초과할 경우, 
		 * long 타입을 컴파일러에 알려주어야 합니다. 
		 * 방법은 간단합니다. 숫자 뒤에 L을 붙이면 됩니다.
		*/
		
		long balance = 300000000000000L;
		long var1 = 10;
		long var2 = 20L;
		long var3 = 10000000L;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);

	}

}
