package ch10.exam1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {

	public static void main(String[] args) throws FileNotFoundException  {
		int[] arr = null;
		arr[0] = 10; //unchecked ���� - NullPointerException �߻�
		//�����Ϸ��� üũ���� ����
		
		
		
		FileInputStream fi = new FileInputStream("C: /Temp/file.txt");
		//�����Ϸ��� üũ �� (���ܸ� ������, ���� ó���� ����� ��)		
	}

}
