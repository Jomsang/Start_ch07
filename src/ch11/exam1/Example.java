package ch11.exam1;

public class Example {

	public static void main(String[] args) {
		Member m1 = new Member("Winter", "�ʰܿ�");
		Member m2 = new Member("spring", "�ʰܿ�");
		Member2 m3 = new Member2("Winter", "�ʰܿ�");
		System.out.println(m1 == m2); //���� �ٸ� ��ü���� false�� ����
		System.out.println(m1.equals(m2)); //false�� ���� ��ü�� ���� �ִ� equals�� == �� ����.
		//���� ���ϰ� �ϱ� �Ȱ� ������ ���� ������ true�� ����� ������ equlas�� ������ �ؾ� ��.
		
		System.out.println(m1.equals(m3));
	}

}
