package ch07Start.exam09;

public class Example {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Vehicle());
		driver.drive(new Bus());	//자식 객체인 Bus와 Taxi에서 재정의한 drive 메소드가 실행된다.
		driver.drive(new Taxi());

	}

}
