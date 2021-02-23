package ch08.exam01;

public class Audio implements RemoteControl {

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
		System.out.println("Audio 볼륨을 "+volume+" 로 조정합니다.");
		
	}
	
	
}
