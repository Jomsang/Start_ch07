package ch07Start.exam08;

public class Example {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		car.t1 = new TireChild1();	//���� Tire��ü�� �����߾��µ� �ڽ� ��ü�� TireChild1, 2�� ���� �� �����ؼ� �����ϰ� ��			//Ÿ�� ��ȯ
		car.t2 = new TireChild2();	//�׷��� t1�� t2�� tire�� �ڽ� ��ü�� TireChild1,2�� �����ϱ� ������ TireChild1,2�� �����ǵ� �޼ҵ� roll�� �����ϰ� ��
		car.run();
	}

}
