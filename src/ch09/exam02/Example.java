package ch09.exam02;

public class Example {

	public static void main(String[] args) {
		A a = new A();
		
		 A.B b = a.new B();	//�����ϸ� ����. ���� �����ϸ� ��. // a.new B(); �ν��Ͻ� ��ø Ŭ�������� ��ü�� �־�� ȣ��// �� �Ⱦ�
		 b.field = 1;
		 b.method();
		 
		 A.C c = new A.C();//�̰Ÿ� ���� ��
		 
		 
	}

}
