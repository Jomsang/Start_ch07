package ch09.exam03;

public class A {					
	public void method(int x) { //final int x �ε� �ڹ� 8���� ���� �����ϰ� ��.
		int y = 2;
		
		//x = 10;  - �̷��� �ָ� B�� method�� ����� x ���� ���� ��(x�� ������ final�� ������ �־ �ѹ� ������ ��)
		// y = 20; �� �������� 
		class B{
			public void method() {
				int result = x + y;
			}
		}
	}
}
