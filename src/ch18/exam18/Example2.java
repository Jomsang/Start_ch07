package ch18.exam18;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example2 {	//���۸� �� ���ſ� ������ �ð� �� - ���۸� �Ⱦ��� 15��. ���۸� ���� 4�ʸ��� ī�ǰ� ��.

	public static void main(String[] args) throws Exception{
		String filePath1 = "C:/Ch07Start/ch07Start/src/ch18/exam18/data.db";
		OutputStream os = new FileOutputStream(filePath1);
		DataOutputStream dos = new DataOutputStream(os);
		
		dos.writeInt(3); // INT�� 4����Ʈ
		dos.writeDouble(10.5); // 8����Ʈ
		dos.writeBoolean(true); //1����Ʈ 
		dos.writeUTF("ȫ�浿"); // 9����Ʈ - �ѱ� �ϳ��� 3����Ʈ
		dos.flush();
		
		dos.close();	
	}

}
