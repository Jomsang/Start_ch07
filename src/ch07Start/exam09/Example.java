package ch07Start.exam09;

public class Example {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Vehicle());
		driver.drive(new Bus());	//�ڽ� ��ü�� Bus�� Taxi���� �������� drive �޼ҵ尡 ����ȴ�.
		driver.drive(new Taxi());

	}

}
