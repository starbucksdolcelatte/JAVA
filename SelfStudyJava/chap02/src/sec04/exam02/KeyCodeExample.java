package sec04.exam02;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.24
*/

public class KeyCodeExample {
	
	public static void main(String[] args) throws Exception{
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("key : " + (char)keyCode);
		
		// System.in.read()는 Enter 키 입력될 때까지 대기 상태
		// Enter 키가 입력되면 지금까지 입력된 키들에 대한 키 코드를 하나씩 읽음
		// Enter 키는 다른 키와는 다르게 캐리지 리턴(13)과 라인 피드(10)로 구성된 2개의 키 코드가 입력됨
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode); // keyCode : 13(캐리지 리턴 CR:13)

		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode); // keyCode : 10(라인 피드LF:10)
		
	}

}
