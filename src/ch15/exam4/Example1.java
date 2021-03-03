package ch15.exam4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		//Map ����
		Map<String, String> map = new HashMap();// ��� Ÿ���� Ű�� ����� �� �� �̾� ������ �̷� ���� ������ "���׸�"���� Ÿ���� ������.
		
		//Entry ����
		map.put("s1", "ȫ�浿");
		map.put("s2", "���ڹ�");
		map.put("s3", "������");	//Ű ���� �������� �ָ� setó�� �ߺ� ����ϰ� 1���� �ִ°ɷ� ���
		System.out.println(map.size());
		
		//KEY�� �� ��������
		String s1 = map.get("s1");
		System.out.println(s1);
		
		//�ݺ� ó��
		//�� ��� ��� 1 : entrySet
		//��� 2 : keySet
		
		//for(Entry a : map) - Map �������̽��� Iterable �������̽��� �������� �ʱ� ������ ���� for�� ��� ����. �׷��� ���1,2 �� ���
		//��� 1 entryset(Ű,��� �� ���)
		Set<Entry<String, String>> set = map.entrySet(); //Map���� ��Ʈ���� Set���� ��ȯ. (�׷��� Iterable�� ��� ����.)
		for(Entry<String, String> entry : set) {
			System.out.print("Key " + entry.getKey() + ": "+ entry.getValue());	//Set�� Ư¡���� ���� ������ �����ϰ� ��Ÿ��
		
		}
		System.out.println();
		//��� 2 keyset(Ű�θ� ���)
		Set<String> set2 = map.keySet();
		for(String key : set2) {
			String value = map.get(key);
			System.out.print("Key " + key + ": "+ value);	
		}
		map.remove("s1"); // Ư�� Ű ���� �����ؼ� ����
		map.clear();//��ü����
		
	}

}
