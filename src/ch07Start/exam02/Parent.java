package ch07Start.exam02;

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
	public void method1() {
		System.out.println("method1 ����");
	}
}
