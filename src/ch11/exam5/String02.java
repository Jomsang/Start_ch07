package ch11.exam5;

import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {
		
		String ssn = "123456-1234567";
		
		//� ��ġ�� ���� 1���� ���
		char sex = ssn.charAt(7);
		if(sex == '1' || sex == '3') {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
		
		//���ڿ� �߶󳻱� : ��� 1 
		String first = ssn.substring(0, 6);// �ε��� 0���� 6�� ������ ����
		String second = ssn.substring(0, 7);// �ε��� 0���� 7�� ������ ����
		System.out.println(first);
		System.out.println(second);
		
		
		//���ڿ� �߶󳻱� : ��� 2
		String[] parts = ssn.split("-"); // 
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		//���ڿ� �и��ϱ� : ��� 3 // �߿���1!!!! //�߶󳻱� ���ٴ� �и��ϱⰡ ����.
		StringTokenizer st = new StringTokenizer(ssn, "-");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		/*first = st.nextToken();
		second = st.nextToken();*/
	
		//String third = st.nextToken();//������ �� Ȯ���غ���
		
		
		
		//���� ���� : ��� 1
		String title = "�̰��� �ڹ� å�Դϴ�.";	//12�� ������ ����
		boolean result = title.contains("�ڹ�");
		System.out.println(result);
		
		//���� ���� : ��� 2 //�� �߿��ϴ� �˾� ��
		int index = title.indexOf("�ڹ�");//�� ���ڿ��� �����ϴ� index��ȣ�� return ����.(4�� ����.)
		if(index != -1) {	//indexOf(String st)�� ���� ���ڿ��� �� �ÿ��� -1�� �������� �� if������ �ִ� ���ڿ��� ��� ��

		}
		else {

		}
		
		//���ڿ��� ����
		int length = title.length();
		System.out.println(length);
		
		//��ġ�ϱ�
		String modifiedContent = title.replace("�ڹ�", "Java"); //**���ڿ��� �Һ��� ��Ģ��. ���� title�� "�ڹ�"�� �ֱ� ������ 
		System.out.println(modifiedContent);			//���ο� ������ �������ְ� replace�� �ؾ� ��ġ�� modifiedContent ���ڿ� ��� ����.
		
		
		
	}

}
