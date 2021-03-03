package ch18.exam16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws Exception{
		
		
		//방법 1 - 잘 안 사용
//		InputStream is = System.in;
//		byte[] data = new byte[100];
//		int readNum = is.read(data);
//		String str = new String(data, 0, readNum - 2);
//		System.out.println(str);
//		
//		
//		 readNum = is.read(data);
//			str = new String(data, 0, readNum - 2);
//			System.out.println(str);
		
		
		//방법2
			InputStream is = System.in;	
			InputStreamReader isr = new InputStreamReader(is); //바이트에서 문자로 바꿔주는 보조 스트림
			BufferedReader br = new BufferedReader(isr);//보조스트림을 더 추가( 두 보조 스트림을 같이 사용 함.)
			
			String str = br.readLine();
			System.out.println(str);
			
			str = br.readLine();
			System.out.println(str);
			
			// ==  byte[] data = new byte[100];
//			int readNum = is.read(data);
//			String str = new String(data, 0, readNum - 2);
//			System.out.println(str);            와 같은 문장임
	} 

}
