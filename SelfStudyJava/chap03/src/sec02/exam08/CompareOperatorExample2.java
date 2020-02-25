package sec02.exam08;
/*
 * Author : StarbucksDolceLatte
 * Date   : 2020.02.25
*/

public class CompareOperatorExample2 {
	public static void main(String[] args)
	{ 
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2==v3); //v2가 double 타입으로 변환되어 true
		
		double v4 = 0.1;
		float v5 = 0.1f; 
		System.out.println(v4==v5); //false : v5도 double로 자동변환되지만, 
		// 실수의 저장 방식인 부동 소수점 방식이 0.1을 정확히 표현할 수 없기 때문이다.
		// 0.1f는 0.1의 근사값으로 표현되기 때문에 0.1보다 큰 값이 되어 버린다.
		System.out.println((float)v4==v5);
	}
}
