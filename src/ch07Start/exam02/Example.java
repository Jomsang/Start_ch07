package ch07Start.exam02;

public class Example {

	public static void main(String[] args) {
		Child child = new Child("�浿");	//��ü ������ ������ child ������ ��������
		System.out.println(child.firstname);
		System.out.println(child.lastname);
		child.method1();
		child.method2();
	}

}
