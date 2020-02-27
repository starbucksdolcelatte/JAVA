package sec02.exam09;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.27
*/

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		/* System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
		 * src : ���� �迭
		 * srcPos : ���� �迭���� ������ �׸��� ���� �ε���
		 * dest : ������ ���� �ٿ����� �� �迭
		 * destPos : �� �迭���� �ٿ����� ���� �ε���
		 * length : ������ ����
		 * */
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i] + ", ");
		
		System.out.print("\n\n");
		
		System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i] + ", ");
		
	}

}
