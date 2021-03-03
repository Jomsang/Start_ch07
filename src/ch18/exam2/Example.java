package ch18.exam2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		String filePath1 = "C:/Ch07Start/ch07Start/src/ch18/exam2/data.txt";
		try {
			InputStream is = new FileInputStream(filePath1);
			
			byte[] data = new byte[1024]; // 한 번 읽을때 1024바이트까지 읽음
			
//			while(true) {
//			int readNum = is.read(data);
//			if(readNum == -1) {
//				break;
//			}
//			System.out.println(readNum + " : "+ Arrays.toString(data));
//
////			readNum = is.read(data);
////			System.out.println(readNum + " : "+ Arrays.toString(data));	//이전에 읽은 67은 남아 있음(같은 배열을 썻기 때문에)
////			
////			readNum = is.read(data);
////			System.out.println(readNum + " : "+ Arrays.toString(data));// -1이 나오고 68,69,67 그대로 나옴
//			}
//			is.close();
			int readNum = -1;
			while((readNum = is.read(data)) != -1) {	//한번만 실행하고 끝남. data.txt가 1024바이트면 byte크기를 1024를 줬기 때문에 1번 읽음
				System.out.println(readNum + " : "+ Arrays.toString(data)); // 만약 byte크기를 1로 주면 1024번 읽음(while문)
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
