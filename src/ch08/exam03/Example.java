package ch08.exam03;

public class Example {
	public static void use1(Shipable shipable) {	//���� �������̽�
		shipable.sailing();
		shipable.anchor();
	}
	public static void use2(Flyable flyable) {
		flyable.takeOff();
		flyable.land();
		flyable.fly();
	}
	public static void main(String[] args) {
		Car mycar = new Car();
		Shipable mycar1 = new Car();
		Flyable mycar2 = new Car();
		use1(mycar);
		use2(mycar);
		
		use1(mycar1);
		// use2(mycar1);  //mycar1�� ������ Ÿ���� Shipable�̱� ������ use2(Flyable flyable) �� ��� �Ұ�
		
		//use1(mycar2);	//mycar2�� ������ Ÿ���� Flyable�̱� ������ use1(Shipable shipable) �� ��� �Ұ�
		use2(mycar2);
	}

}
