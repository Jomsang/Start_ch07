package ch08.exam03;

public class Example {
	public static void use1(Shipable shipable) {	//다중 인터페이스
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
		// use2(mycar1);  //mycar1의 데이터 타입이 Shipable이기 때문에 use2(Flyable flyable) 은 사용 불가
		
		//use1(mycar2);	//mycar2의 데이터 타입이 Flyable이기 때문에 use1(Shipable shipable) 은 사용 불가
		use2(mycar2);
	}

}
