package ch11.exam7;

public class Example2 {

	public static void main(String[] args) {
		int var1 = Integer.parseInt("3");	//parseInt() - static �޼ҵ�
		double var3 = Double.parseDouble("3.5");
		
		Integer var4 = new Integer(3);
		Integer var5 = new Integer("3"); // Wrapper Ŭ������ �Ű������� ���ڳ� ���ڿ��� "3"�� �� �� ���� 
		Integer var6 = 3;				 //****�� �����̶� , int var1 = Integer.parseInt("3");�� ���� ���� ���
		
	}

}
