package ch18.exam1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {
		String filePath = "C:/Ch07Start/ch07Start/src/ch18/exam1/data.txt";
		try {
			InputStream is = new FileInputStream(filePath); //FileInputStream - InputStream�� �ڽ� Ŭ������
			while(true) {
				int data = is.read();
				if(data == -1) {
					break;
				}
				System.out.println(data);
			}
			is.close(); //�ݾ���� �ٸ� ���α׷��� ��밡���ϰ� �ؾ���. �� �ϸ� �浹
			
////			int byte1 = is.read();	//������ ���� ������ ���� �� ������ ���� �� �Ҷ� IOException ���ܰ� ����. �׷��� ó��
////			int byte2 = is.read();
////			int byte3 = is.read();	//1 ����Ʈ�� ���� 
////			int byte4 = is.read();
////			System.out.println(byte1);
////			System.out.println(byte2);
////			System.out.println(byte3);		//���ڴ� Reader�� ����ϴµ� Stream�� �ϴ� ���� �����.
////			System.out.println(byte4);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		//��� 1-------------------------------------------------------------
		
		
		
		
		
		
		String filePath1 = "C:/Ch07Start/ch07Start/src/ch18/exam1/data.txt";
		try {
			InputStream is = new FileInputStream(filePath1); //FileInputStream - InputStream�� �ڽ� Ŭ������
			
			int data = -1;
			while((data = is.read()) != -1) {
			
				System.out.print(data);
			}
			is.close(); //�ݾ���� �ٸ� ���α׷��� ��밡���ϰ� �ؾ���. �� �ϸ� �浹
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		//��� 2-----------------------------------------------------------
	}

}
