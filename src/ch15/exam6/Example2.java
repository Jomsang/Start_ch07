package ch15.exam6;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();// 

		map.put("s1", "�ڱ��");
		map.put("s3", "ȫ�浿");
		map.put("s4", "���ڹ�");
		map.put("s2", "������");
		map.put("s5", "�����̳�");
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " : "+ map.get(key)); // �ڵ����� ������������ Ű ���� ���� ��(TreeMap ���)
		}
		
		System.out.println();
		
		
		keys = map.descendingKeySet(); // �������� �޼ҵ�
		for(String key : keys) {
			System.out.println(key + " : "+ map.get(key)); 
		}
		
		System.out.println();
		//subMap - NavigableMap �������̽��� �ִ� �޼ҵ�, Map�� �����ϰ� �ֱ� ������ Map���ε� ����.
		Map <String, String> smap = map.subMap("s3", true, "s5", true); //Map���� subMap, Set�� subSet
											//s3, s4, s5�� ��� ��.
		keys = smap.keySet();
	
		for(String key : keys) {
			System.out.println(key + " : "+ smap.get(key)); 
		}
	}
}