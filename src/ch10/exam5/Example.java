package ch10.exam5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {

	public static void main(String[] args)   {
		try {
			method("C:/file.txt");
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� ����");
		}
		//���� static�� �� ���̸�
		// Example e = new Example();
		//e.method(); �� �����ؾ� ��.

		
	}
	public static void method(String filePath) throws FileNotFoundException  {	//��ü�� ��� ���� �����ϰ� �ϱ����� static�� ����
									
		
			FileInputStream fis = new FileInputStream(filePath);
	
	}
}
