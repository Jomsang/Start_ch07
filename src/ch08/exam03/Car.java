package ch08.exam03;

public class Car implements Shipable, Flyable {	//Shipable로도 사용 가능하게 하고, Flyable로도 사용 가능하게 함.

	@Override
	public void takeOff() {
		System.out.println("이륙합니다.");
		
	}

	@Override
	public void land() {
		System.out.println("착륙합니다.");
		
	}

	@Override
	public void fly() {
		System.out.println("날라갑니다.");
		
	}

	@Override
	public void sailing() {
		System.out.println("항해합니다.");
		
	}

	@Override
	public void anchor() {
		System.out.println("정박합니다.");
		
	}

}
