package ch18.exam15;

import java.io.File;

public class Example2 {

	public static void main(String[] args) throws Exception{
		File file = new File("C:/Temp/data.txt");
		if(!file.exists()) {
			file.createNewFile();	//�� ���� ����, ������ ��½�Ʈ�������� ������ ���� �־�� ��
		}
		
		file = new File("C:/Temp/dir1/dir2/dir3");
		if(!file.exists()) {
			//file.mkdir();	//���͸� ����
			file.mkdirs();
		}
		file = new File("C:/Temp/data.txt");
		if(file.exists()) {
			//file.mkdir();	//���͸� ����
			file.delete();
		}
		file = new File("C:/Temp/dir1/dir2/dir3");//�� �������� dir3�� ����
		if(file.exists()) {
			//file.mkdir();	//���͸� ����
			file.delete();
		}
	} 

}
