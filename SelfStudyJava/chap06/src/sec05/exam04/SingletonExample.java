package sec05.exam04;
/*
�ۼ��� : StarbucksDolceLatte
�ۼ��� : 2020.03.02
*/
public class SingletonExample {

	public static void main(String[] args) {
		/*�̱����� �Ʒ��� ���� new ������() �� ���� ��ü�� ������ �� ����.
		 * Singleton obj1 = new Singleton();
		 * Singleton obj2 = new Singleton();
		 * */
		
		// obj1�� obj2�� �ϳ��� ��ü�� �����Ѵ�.
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2)
			System.out.println("same objects");
		else
			System.out.println("different objects");
	}

}
