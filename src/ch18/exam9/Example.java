package ch18.exam9;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example {

	public static void main(String[] args) {
		String filePath = "C:/Ch07Start/ch07Start/src/ch18/exam9/data.txt";
		try {	//문자기반 최상위 추상클래스이기 때문에 상속한 자식클래스로 객체 생성 해야 함. 


			Writer writer = new FileWriter(filePath);//운영체제의 기본 문자set을 쓰씀
			
			writer.write(new char[] {'A', '한'});

			writer.write(new char[] {'B', '글', 'C', 'D'}, 0, 2);//**'B'부터 2개인 'B', '글' 를 출력.

			writer.write("오늘은 날씨가 화창합니다.");
			writer.flush();	//출력 기반은 무조건 flush 해야 함. 그리고 reflesh해야 파일 생성 확인

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
