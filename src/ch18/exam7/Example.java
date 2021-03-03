package ch18.exam7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example {
	
	public static void main(String[] args) {
		String filePath = "C:/Ch07Start/ch07Start/src/ch18/exam7/data.txt";
		try {	//문자기반 최상위 추상클래스이기 때문에 상속한 자식클래스로 객체 생성 해야 함. 
			
//			
//			FileInputStream fis = new FileInputStream(filePath); //운영체제의 기본 문자set을 쓰기 때문에 한글 윈도우 문자셋 ms 949여서 utf8로 바꾸면 ? 나옴
//			Reader reader = new InputStreamReader(fis, "UTF-8");//한글은 3바이트로 읽어버림, 그래서 ?가 한 으로 뜸
			
			Reader reader = new FileReader(filePath);//운영체제의 기본 문자set을 쓰씀
			
			
//			while(true) { -- 방법 1
//				int charCode = reader.read();	//읽기 권한이 없을 때 IOException 발생
//				char charData = (char) charCode;
//				if(charCode == -1) {
//					break;
//				}
//				System.out.println(charCode +" : "+charData);
//			}

			
			
			int charCode = -1;	//	방법 2 --
			while((charCode = reader.read())!= -1) { //한 문자만 읽기 때문에 파일이 크면 클 수록 읽기 성능이 느려짐
				char charData = (char) charCode;	//, 이 방식은 안 사용 함. 그래서 배열로 읽는 법이 있음
				System.out.println(charCode +" : "+charData);
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
