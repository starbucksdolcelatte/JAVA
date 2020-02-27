package sec02.exam10;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.27
*/

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		// for(타입 변수 : 배열)
		// 배열에서 꺼낸 항목을 저장할 변수 선언, 콜론(:), 그리고 배열을 나란히 작성
		for (int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum/scores.length;
		System.out.println("점수 평균 = " + avg);
	}

}
