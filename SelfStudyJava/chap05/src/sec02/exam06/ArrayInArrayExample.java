package sec02.exam06;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.27
*/

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3]; // 2x3 ũ���� �迭
		for (int i=0; i<mathScores.length; i++) {
			for (int j=0; j<mathScores[i].length; j++) {
				System.out.println("mathScores[" +i+ "][" +j+ "]=" + mathScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2]; // englishScores[0] ũ��� 2
		englishScores[1] = new int[3]; // englishScores[1] ũ��� 3
		for (int i=0; i<englishScores.length; i++) {
			for (int j=0; j<englishScores[i].length; j++) {
				System.out.println("englishScores[" +i+ "][" +j+ "]=" + englishScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} }; // 2+3 ũ�� �迭
		// javaScores[0] �� {95, 80}�� ����
		// javaScores[1] �� {92, 96, 80}�� ����
		
		for (int i=0; i<javaScores.length; i++) {
			for (int j=0; j<javaScores[i].length; j++) {
				System.out.println("javaScores[" +i+ "][" +j+ "]=" + javaScores[i][j]);
			}
		}
	}

}
