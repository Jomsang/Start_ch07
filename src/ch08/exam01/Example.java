package ch08.exam01;

public class Example {

	public static void main(String[] args) {
		RemoteControl rc = new Television(); //풀이 : 인터페이스 RemoteControl을 가지고 Television 객체를 사용하려 한다.
		//인터페이스는 항상 해석이 매우 중요함.
		RemoteControl rc1 = new Audio();	//Audio라는 객체를 RemoteControl 인터페이스로 사용하겠다.
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}

}
