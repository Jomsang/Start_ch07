package ch18.exam15;

import java.io.File;

public class Example {

	public static void main(String[] args) throws Exception{
		File file = new File("C:/Temp/dir1");
		if(file.isDirectory()) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		//UTF-8 ���� �ѱ� �� ���ڴ� 3����Ʈ
		
		
		file = new File("C:/Temp/data.txt");
		if(file.isFile()) {
			long size = file.length(); //ū �����ϼ��� �ֱ� ������ long Ÿ�Կ� ����
			System.out.println(size+"bytes"); // 8�� ��µǾ���
		}
		
	} 

}
