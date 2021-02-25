package ch11.exam5;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class String01 {
	public static void main(String[] args) throws UnsupportedEncodingException  {
		byte[] arr1 = {65, 66, 67};	//byte 배열을 받아서 문자열로 변경하는 일이 생길거임.(네트워크 통신 할 때.)
		//네트워크는 데이터를 바이트로 송수신을 함.
		String str1 = new String(arr1);
		System.out.println(str1);	//ABC가 출력됨 ( 65는 A 문자 SET의 번호임)

		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2));	//Arrays.toString - 배열에 있는 항목을 읽고 문자열로 출력하는 메소드

		
		//데이터를 송신할 때
		String str3 = "가나다";					
		byte[] arr31 = str3.getBytes("EUC-KR");// -80, -95가 결합해서 "가" 가 됨 (2 byte 로 구성)
		byte[] arr32 = str3.getBytes("UTF-8");//-22, -80, -128가 결합해서 "가" 가 됨(3 byte 로 구성)
		//만들기 나름임. // 인터넷에서 일반적으로 UTF-8를 씀
		// UTF-8은 전세계 문자를 지원, EUC-KR은 한국어랑 영어, 특수문자만 

		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32));

		
		
		
		//받고 복원 과정
		String str4 = new String(arr31, "EUC-KR");
		String str5 = new String(arr32, "UTF-8");
		
		
		System.out.println(str4);	//String(byte[] bytes, Charset charset)
		System.out.println(str5);	//String(byte[] bytes, String charsetName) 두개를 써서 다시 변환 가능
		
		//네트워크 통신 할 때 이와 같이 사용하면 됨.

	}
}
