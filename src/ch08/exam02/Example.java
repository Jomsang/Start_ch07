package ch08.exam02;

public class Example {
	
	public static void method(RemoteControl a) {	//오로지 인터페이스만 존재(객체가 없음) //이 인터페이스로 사용 가능한 객체만 매개변수로 올 수 있음
		//인터페이스의 설명대로만 사용하는 코드
		a.turnOn();
		a.turnOff();
		a.setVolume(0);
	}

	public static void main(String[] args) {
		RemoteControl rc = new Television(); //풀이 : 인터페이스 RemoteControl을 가지고 Television 객체를 사용하려 한다.
		//인터페이스는 항상 해석이 매우 중요함.
		RemoteControl rc1 = new Audio();	//Audio라는 객체를 RemoteControl 인터페이스로 사용하겠다.
		
		//rc.turnOn();
		//rc.turnOff();
		//rc.setVolume(5);
		
		//method(rc1);
		method(rc);//다형성이 나타남, 텔레비전을 넣으면 텔레비전 메소드들이 실행, 오디오를 넣으면 오디오 메소드들 실행
		method(rc1);
	}

}
