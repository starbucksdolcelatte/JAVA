package sec05.exam04;
/*
작성자 : StarbucksDolceLatte
작성일 : 2020.03.02
*/
public class SingletonExample {

	public static void main(String[] args) {
		/*싱글톤은 아래와 같이 new 생성자() 를 통해 객체를 생성할 수 없다.
		 * Singleton obj1 = new Singleton();
		 * Singleton obj2 = new Singleton();
		 * */
		
		// obj1과 obj2는 하나의 객체를 참조한다.
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2)
			System.out.println("same objects");
		else
			System.out.println("different objects");
	}

}
