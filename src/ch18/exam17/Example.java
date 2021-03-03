package ch18.exam17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {	//버퍼를 안 쓴거와 쓴거의 시간 비교 - 버퍼를 안쓰면 15초. 버퍼를 쓰면 4초만에 카피가 됨.

	public static void main(String[] args) throws Exception{
		String filePath1 = "C:/Ch07Start/ch07Start/src/ch18/exam17/photo.jpg";
		String filePath2 = "C:/Ch07Start/ch07Start/src/ch18/exam17/photo2.jpg";
		String filePath3 = "C:/Ch07Start/ch07Start/src/ch18/exam17/photo3.jpg";
		
		InputStream is1 = new FileInputStream(filePath1);
		OutputStream os1 = new FileOutputStream(filePath2);
		copy(is1, os1);
		is1.close();
		os1.close();
		
		
		InputStream is2 = new FileInputStream(filePath1);//new FileInputStream(filePath1)를 그냥 밑에 변수로 주는것도 가능(상속관계이기 때문에)
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath1));
		OutputStream os2 = new FileOutputStream(filePath3);
		BufferedOutputStream bos = new BufferedOutputStream(os2); // OutputStream의 자식
		
		copy(bis, bos);
		
		bis.close();
		bos.close();//보조 스트림을 닫으면 주 스트림은 자동으로 close가 됨.
		
		
	}
	
	public static void copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		int data = -1;
		while((data = is.read()) != -1) { //일부러 배열을 안 받고 1바이트 씩으로 받으려 함
			os.write(data); 			  //순수하게 버퍼만 갖고 시간 측정 하려 함
		}
		os.flush();
		long end = System.nanoTime();
		System.out.println("복사 시간 : "+ (end - start)+" ns");
	}

}
