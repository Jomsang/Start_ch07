package ch18.exam18;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example2 {	//버퍼를 안 쓴거와 쓴거의 시간 비교 - 버퍼를 안쓰면 15초. 버퍼를 쓰면 4초만에 카피가 됨.

	public static void main(String[] args) throws Exception{
		String filePath1 = "C:/Ch07Start/ch07Start/src/ch18/exam18/data.db";
		OutputStream os = new FileOutputStream(filePath1);
		DataOutputStream dos = new DataOutputStream(os);
		
		dos.writeInt(3); // INT형 4바이트
		dos.writeDouble(10.5); // 8바이트
		dos.writeBoolean(true); //1바이트 
		dos.writeUTF("홍길동"); // 9바이트 - 한글 하나에 3바이트
		dos.flush();
		
		dos.close();	
	}

}
