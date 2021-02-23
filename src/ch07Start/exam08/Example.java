package ch07Start.exam08;

public class Example {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		car.t1 = new TireChild1();	//원래 Tire객체를 참조했었는데 자식 객체인 TireChild1, 2를 생성 후 대입해서 참조하게 함			//타입 변환
		car.t2 = new TireChild2();	//그래서 t1과 t2는 tire의 자식 객체인 TireChild1,2를 참조하기 때문에 TireChild1,2의 재정의된 메소드 roll을 실행하게 됨
		car.run();
	}

}
