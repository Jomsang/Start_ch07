package ch11.exam5;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class String01 {
	public static void main(String[] args) throws UnsupportedEncodingException  {
		byte[] arr1 = {65, 66, 67};	//byte �迭�� �޾Ƽ� ���ڿ��� �����ϴ� ���� �������.(��Ʈ��ũ ��� �� ��.)
		//��Ʈ��ũ�� �����͸� ����Ʈ�� �ۼ����� ��.
		String str1 = new String(arr1);
		System.out.println(str1);	//ABC�� ��µ� ( 65�� A ���� SET�� ��ȣ��)

		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2));	//Arrays.toString - �迭�� �ִ� �׸��� �а� ���ڿ��� ����ϴ� �޼ҵ�

		
		//�����͸� �۽��� ��
		String str3 = "������";					
		byte[] arr31 = str3.getBytes("EUC-KR");// -80, -95�� �����ؼ� "��" �� �� (2 byte �� ����)
		byte[] arr32 = str3.getBytes("UTF-8");//-22, -80, -128�� �����ؼ� "��" �� ��(3 byte �� ����)
		//����� ������. // ���ͳݿ��� �Ϲ������� UTF-8�� ��
		// UTF-8�� ������ ���ڸ� ����, EUC-KR�� �ѱ���� ����, Ư�����ڸ� 

		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32));

		
		
		
		//�ް� ���� ����
		String str4 = new String(arr31, "EUC-KR");
		String str5 = new String(arr32, "UTF-8");
		
		
		System.out.println(str4);	//String(byte[] bytes, Charset charset)
		System.out.println(str5);	//String(byte[] bytes, String charsetName) �ΰ��� �Ἥ �ٽ� ��ȯ ����
		
		//��Ʈ��ũ ��� �� �� �̿� ���� ����ϸ� ��.

	}
}
