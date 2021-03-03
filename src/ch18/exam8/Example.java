package ch18.exam8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Example {
	
	public static void main(String[] args) {
		String filePath = "C:/Ch07Start/ch07Start/src/ch18/exam8/data.txt";
		try {	//���ڱ�� �ֻ��� �߻�Ŭ�����̱� ������ ����� �ڽ�Ŭ������ ��ü ���� �ؾ� ��. 
			

			Reader reader = new FileReader(filePath);//�ü���� �⺻ ����set�� ����
			

			
			char[] data = new char[2]; //�ִ� 2���ڱ��� ���� �� ����.(������ ũ�Ⱑ Ŭ ��� �迭 ũ�⸦ ���� ��Ű��.)
			int readNum = -1;	//	���� ���� ��
			String str = "";
			while((readNum = reader.read(data))!= -1) { 
				str += new String(data, 0, readNum);//0, readNum �� �κ��� C�� ������ �ϴ� �κ�	
													//(0���� 2������ ����ε�, -1�� ������ ����?????)
//				System.out.println(Arrays.toString(data)); //C�� �߰������Ƿ� C ���� B, ���� ���� ���Ƽ� ����. 
			}
			System.out.println(str);
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
