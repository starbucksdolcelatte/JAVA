package sec05.exam03;
/*
�ۼ��� : StarbucksDolceLatte
�ۼ��� : 2020.03.01
*/
public class Car {
	// �ν���Ʈ �ʵ�� �޼ҵ�
	int speed;
	
	void run() {
		System.out.println("�ü� " + speed + "km/h ���� �޸��ϴ�.");
	}
	
	
	// static �ʵ�� �޼ҵ�
	static int cc;
	
	public static void setCc(int c) {
		cc = c;
	}
	
	public static void main(String[] args) {
		
		/* ��ü�� ��� ����ȴٴ� Ư¡ ������ 
		 * static method�� ������ ���� 
		 * �̵� ���ο� �ν��Ͻ� �ʵ峪 �ν��Ͻ� �޼ҵ带 ����� �� �����ϴ�.
		 * 	
		this.speed = 10; // error
		this.method1(); // error
		*/
		
		
		/* �ν��Ͻ� �ʵ峪 �޼ҵ带 ����Ϸ���
		 * �Ʒ��� ���� ��ü�� ���� �����ϰ� ���������� �����ؾ� ��.
		 * */
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		
		setCc(20); // static method ��� ����
		System.out.println(cc); // static �ʵ� ��� ����
		
	}

}
