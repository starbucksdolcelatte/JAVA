package sec05.exam04;
/*
작성자 : StarbucksDolceLatte
작성일 : 2020.03.02
*/

// 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우가 있습니다.
// 단 하나만 생성된다고 해서 이 객체를 singleton이라고 합니다.

// 싱글톤을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야 합니다.
// 따라서 생성자를 외부에서 호출할 수 없도록 생성자 앞에 private 접근 제한자를 붙여줍니다.
public class Singleton {
	//정적 필드를 선언하고 자신의 객체를 생성해 초기화
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() {}
	
	//정적 메소드
	static Singleton getInstance() {
		return singleton;
	}
}
