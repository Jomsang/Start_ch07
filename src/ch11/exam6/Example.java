package ch11.exam6;

import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		// ��ȭ��ȣ üũ
		String regExp = "010-\\d{3,4}-\\d{4}";	//�׻� 010- ���� �����Ѵ�
									// \\2�� �־���� ��
		String data = "010-234-1234";
		
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("��ȿ�� ������");
		}else {
			System.out.println("�߸��� ������");
		}
		
		
		
		String regExp2 = ".*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*";
		String password = "a#123456789";	//12345 �ϸ� ����, JAVA�� �� ������ 2�� �־��� \\
		boolean result2 = Pattern.matches(regExp2, password);
		System.out.println(result2);
		
	}

}
