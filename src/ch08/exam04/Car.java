package ch08.exam04;

public class Car {
	//�ʵ�
	//public Tire t1 = new Tire(); Tire�� �������̽�, Ŭ������ �ƴ�. 
	public Tire t1 = new KumhoTire();
	public Tire t2;
	public Tire t3;
	public Tire t4;
	//������
	//�޼ҵ�
	public void run() {//�̰͸� ���� ����� �� �� ����, ��ü�� ���� ����� ���� ����� �� �� ����.
		t1.roll();
		t2.roll();
		t3.roll();
		t4.roll();
	}
}
