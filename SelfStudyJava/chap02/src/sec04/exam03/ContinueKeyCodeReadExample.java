package sec04.exam03;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.24
*/

public class ContinueKeyCodeReadExample {
	
	// throws Exception : ���ܸ� ����Ϳ� ǥ���ϱ⸸ ��
	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("Key code : " + keyCode);
		}
	}

}
