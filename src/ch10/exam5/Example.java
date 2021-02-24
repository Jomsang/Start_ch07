package ch10.exam5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {

	public static void main(String[] args)   {
		try {
			method("C:/file.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않음");
		}
		//만약 static을 안 붙이면
		// Example e = new Example();
		//e.method(); 로 실행해야 함.

		
	}
	public static void method(String filePath) throws FileNotFoundException  {	//객체가 없어도 실행 가능하게 하기위해 static을 붙임
									
		
			FileInputStream fis = new FileInputStream(filePath);
	
	}
}
