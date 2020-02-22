package sec02.exam04;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.22
*/

public class CharExample {

	public static void main(String[] args) {
		char var1 = 'A';
		char var2 = 65;
		char var3 = '\u0041';	// unicode
		char var4 = 0x0041;		// 16Áø¼ö
		
		char var5 = '°¡';
		char var6 = 44032;
		char var7 = '\uac00';
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);

	}

}
