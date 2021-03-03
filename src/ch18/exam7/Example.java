package ch18.exam7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example {
	
	public static void main(String[] args) {
		String filePath = "C:/Ch07Start/ch07Start/src/ch18/exam7/data.txt";
		try {	//���ڱ�� �ֻ��� �߻�Ŭ�����̱� ������ ����� �ڽ�Ŭ������ ��ü ���� �ؾ� ��. 
			
//			
//			FileInputStream fis = new FileInputStream(filePath); //�ü���� �⺻ ����set�� ���� ������ �ѱ� ������ ���ڼ� ms 949���� utf8�� �ٲٸ� ? ����
//			Reader reader = new InputStreamReader(fis, "UTF-8");//�ѱ��� 3����Ʈ�� �о����, �׷��� ?�� �� ���� ��
			
			Reader reader = new FileReader(filePath);//�ü���� �⺻ ����set�� ����
			
			
//			while(true) { -- ��� 1
//				int charCode = reader.read();	//�б� ������ ���� �� IOException �߻�
//				char charData = (char) charCode;
//				if(charCode == -1) {
//					break;
//				}
//				System.out.println(charCode +" : "+charData);
//			}

			
			
			int charCode = -1;	//	��� 2 --
			while((charCode = reader.read())!= -1) { //�� ���ڸ� �б� ������ ������ ũ�� Ŭ ���� �б� ������ ������
				char charData = (char) charCode;	//, �� ����� �� ��� ��. �׷��� �迭�� �д� ���� ����
				System.out.println(charCode +" : "+charData);
			}
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
