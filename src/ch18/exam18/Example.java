package ch18.exam18;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Example {	//���۸� �� ���ſ� ������ �ð� �� - ���۸� �Ⱦ��� 15��. ���۸� ���� 4�ʸ��� ī�ǰ� ��.

	public static void main(String[] args) throws Exception{
		String filePath1 = "C:/Ch07Start/ch07Start/src/ch18/exam18/data.db";
		InputStream is = new FileInputStream(filePath1);
		DataInputStream dis = new DataInputStream(is);// ���Ͽ� �ڷ����� ��Ʈ�� ���� �� �⺻Ÿ���� �پ��Ҷ� �� ��Ʈ���� ����
		
		int var1 = dis.readInt(); //4����Ʈ�� �о int�� ���� ����
		double var2 = dis.readDouble();//
		boolean var3 = dis.readBoolean();//
		String var4 = dis.readUTF();//
									//������ ���� �۾��� �ϸ� �����ϴ� ��Ʈ���� ����ϸ� ����
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		dis.close();	
	}

}
