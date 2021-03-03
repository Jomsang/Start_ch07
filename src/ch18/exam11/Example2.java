package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;



public class Example2 {

	public static void main(String[] args) {
		
		try {
		InputStream is = System.in;
		byte[] data = new byte[100];
		while(true) {
		int readNum = is.read(data);	//최대 100바이트까지 리턴
		String str = new String(data, 0, readNum - 2); // 엔터 캐리지 입력2개가 발생해서 없애줘야 함
		System.out.println(str);
		}
		}catch(IOException e) {
			e.printStackTrace();
		}//Scanner input = new Scanner 의 풀이라 생각하면 됨. 
	}

}
