package ch08.exam01;

public class Audio implements RemoteControl {

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
		System.out.println("Audio ������ "+volume+" �� �����մϴ�.");
		
	}
	
	
}
