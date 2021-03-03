package ch18.exam10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Example {

	public static void main(String[] args) {
		String filePath1 = "C:/Ch07Start/ch07Start/src/ch18/exam10/data.txt.java";
		String filePath2 = "C:/Ch07Start/ch07Start/src/ch18/exam10/data2.txt.java";
		
		//카피 프로그램임, 근데 자바 파일을 텍스트로 바꾸는 과정에서 날라감. 다른 파일해서 해보기
		
		
		try {
		Reader reader = new FileReader(filePath1);
		Writer writer = new FileWriter(filePath1);
		
		char[] data = new char[1024];
		int readNum = -1;
		while((readNum = reader.read(data)) != -1) {
			writer.write(data, 0, readNum); //  0, readNum 처음부터 읽은 만큼만 출력
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
