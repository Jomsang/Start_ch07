package ch08.exam02;

public class Audio implements RemoteControl {
	private int volume;
	@Override				//상속의 재정의와 절대 다른 얘기이니 엮어서 생각하지 말기.
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override	//오버라이드 어노테이션 꼭 붙여주기
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume < RemoteControl.MIN_VOLUME) { //상수는 구현 객체에서 값을 제한하거나, 참조해서 사용하게 할 때 지정.
			this.volume =  RemoteControl.MIN_VOLUME;
		}
		if(volume > RemoteControl.MAX_VOLUME) { //상수는 구현 객체에서 값을 제한하거나, 참조해서 사용하게 할 때 지정.
			this.volume =  RemoteControl.MAX_VOLUME;
		}
		System.out.println("Audio 볼륨을 "+this.volume+" 로 조정합니다.");
		
	}
	
	
}
