package ch15.exam3;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		
		Set<User> set = new HashSet<>();
		
		User user1 = new User("winter", "�Ѱܿ�");
		User user2 = new User("winter", "�Ѱܿ�");
		set.add(user1);
		set.add(user2);
		System.out.println(user1.hashCode() == user2.hashCode());//��ü�� �����ĺ���ȣ�� ����. �����ĺ���ȣ�� ������ hashcode�� ���
		System.out.println(user1.equals(user2));				//Object ���� �ִ� equals�� ==�� ���� //hashcode�� ���ؼ� �Ѵ� ���� ������ ����
		System.out.println(set.size());	
	}			//hashcode�� Object�� �޼ҵ��̱� ������ �����Ϸ��� �����Ǹ� �ؾ� ��.(���������� ������ ��) ������ ���� size���� 2�� ���Ӵµ� �����ϰ� �ϱ� ���� ������ �� �Ŀ��� 1�� ����

}
