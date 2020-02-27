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
		 * src : 원본 배열
		 * srcPos : 원본 배열에서 복사할 항목의 시작 인덱스
		 * dest : 복사한 값을 붙여넣을 새 배열
		 * destPos : 새 배열에서 붙여넣을 시작 인덱스
		 * length : 복사할 개수
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
