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
		
		// System.in.read()�� Enter Ű �Էµ� ������ ��� ����
		// Enter Ű�� �ԷµǸ� ���ݱ��� �Էµ� Ű�鿡 ���� Ű �ڵ带 �ϳ��� ����
		// Enter Ű�� �ٸ� Ű�ʹ� �ٸ��� ĳ���� ����(13)�� ���� �ǵ�(10)�� ������ 2���� Ű �ڵ尡 �Էµ�
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode); // keyCode : 13(ĳ���� ���� CR:13)

		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode); // keyCode : 10(���� �ǵ�LF:10)
		
	}

}
