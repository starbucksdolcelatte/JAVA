package sec04.exam04;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.24
*/

public class QStopExample {
	
	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("key code : " + keyCode);
			if(keyCode == 113) break;
		}
		System.out.println("종료되었습니다.");
	}

}
