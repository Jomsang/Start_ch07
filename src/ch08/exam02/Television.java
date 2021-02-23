package ch08.exam02;

public class Television implements RemoteControl {
	private int volume;	//�������̽��� ���� �ִ� ������ ���������� ��� ������.
	
	public void turnOn() {				//public�� ���̰� �������̽��� ����
		System.out.println("TV�� �Դϴ�.");
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	public void setVolume(int volume) {
		if(volume < RemoteControl.MIN_VOLUME) { //����� ���� ��ü���� ���� �����ϰų�, �����ؼ� ����ϰ� �� �� ����.
			this.volume =  RemoteControl.MIN_VOLUME;
		}
		if(volume > RemoteControl.MAX_VOLUME) { //����� ���� ��ü���� ���� �����ϰų�, �����ؼ� ����ϰ� �� �� ����.
			this.volume =  RemoteControl.MAX_VOLUME;
		}
		
		System.out.println("TV ������ "+volume+" �� �����մϴ�.");
	}
}
