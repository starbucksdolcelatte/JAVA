package sec05.exam02;
/*
작성자 : StarbucksDolceLatte
작성일 : 2020.03.01
*/
public class CalculatorExample {

	public static void main(String[] args) {
		// 정적 요소는 객체 참조 변수로도 접근이 가능하지만,
		// 클래스 이름으로 접근하는 것이 좋습니다.
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10,  5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result2 : " + result3);
	}

}
