package ch18.exam4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		String filePath = "C:\\Ch07Start\\ch07Start\\src\\ch18\\exam4\\data.txt";	//reflesh�ϸ� ������ ��������� Ȯ�� ����
		try {
			OutputStream os = new FileOutputStream(filePath);
			byte[] arr = {65, 66, 67};
			os.write(arr);//�ؿ��� ���� ǥ��
			os.write(arr, 0 , arr.length);//
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
