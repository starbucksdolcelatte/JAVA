package sec03.exam03;
/*
�ۼ��� : StarbucksDolceLatte
�ۼ��� : 2020.02.29
*/
public class Car {
	// �ʵ�
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;
	
	// ������
	Car(){
		
	}
	
	// ������ 2 (�����ε�)
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
