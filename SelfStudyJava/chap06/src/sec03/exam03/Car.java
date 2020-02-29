package sec03.exam03;
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
	
	// 생성자
	Car(){
		
	}
	
	// 생성자 2 (오버로딩)
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
