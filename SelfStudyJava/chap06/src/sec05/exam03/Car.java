package sec05.exam03;
/*
작성자 : StarbucksDolceLatte
작성일 : 2020.03.01
*/
public class Car {
	// 인스턴트 필드와 메소드
	int speed;
	
	void run() {
		System.out.println("시속 " + speed + "km/h 으로 달립니다.");
	}
	
	
	// static 필드와 메소드
	static int cc;
	
	public static void setCc(int c) {
		cc = c;
	}
	
	public static void main(String[] args) {
		
		/* 객체가 없어도 실행된다는 특징 때문에 
		 * static method를 선언할 때는 
		 * 이들 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없습니다.
		 * 	
		this.speed = 10; // error
		this.method1(); // error
		*/
		
		
		/* 인스턴스 필드나 메소드를 사용하려면
		 * 아래와 같이 객체를 먼저 생성하고 참조변수로 접근해야 함.
		 * */
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		
		setCc(20); // static method 사용 가능
		System.out.println(cc); // static 필드 사용 가능
		
	}

}
