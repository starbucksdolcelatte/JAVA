package sec02.exam07;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.27
*/

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java"; // strArray[0] 객체 참조
		strArray[2] = new String("Java"); // 새 객체 생성
		
		System.out.println(strArray[0] == strArray[1]); 		// 같은 객체 참조 -> true
		System.out.println(strArray[0] == strArray[2]);			// 다른 객체 ----> false
		System.out.println(strArray[0].equals(strArray[1]));	// 같은 문자열 값 -> true
	}

}
