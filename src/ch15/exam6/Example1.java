package ch15.exam6;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();//원래 앞에 Set을 주고 했는데 TreeSet인페로 한 이유 - Set을 줫으면 Set의 인터페이스만 사용이 가능해서 TreeSet의 기능은 못씀, 
												//검색기능을 위한 메소드는 TreeSet에만 있기 때문에!
		set.add("홍길동");
		set.add("김자바");
		set.add("방돌이");
		set.add("박길순");
		
		
		for(String item : set) { //사전 순으로 나옴. - 저장하는 순간 대소를 비교(적은건 왼쪽, 큰건 오른쪽) - 오름차순
			System.out.println(item);
		}
		//descendingSet() 내림차순으로 정렬하고 싶을 때
		
		System.out.println();
		
		NavigableSet<String> nset = set.descendingSet(); //descendingSet()은 TreeSet에만 있음
		
		for(String item : nset) { 
			System.out.println(item);
		
		}
		System.out.println();
		NavigableSet<String> sset = set.subSet("가", false, "방", false); // 가부터 방 까지 가를 포함 안하고, 방도 포함 안함 
																//그래서 출력은 김자바,박길순만 나옴
		for(String item : sset) { 
			System.out.println(item);
		
		}
		//트리셋 - 정렬하고 싶을 때, subset으로 값의 범위를 지정해서 얻어내고 싶을 때 사용

	}
}