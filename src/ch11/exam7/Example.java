package ch11.exam7;



public class Example {

	public static void main(String[] args) {
		int var1 = 10;// �⺻ ���� 
		
		Integer var2 = new Integer(10);// �������� (������ �� ����) ���� ������ ���̰� ����
		Integer var3 = 10;	//��������� ���� �ȵǴµ� WrapperŬ������ ���� ��.
							//new Integer(10); �� �������ִ°���! �������� ���� //Auto Boxing �̶�� ��.
		
		double var4 = 3.5;
		Double var5 = new Double(4.5);
		Double var6 = 3.5; //	Auto Boxing
		
		Integer var7 = new Integer(10);
		int var8 = var7.intValue(); // var7�� �ִ� 10�� ������ ���ͼ� int var8�� ���尡��
		int var9 = var7; //Auto UnBoxing - �ڵ����� �ڽ��� Ǯ���� �ȿ� ���� ��.(intvalue() ����
		
		Double var10 = new Double(3.5);
		double var11 = var10.doubleValue();
		double var12 = var10;
		
		
		// Wrapper Ŭ������ ��ɵ鸸 ��ü�� �⺻Ÿ�Կ� ���� ����.
		
		Object[] arr = new Object[5];
		arr[0] = "abc";		//Object�� ��� ��ü�� �θ��̱� ������ ����
		arr[1] = 10;	//Java5 ���� ���� IntegerŬ������ ��ȯ�Ǽ� ��ü�� ���� �� �ּҸ� ��������. //Auto Boxing
		arr[2] = true;	//new Boolean�� �����¾�����. //Auto Boxing
		
		
	}

}
