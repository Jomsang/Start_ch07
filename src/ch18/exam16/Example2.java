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
//		String data = "오늘은 수요일이다."; //문자 -> 바이트로 바꾸기
//		byte[] bytes = data.getBytes("UTF-8"); //한글 한 글자가 3바이트로 들어감
//		os.write(bytes);
//		os.flush();
//		
//		data = "오늘은 따뜻해요."; //문자 -> 바이트로 바꾸기
//		bytes = data.getBytes("UTF-8"); //한글 한 글자가 3바이트로 들어감
//		os.write(bytes);
//		os.flush();
//		
//
//		os.close();

		String filePath = "C:/Ch07Start/ch07Start/src/ch18/exam16/data.txt";
		OutputStream os = new FileOutputStream(filePath);
		Writer writer = new OutputStreamWriter(os, "UTF-8"); //입력과는 다르게 보조스트림 1개로만 해서 하면 됨.
		//(바이트)배열로 해서 해서.. 할 필요가 없음
		
		String data = "수요일이다.";
		writer.write(data);
		writer.flush();
		
		data = "따뜻하다.";
		writer.write(data);
		writer.flush();
		
		writer.close();
	} 

}
