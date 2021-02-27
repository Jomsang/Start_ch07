package ch08.exam04;

public class Car {
	//필드
	//public Tire t1 = new Tire(); Tire는 인터페이스, 클래스가 아님. 
	public Tire t1 = new KumhoTire();
	public Tire t2;
	public Tire t3;
	public Tire t4;
	//생성자
	//메소드
	public void run() {//이것만 보고 결과를 알 수 없음, 객체를 대입 해줘야 실행 결과를 알 수 있음.
		t1.roll();
		t2.roll();
		t3.roll();
		t4.roll();
	}
}
