package sec03.exam04;
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
	
	// ������ 1
	Car(){
	}
	
	// ������ 2 (�����ε�)
	Car(String model){
		// �� �Ʒ� ������ 4�� ȣ��
		// this()�� �ڽ��� �ٸ� �����ڸ� ȣ���ϴ� �ڵ��, �ݵ�� �������� ù �ٿ����� ����
		this(model, "silver", 250);
	}
	
	// ������ 3
	Car(String model, String color){
		// �� �Ʒ� ������ 4�� ȣ��
		this(model, color, 250);
	}
	
	// ������ 4
	Car(String model, String color, int maxSpeed){
		// ���� ���� �ڵ�
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
