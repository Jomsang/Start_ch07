package ch18.exam16;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Example2 {

	public static void main(String[] args) throws Exception {
//		String filePath = "C:/Ch07Start/ch07Start/src/ch18/exam16/data.txt";
//		
//		OutputStream os = new FileOutputStream(filePath);
//		
//		String data = "������ �������̴�."; //���� -> ����Ʈ�� �ٲٱ�
//		byte[] bytes = data.getBytes("UTF-8"); //�ѱ� �� ���ڰ� 3����Ʈ�� ��
//		os.write(bytes);
//		os.flush();
//		
//		data = "������ �����ؿ�."; //���� -> ����Ʈ�� �ٲٱ�
//		bytes = data.getBytes("UTF-8"); //�ѱ� �� ���ڰ� 3����Ʈ�� ��
//		os.write(bytes);
//		os.flush();
//		
//
//		os.close();

		String filePath = "C:/Ch07Start/ch07Start/src/ch18/exam16/data.txt";
		OutputStream os = new FileOutputStream(filePath);
		Writer writer = new OutputStreamWriter(os, "UTF-8"); //�Է°��� �ٸ��� ������Ʈ�� 1���θ� �ؼ� �ϸ� ��.
		//(����Ʈ)�迭�� �ؼ� �ؼ�.. �� �ʿ䰡 ����
		
		String data = "�������̴�.";
		writer.write(data);
		writer.flush();
		
		data = "�����ϴ�.";
		writer.write(data);
		writer.flush();
		
		writer.close();
	} 

}
