package ch18.exam18;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Example {	//버퍼를 안 쓴거와 쓴거의 시간 비교 - 버퍼를 안쓰면 15초. 버퍼를 쓰면 4초만에 카피가 됨.

	public static void main(String[] args) throws Exception{
		String filePath1 = "C:/Ch07Start/ch07Start/src/ch18/exam18/data.db";
		InputStream is = new FileInputStream(filePath1);
		DataInputStream dis = new DataInputStream(is);// 파일에 자료형이 인트나 더블 등 기본타입이 다양할때 이 스트림이 유용
		
		int var1 = dis.readInt(); //4바이트로 읽어서 int로 만들 어줌
		double var2 = dis.readDouble();//
		boolean var3 = dis.readBoolean();//
		String var4 = dis.readUTF();//
									//일일히 분해 작업을 하면 불편하니 스트림을 사용하면 편함
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		dis.close();	
	}

}
