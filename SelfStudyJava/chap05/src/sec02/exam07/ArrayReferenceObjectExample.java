package sec02.exam07;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.27
*/

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java"; // strArray[0] ��ü ����
		strArray[2] = new String("Java"); // �� ��ü ����
		
		System.out.println(strArray[0] == strArray[1]); 		// ���� ��ü ���� -> true
		System.out.println(strArray[0] == strArray[2]);			// �ٸ� ��ü ----> false
		System.out.println(strArray[0].equals(strArray[1]));	// ���� ���ڿ� �� -> true
	}

}
