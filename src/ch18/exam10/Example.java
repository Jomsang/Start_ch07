package ch18.exam10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Example {

	public static void main(String[] args) {
		String filePath1 = "C:/Ch07Start/ch07Start/src/ch18/exam10/data.txt.java";
		String filePath2 = "C:/Ch07Start/ch07Start/src/ch18/exam10/data2.txt.java";
		
		//ī�� ���α׷���, �ٵ� �ڹ� ������ �ؽ�Ʈ�� �ٲٴ� �������� ����. �ٸ� �����ؼ� �غ���
		
		
		try {
		Reader reader = new FileReader(filePath1);
		Writer writer = new FileWriter(filePath1);
		
		char[] data = new char[1024];
		int readNum = -1;
		while((readNum = reader.read(data)) != -1) {
			writer.write(data, 0, readNum); //  0, readNum ó������ ���� ��ŭ�� ���
		}
		writer.flush();
		
		
		
		reader.close();
		writer.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
