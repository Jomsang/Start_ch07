package ch15.exam3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("홍길동");
		set.add("김자바");
		set.add("홍길동");
		set.add("겨울이");
		System.out.println(set.size());	//홍길동이 2개여서 하나는 없다는 취급(Set의 특징(중복x))
		
		//for(String item : set) {
	//		System.out.println(item);	//저장순서와 관련없이 출력 됨.
	//	}
		
		
		//Iterator<E>라는 반복자
		Iterator<String> iterator = set.iterator(); // set은 딱 지정해서 그것만 가져와! 라 할 수 없음.,
		while(iterator.hasNext()) {//set에서 가져올게 있는동안 true (set에서 빠지는게 아님) - 값이 없을 때 까지 값들을 가져옴.
				String item = iterator.next();
				System.out.println(item);
			}
		//System.out.println(iterator.next());	
		
		
	}

}
