package ch18.exam2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		String filePath1 = "C:/Ch07Start/ch07Start/src/ch18/exam2/data.txt";
		try {
			InputStream is = new FileInputStream(filePath1);
			
			byte[] data = new byte[1024]; // �� �� ������ 1024����Ʈ���� ����
			
//			while(true) {
//			int readNum = is.read(data);
//			if(readNum == -1) {
//				break;
//			}
//			System.out.println(readNum + " : "+ Arrays.toString(data));
//
////			readNum = is.read(data);
////			System.out.println(readNum + " : "+ Arrays.toString(data));	//������ ���� 67�� ���� ����(���� �迭�� ���� ������)
////			
////			readNum = is.read(data);
////			System.out.println(readNum + " : "+ Arrays.toString(data));// -1�� ������ 68,69,67 �״�� ����
//			}
//			is.close();
			int readNum = -1;
			while((readNum = is.read(data)) != -1) {	//�ѹ��� �����ϰ� ����. data.txt�� 1024����Ʈ�� byteũ�⸦ 1024�� ��� ������ 1�� ����
				System.out.println(readNum + " : "+ Arrays.toString(data)); // ���� byteũ�⸦ 1�� �ָ� 1024�� ����(while��)
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
