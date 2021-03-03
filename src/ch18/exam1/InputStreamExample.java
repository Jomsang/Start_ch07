package ch18.exam1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {
		String filePath = "C:/Ch07Start/ch07Start/src/ch18/exam1/data.txt";
		try {
			InputStream is = new FileInputStream(filePath); //FileInputStream - InputStream의 자식 클래스임
			while(true) {
				int data = is.read();
				if(data == -1) {
					break;
				}
				System.out.println(data);
			}
			is.close(); //닫아줘야 다른 프로그램이 사용가능하게 해야함. 안 하면 충돌
			
////			int byte1 = is.read();	//파일의 권한 문제로 인해 이 파일을 읽지 못 할때 IOException 예외가 생김. 그래서 처리
////			int byte2 = is.read();
////			int byte3 = is.read();	//1 바이트씩 담음 
////			int byte4 = is.read();
////			System.out.println(byte1);
////			System.out.println(byte2);
////			System.out.println(byte3);		//문자는 Reader를 써야하는데 Stream을 일단 예로 들었음.
////			System.out.println(byte4);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		//방법 1-------------------------------------------------------------
		
		
		
		
		
		
		String filePath1 = "C:/Ch07Start/ch07Start/src/ch18/exam1/data.txt";
		try {
			InputStream is = new FileInputStream(filePath1); //FileInputStream - InputStream의 자식 클래스임
			
			int data = -1;
			while((data = is.read()) != -1) {
			
				System.out.print(data);
			}
			is.close(); //닫아줘야 다른 프로그램이 사용가능하게 해야함. 안 하면 충돌
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		//방법 2-----------------------------------------------------------
	}

}
