package ch18.exam14;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		try {
			String filePath = "C:\\Ch07Start\\ch07Start\\src\\ch18\\exam14\\data.txt.java";
			InputStream is = new FileInputStream(filePath);
			Scanner input = new Scanner(is);//파일에 있는 내용을 읽게됨
			int count = 1;
			
			while(true) {
				try {
					
					String data = input.nextLine(); // nextLine은 한 줄마다 입력
					System.out.println(count+": "+data);	//라인번호 출력
					count++;
					
				}catch(NoSuchElementException e) {
					break;
				}
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}

	} 

}
