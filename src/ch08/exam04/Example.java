package ch08.exam04;

public class Example {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//타이어 장착
		//myCar.t1 = new KumhoTire(); //KumhoTire가 Tire를 구현하기 때문에 t1에 대입 가능
		myCar.t2 = new KumhoTire();
		
		myCar.t3 = new HankookTire();
		myCar.t4 = new HankookTire();
		
		//달리자.
		myCar.run();
	}

}
