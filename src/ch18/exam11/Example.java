package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;



public class Example {

	public static void main(String[] args) {
		
		try {
		InputStream is = System.in;//in은 InputStream 타입, 원리 설명만을 위해 함
		while(true) {
		int keyCode = is.read();	//a는 97, enter누르면 캐리지번호 13, 10이 나타남, 1은 49
		System.out.println(keyCode);
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
