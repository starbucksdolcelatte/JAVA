package sec06.exam02.mycompany;
/*
�ۼ��� : StarbucksDolceLatte
�ۼ��� : 2020.03.04
*/

import sec06.exam02.hankook.*;
import sec06.exam02.hyundai.Engine;
import sec06.exam02.kumho.*;

public class Car {
	
	// field
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// Tire class�� import�� �� ��Ű��(hankook, kumho)�� ��� �ֱ� ������
	// �Ʒ�ó�� ��Ű�� �̸��� �Բ� ��ü �̸��� ����Ǿ�� �մϴ�.
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
}

