package ch08.exam02;

public class Audio implements RemoteControl {
	private int volume;
	@Override				//����� �����ǿ� ���� �ٸ� ����̴� ��� �������� ����.
	public void turnOn() {
		System.out.println("������� �մϴ�.");
		
	}

	@Override	//�������̵� ������̼� �� �ٿ��ֱ�
	public void turnOff() {
		System.out.println("������� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume < RemoteControl.MIN_VOLUME) { //����� ���� ��ü���� ���� �����ϰų�, �����ؼ� ����ϰ� �� �� ����.
			this.volume =  RemoteControl.MIN_VOLUME;
		}
		if(volume > RemoteControl.MAX_VOLUME) { //����� ���� ��ü���� ���� �����ϰų�, �����ؼ� ����ϰ� �� �� ����.
			this.volume =  RemoteControl.MAX_VOLUME;
		}
		System.out.println("Audio ������ "+this.volume+" �� �����մϴ�.");
		
	}
	
	
}
