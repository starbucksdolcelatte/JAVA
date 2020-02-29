package sec03.exam04;
/*
작성자 : StarbucksDolceLatte
작성일 : 2020.02.29
*/
public class Car {
	// 필드
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 1
	Car(){
	}
	
	// 생성자 2 (오버로딩)
	Car(String model){
		// 맨 아래 생성자 4를 호출
		// this()는 자신의 다른 생성자를 호출하는 코드로, 반드시 생성자의 첫 줄에서만 허용됨
		this(model, "silver", 250);
	}
	
	// 생성자 3
	Car(String model, String color){
		// 맨 아래 생성자 4를 호출
		this(model, color, 250);
	}
	
	// 생성자 4
	Car(String model, String color, int maxSpeed){
		// 공통 실행 코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
