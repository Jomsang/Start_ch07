package ch07Start.exam03;

public class Parent {	//��ü�� ����������� �ʵ�� �޼ҵ常 ����
	//�ʵ�
	public String lastname;
	public String firstname;
	//������
	public Parent(String lastname, String firstname) {
		System.out.println("Parent ��ü ����");
		this.lastname = lastname;
		this.firstname = firstname;
	}
	//�޼ҵ�
	 void sound() {
		System.out.println("�����ض�~~~");
	}
}
