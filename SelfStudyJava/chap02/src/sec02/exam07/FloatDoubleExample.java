package sec02.exam07;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.22
*/

public class FloatDoubleExample {

	public static void main(String[] args) {
		// �Ǽ��� ����
		// float var1 = 3.14;	// compile error!
		float var2 = 3.14f;
		double var3 = 3.14;
		
		// ���е� test
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;

		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
		// e ����ϱ�
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
	}

}