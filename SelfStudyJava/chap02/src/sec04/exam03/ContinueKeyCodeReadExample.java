package sec04.exam03;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.24
*/

public class ContinueKeyCodeReadExample {
	
	// throws Exception : 예외를 모니터에 표시하기만 함
	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("Key code : " + keyCode);
		}
	}

}
