package ch08.exam01;

 interface RemoteControl {	//인터페이스는 접근제한자가 없어도 PUBLIC이 생략되있음, 그래서 인터페이스를 구현하는 객체에서 메소드 구현시 PUBLIC으로 꼭 해야 함
	//상수
	//public static final은 생략되있음 선언 안해도 상수
	String COMPANY = "삼성";
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	
	//메소드 (객체 사용 설명)
	/*public abstract 는 생략되있음(없어도 갖춰짐) 추상클래스 특성이 있다.*/ void turnOn();
	void turnOff();
	void setVolume(int volume);
}
