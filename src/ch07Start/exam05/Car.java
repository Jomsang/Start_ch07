package ch07Start.exam05;

public class Car {
	//필드
	
	//생성자
	
	//메소드
	
	
	public final void stop() {	//Car 클래스를 상속 받는 자식 클래스에서 이 stop메소드를 재정의 하지 못함.(final이 붙었기 때문)
		System.out.println("멈춰");
	}
	
	public void run() {
		System.out.println("달려");
	}
}
