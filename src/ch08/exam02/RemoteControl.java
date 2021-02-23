package ch08.exam02;

public interface RemoteControl {	//인터페이스는 접근제한자가 없어도 PUBLIC이 생략되있음, 그래서 인터페이스를 구현하는 객체에서 메소드 구현시 PUBLIC으로 꼭 해야 함
	//상수
	//public static는 생략되있음 선언 안해도 상수
	String COMPANY = "삼성";
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	//상수는 구현 객체에서 값을 제한하거나, 참조해서 사용하게 할 때 지정.
	
	//메소드 (객체 사용 설명)
	/*public abstract 는 생략되있음(없어도 갖춰짐) 추상클래스 특성이 있다.*/ void turnOn();
	void turnOff();
	void setVolume(int volume);
}
