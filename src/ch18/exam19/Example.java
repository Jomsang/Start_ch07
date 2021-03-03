package ch18.exam19;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Example {	//버퍼를 안 쓴거와 쓴거의 시간 비교 - 버퍼를 안쓰면 15초. 버퍼를 쓰면 4초만에 카피가 됨.

	public static void main(String[] args) throws Exception{
		String filePath = "C:/Ch07Start/ch07Start/src/ch18/exam19/data.txt";
		OutputStream os = new FileOutputStream(filePath);//이게 Writer였으면 밑에 PrintWriter만 와야 함
														//반대로 OutputStream이면 PrintStream,PrintWriter 둘 다 가능
		String data1 = "안녕하세요.";	
		String data2 = "이제 마쳐요.";
		
//		os.write(data1.getBytes());
//		os.write("\n".getBytes()); //개행 
//		os.write(data2.getBytes());
//		os.flush();
//		
//		os.close();
		
		
		//위 보다는 밑에가 더 간결하고 자주 사용
		PrintWriter out = new PrintWriter(os);//PrintStream을 써도 가능 
		out.println(3);//기본 타입, 문자열 다 올 수 있음(오버로딩) - 저장이 될 때 어떤 타입이든 ★★문자열로 저장이 됨.
		out.println(data2);								//이전 스트림 이런거는 바이트로 저장이 됨.
		out.flush();
		out.close();
	}

}
