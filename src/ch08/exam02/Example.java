package ch08.exam02;

public class Example {
	
	public static void method(RemoteControl a) {	//������ �������̽��� ����(��ü�� ����) //�� �������̽��� ��� ������ ��ü�� �Ű������� �� �� ����
		//�������̽��� �����θ� ����ϴ� �ڵ�
		a.turnOn();
		a.turnOff();
		a.setVolume(0);
	}

	public static void main(String[] args) {
		RemoteControl rc = new Television(); //Ǯ�� : �������̽� RemoteControl�� ������ Television ��ü�� ����Ϸ� �Ѵ�.
		//�������̽��� �׻� �ؼ��� �ſ� �߿���.
		RemoteControl rc1 = new Audio();	//Audio��� ��ü�� RemoteControl �������̽��� ����ϰڴ�.
		
		//rc.turnOn();
		//rc.turnOff();
		//rc.setVolume(5);
		
		//method(rc1);
		method(rc);//�������� ��Ÿ��, �ڷ������� ������ �ڷ����� �޼ҵ���� ����, ������� ������ ����� �޼ҵ�� ����
		method(rc1);
	}

}
