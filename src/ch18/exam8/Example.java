package ch18.exam8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Example {
	
	public static void main(String[] args) {
		String filePath = "C:/Ch07Start/ch07Start/src/ch18/exam8/data.txt";
		try {	//문자기반 최상위 추상클래스이기 때문에 상속한 자식클래스로 객체 생성 해야 함. 
			

			Reader reader = new FileReader(filePath);//운영체제의 기본 문자set을 쓰씀
			

			
			char[] data = new char[2]; //최대 2글자까지 읽을 수 있음.(파일의 크기가 클 경우 배열 크기를 증가 시키기.)
			int readNum = -1;	//	읽은 문자 수
			String str = "";
			while((readNum = reader.read(data))!= -1) { 
				str += new String(data, 0, readNum);//0, readNum 이 부분이 C만 나오게 하는 부분	
													//(0에서 2까지만 출력인데, -1이 있으면 제외?????)
//				System.out.println(Arrays.toString(data)); //C만 추가했으므로 C 전의 B, 글의 글이 남아서 나옴. 
			}
			System.out.println(str);
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
