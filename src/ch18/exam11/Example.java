package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;



public class Example {

	public static void main(String[] args) {
		
		try {
		InputStream is = System.in;//in�� InputStream Ÿ��, ���� ������ ���� ��
		while(true) {
		int keyCode = is.read();	//a�� 97, enter������ ĳ������ȣ 13, 10�� ��Ÿ��, 1�� 49
		System.out.println(keyCode);
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
