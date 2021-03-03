package ch15.exam4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		//Map 생성
		Map<String, String> map = new HashMap();// 모든 타입이 키나 밸류로 올 수 이씀 하지만 이럴 일이 없으니 "제네릭"으로 타입을 정해줌.
		
		//Entry 생성
		map.put("s1", "홍길동");
		map.put("s2", "김자바");
		map.put("s3", "개발자");	//키 값을 같은것을 주면 set처럼 중복 취급하고 1개만 있는걸로 취급
		System.out.println(map.size());
		
		//KEY의 값 가져오기
		String s1 = map.get("s1");
		System.out.println(s1);
		
		//반복 처리
		//값 얻는 방법 1 : entrySet
		//방법 2 : keySet
		
		//for(Entry a : map) - Map 인터페이스는 Iterable 인터페이스를 구현하지 않기 때문에 향상된 for문 사용 못함. 그래서 방법1,2 를 사용
		//방법 1 entryset(키,밸류 를 사용)
		Set<Entry<String, String>> set = map.entrySet(); //Map안의 엔트리를 Set으로 변환. (그러면 Iterable을 사용 가능.)
		for(Entry<String, String> entry : set) {
			System.out.print("Key " + entry.getKey() + ": "+ entry.getValue());	//Set의 특징으로 인해 순서와 무관하게 나타남
		
		}
		System.out.println();
		//방법 2 keyset(키로만 사용)
		Set<String> set2 = map.keySet();
		for(String key : set2) {
			String value = map.get(key);
			System.out.print("Key " + key + ": "+ value);	
		}
		map.remove("s1"); // 특정 키 값을 지정해서 삭제
		map.clear();//전체삭제
		
	}

}
