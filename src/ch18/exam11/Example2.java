package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;



public class Example2 {

	public static void main(String[] args) {
		
		try {
		InputStream is = System.in;
		byte[] data = new byte[100];
		while(true) {
		int readNum = is.read(data);	//�ִ� 100����Ʈ���� ����
		String str = new String(data, 0, readNum - 2); // ���� ĳ���� �Է�2���� �߻��ؼ� ������� ��
		System.out.println(str);
		}
		}catch(IOException e) {
			e.printStackTrace();
		}//Scanner input = new Scanner �� Ǯ�̶� �����ϸ� ��. 
	}

}
