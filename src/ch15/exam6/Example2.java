package ch15.exam6;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();// 

		map.put("s1", "박길순");
		map.put("s3", "홍길동");
		map.put("s4", "김자바");
		map.put("s2", "개발자");
		map.put("s5", "디자이너");
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " : "+ map.get(key)); // 자동으로 오름차순으로 키 값이 정렬 됨(TreeMap 기능)
		}
		
		System.out.println();
		
		
		keys = map.descendingKeySet(); // 내림차순 메소드
		for(String key : keys) {
			System.out.println(key + " : "+ map.get(key)); 
		}
		
		System.out.println();
		//subMap - NavigableMap 인터페이스에 있는 메소드, Map이 구현하고 있기 때문에 Map으로도 가능.
		Map <String, String> smap = map.subMap("s3", true, "s5", true); //Map에는 subMap, Set은 subSet
											//s3, s4, s5가 출력 됨.
		keys = smap.keySet();
	
		for(String key : keys) {
			System.out.println(key + " : "+ smap.get(key)); 
		}
	}
}