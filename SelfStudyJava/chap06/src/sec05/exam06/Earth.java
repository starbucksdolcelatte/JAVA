package sec05.exam06;
/*
작성자 : StarbucksDolceLatte
작성일 : 2020.03.04
*/

// static final field 는 상수constant를 저장한다. 
// static : 객체마다 존재하지 않고 클래스에만 존재. 객체마다 가지고 있을 필요가 없는 공용 데이터일 경우 static 선언
// final : 한 번 초기값이 저장되면 변경될 수 없음
public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	static final double PI = 3.141592654;
}

