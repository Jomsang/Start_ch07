package ch18.exam9;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example {

	public static void main(String[] args) {
		String filePath = "C:/Ch07Start/ch07Start/src/ch18/exam9/data.txt";
		try {	//���ڱ�� �ֻ��� �߻�Ŭ�����̱� ������ ����� �ڽ�Ŭ������ ��ü ���� �ؾ� ��. 


			Writer writer = new FileWriter(filePath);//�ü���� �⺻ ����set�� ����
			
			writer.write(new char[] {'A', '��'});

			writer.write(new char[] {'B', '��', 'C', 'D'}, 0, 2);//**'B'���� 2���� 'B', '��' �� ���.

			writer.write("������ ������ ȭâ�մϴ�.");
			writer.flush();	//��� ����� ������ flush �ؾ� ��. �׸��� reflesh�ؾ� ���� ���� Ȯ��

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
