package ch07Start.exam07;

public class Example {

	public static void main(String[] args) {
		Child child = new Child();	//��ü ������ ������ child ������ ��������
		child.method1();
		child.method2();
		child.method3();
		
		//Parent parent = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();// ***�� �κ��� ���� �߿�
		//parent.method3(); child����������, ������ Ÿ���� Parent�̱� ������ 
	}

}
