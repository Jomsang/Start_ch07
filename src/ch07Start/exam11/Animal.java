package ch07Start.exam11;

public abstract class Animal {	//�߻�Ŭ������ ��ü�� ����� ����., �ڽ� Ŭ�������� ����� �κ��� ������ abstract�� ����.
								//�߻� Ŭ�������߸� �߻� �޼ҵ带 ���� �� ����.(*������ ����� ���ؼ��� ��� ����.)
	public String name;
	public String kind;
	
	public void sleep() {
		System.out.println("���� ��ϴ�.");
	}
	public void eat() {
		System.out.println("�Խ��ϴ�.");
	}
	
	public abstract void sound(); 	//�Ҹ��� ���µ� ����̿� ���� ¢�� �Ҹ��� �ٸ��⶧���� ���⼭ ������ ������� �߻����� ����
									//���⼭ ������ ������� �߻����� �����ϰ� �ڽ� Ŭ�����鿡�� ������ �ؾ���
									//���� ���ϸ� ������ ������.
	
	
}
