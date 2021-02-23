package ch08.exam01;

public class Television implements RemoteControl {
	public void turnOn() {				//public을 붙이고 인터페이스를 구현
		System.out.println("TV를 켬니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끝니다.");
	}
	public void setVolume(int volume) {
		System.out.println("TV 볼륨을 "+volume+" 로 조정합니다.");
	}
}
