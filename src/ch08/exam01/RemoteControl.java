package ch08.exam01;

 interface RemoteControl {	//�������̽��� ���������ڰ� ��� PUBLIC�� ����������, �׷��� �������̽��� �����ϴ� ��ü���� �޼ҵ� ������ PUBLIC���� �� �ؾ� ��
	//���
	//public static final�� ���������� ���� ���ص� ���
	String COMPANY = "�Ｚ";
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	
	//�޼ҵ� (��ü ��� ����)
	/*public abstract �� ����������(��� ������) �߻�Ŭ���� Ư���� �ִ�.*/ void turnOn();
	void turnOff();
	void setVolume(int volume);
}
