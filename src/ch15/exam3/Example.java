package ch15.exam3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("ȫ�浿");
		set.add("���ڹ�");
		set.add("ȫ�浿");
		set.add("�ܿ���");
		System.out.println(set.size());	//ȫ�浿�� 2������ �ϳ��� ���ٴ� ���(Set�� Ư¡(�ߺ�x))
		
		//for(String item : set) {
	//		System.out.println(item);	//��������� ���þ��� ��� ��.
	//	}
		
		
		//Iterator<E>��� �ݺ���
		Iterator<String> iterator = set.iterator(); // set�� �� �����ؼ� �װ͸� ������! �� �� �� ����.,
		while(iterator.hasNext()) {//set���� �����ð� �ִµ��� true (set���� �����°� �ƴ�) - ���� ���� �� ���� ������ ������.
				String item = iterator.next();
				System.out.println(item);
			}
		//System.out.println(iterator.next());	
		
		
	}

}
