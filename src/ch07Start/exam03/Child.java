package ch07Start.exam03;

public class Child extends Parent{ 	//��ü�� ����������� �ʵ�� �޼ҵ常 ����
	//�ʵ�
	public int field2;
	//������
	public Child(String firstname) {
		super("��", firstname); //super�� �׻� ù�ٿ��� ���
		System.out.println("child ��ü ����");
	}
	//�޼ҵ�
	public void method2() {
		System.out.println("method2 ����");
	}
	
	@Override				//������̼��̶� ����
	public void sound() {
		
		System.out.println("�Ǿ��!!!");
	}
}
