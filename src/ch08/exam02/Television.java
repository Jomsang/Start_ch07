package ch08.exam02;

public class Television implements RemoteControl {
	private int volume;	//인터페이스를 갖고 있는 한정된 범위에서만 사용 가능함.
	
	public void turnOn() {				//public을 붙이고 인터페이스를 구현
		System.out.println("TV를 켬니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끝니다.");
	}
	public void setVolume(int volume) {
		if(volume < RemoteControl.MIN_VOLUME) { //상수는 구현 객체에서 값을 제한하거나, 참조해서 사용하게 할 때 지정.
			this.volume =  RemoteControl.MIN_VOLUME;
		}
		if(volume > RemoteControl.MAX_VOLUME) { //상수는 구현 객체에서 값을 제한하거나, 참조해서 사용하게 할 때 지정.
			this.volume =  RemoteControl.MAX_VOLUME;
		}
		
		System.out.println("TV 볼륨을 "+volume+" 로 조정합니다.");
	}
}
