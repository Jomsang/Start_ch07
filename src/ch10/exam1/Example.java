package ch10.exam1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {

	public static void main(String[] args) throws FileNotFoundException  {
		int[] arr = null;
		arr[0] = 10; //unchecked 예외 - NullPointerException 발생
		//컴파일러가 체크하지 않음
		
		
		
		FileInputStream fi = new FileInputStream("C: /Temp/file.txt");
		//컴파일러가 체크 함 (예외를 던지든, 예외 처리를 해줘야 함)		
	}

}
