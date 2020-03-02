package sec05.exam04;
/*
�ۼ��� : StarbucksDolceLatte
�ۼ��� : 2020.03.02
*/

// ��ü ���α׷����� �� �ϳ��� ��ü�� ���鵵�� �����ؾ� �ϴ� ��찡 �ֽ��ϴ�.
// �� �ϳ��� �����ȴٰ� �ؼ� �� ��ü�� singleton�̶�� �մϴ�.

// �̱����� ������� Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ� �մϴ�.
// ���� �����ڸ� �ܺο��� ȣ���� �� ������ ������ �տ� private ���� �����ڸ� �ٿ��ݴϴ�.
public class Singleton {
	//���� �ʵ带 �����ϰ� �ڽ��� ��ü�� ������ �ʱ�ȭ
	private static Singleton singleton = new Singleton();
	
	//������
	private Singleton() {}
	
	//���� �޼ҵ�
	static Singleton getInstance() {
		return singleton;
	}
}
