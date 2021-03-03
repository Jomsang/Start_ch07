package ch18.exam15;

import java.io.File;

public class Example2 {

	public static void main(String[] args) throws Exception{
		File file = new File("C:/Temp/data.txt");
		if(!file.exists()) {
			file.createNewFile();	//빈 파일 생성, 내용은 출력스트림가지고 내용을 집어 넣어야 함
		}
		
		file = new File("C:/Temp/dir1/dir2/dir3");
		if(!file.exists()) {
			//file.mkdir();	//디렉터리 생성
			file.mkdirs();
		}
		file = new File("C:/Temp/data.txt");
		if(file.exists()) {
			//file.mkdir();	//디렉터리 생성
			file.delete();
		}
		file = new File("C:/Temp/dir1/dir2/dir3");//맨 마지막인 dir3이 삭제
		if(file.exists()) {
			//file.mkdir();	//디렉터리 생성
			file.delete();
		}
	} 

}
