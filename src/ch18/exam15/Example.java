package ch18.exam15;

import java.io.File;

public class Example {

	public static void main(String[] args) throws Exception{
		File file = new File("C:/Temp/dir1");
		if(file.isDirectory()) {
			System.out.println("폴더");
		}else {
			System.out.println("파일");
		}
		//UTF-8 에서 한글 한 글자는 3바이트
		
		
		file = new File("C:/Temp/data.txt");
		if(file.isFile()) {
			long size = file.length(); //큰 파일일수도 있기 때문에 long 타입에 담음
			System.out.println(size+"bytes"); // 8이 출력되야함
		}
		
	} 

}
