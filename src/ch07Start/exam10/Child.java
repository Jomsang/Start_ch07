package ch07Start.exam10;

public class Child extends Parent{ 	//��ü�� ����������� �ʵ�� �޼ҵ常 ����
	//�ʵ�
	public int field2;
	//������
	
	//�޼ҵ�
	public void method1() {
		System.out.println("method2 ����");
	}
	
	@Override				//������̼��̶� ����
	public void method2() {
		
		System.out.println("�Ǿ��!!!");
	}
}
