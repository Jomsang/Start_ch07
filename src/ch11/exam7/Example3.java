package ch11.exam7;

public class Example3 {

	public static void main(String[] args) {
//		Integer var1 = new Integer(500);
//		Integer var2 = new Integer(500);
		
//		System.out.println(var1 == var2);	//false�� ���� (������ �ٸ��� ����)
//		System.out.println(var1.equals(var2));// true ���� ��
// -----------------------------------------------------------------------		
//		Integer var1 = 500;
//		Integer var2 = 500;
//		
//		System.out.println(var1 == var2);	//false (�ڵ� �ڽ� ��)
//		System.out.println(var1.equals(var2));// true ���� ��
		
		Integer var1 = 128;
		Integer var2 = 128;
		
		System.out.println(var1 == var2);	//true -128 ~ 127 ������ ���� ���� ���� ��ü�� �����Ѵ�.
		System.out.println(var1.equals(var2));// true ���� ��, **�ᱹ ����� ���� ���� ���� �� equals�� ����ض�!++
		//Math.pow, Math.random
	}

}
