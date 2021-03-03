package ch18.exam12;

import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		
		
		try {
		OutputStream os = System.out; // out은 OutputStream 타입 , err로 하면 빨간 글씨로 나타 남
		os.write(65);
		os.write(new byte[] {66, 67, 68});
		os.write(new byte[] {66, 67, 68}, 0 , 2); //0인덱스 부터 2개
		os.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	} // 원리 설명을 위해서 함. 실제는 println으로 함 

}
