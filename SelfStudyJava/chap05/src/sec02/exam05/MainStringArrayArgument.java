package sec02.exam05;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.29
*/

public class MainStringArrayArgument {

	public static void main(String[] args) {
		/* command line�� �Ʒ� ��ɾ� �Է�
		 * ������ġ�� C:\SelfStudyJava\chap05\bin
		 * 
		 * JDK 11 ���� ����
		 * java -p . -m chap05/sec02.exam05.MainStringArrayArgument 10 20
		 * 
		 * JDK 8 ���� ����
		 * java sec02.exam05.MainStringArrayArgument 10 20
		 * */
		if(args.length != 2) {
			System.out.println("���� ���� �����մϴ�.");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + " = " + result);
	}

}
