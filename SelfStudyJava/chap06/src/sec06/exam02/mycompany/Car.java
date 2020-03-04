package sec06.exam02.mycompany;
/*
작성자 : StarbucksDolceLatte
작성일 : 2020.03.04
*/

import sec06.exam02.hankook.*;
import sec06.exam02.hyundai.Engine;
import sec06.exam02.kumho.*;

public class Car {
	
	// field
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// Tire class는 import된 두 패키지(hankook, kumho)에 모두 있기 때문에
	// 아래처럼 패키지 이름과 함께 전체 이름이 기술되어야 합니다.
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
}

