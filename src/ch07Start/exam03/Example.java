package ch07Start.exam03;

public class Example {

	public static void main(String[] args) {
		Child child = new Child("�浿");	//��ü ������ ������ child ������ ��������
		System.out.println(child.firstname);
		System.out.println(child.lastname);
		child.sound();
		child.method2();
	}

}
