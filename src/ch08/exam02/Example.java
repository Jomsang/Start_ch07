package ch08.exam02;

public class Example {
	
	public static void method(RemoteControl rc) {	//������ �������̽��� ����(��ü�� ����) //�� �������̽��� ��� ������ ��ü�� �Ű������� �� �� ����
		//�������̽��� �����θ� ����ϴ� �ڵ�
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}

	public static void main(String[] args) {
		RemoteControl rc = new Television(); //Ǯ�� : �������̽� RemoteControl�� ������ Television ��ü�� ����Ϸ� �Ѵ�.
		//�������̽��� �׻� �ؼ��� �ſ� �߿���.
		RemoteControl rc1 = new Audio();	//Audio��� ��ü�� RemoteControl �������̽��� ����ϰڴ�.
		
		//rc.turnOn();
		//rc.turnOff();
		//rc.setVolume(5);
		
		//method(rc1);
		method(new Television());//�������� ��Ÿ��, �ڷ������� ������ �ڷ����� �޼ҵ���� ����, ������� ������ ����� �޼ҵ�� ����
		method(new Audio());
	}

}
