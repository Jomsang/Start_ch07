package ch15.exam1;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		//객체 저장
		list.add("홍길동");	//0 인덱스 
		list.add(3); // Wrapper클래스인 Integer 객체로 오토박싱이 되서 번지가 저장됨. //1 인덱스
		list.add(new Board());// 2 인덱스
		System.out.println(list.size());//저장되어 있는 객체가 몇개인지 - 3이 나옴
		
		
		//객체 제거
		list.remove(0); // 홍길동 객체를 없앰.
		list.remove(0); // 컬렉션은 삭제되면 뒤 인덱스가 땡겨 오기 때문에 "홍길동" 다음 3 이 0인덱스가 되기 때문에 3도 삭제됨.
		System.out.println(list.size());//1이 나옴
		
	//-------------------------------------------------------	
		
		//객체 얻기
		
		list.add("홍길동");	 
		list.add(3); 
		list.add(new Board());
		
		String name = (String)list.get(0); //Object 타입인데 String으로 변환 할수 없다, 그래서 강제타입변환을 해야함.
		int value = (Integer) list.get(1); // 오토 언박싱
		Board board = (Board) list.get(2);
		//----------------------------객체 얻을때 이렇게 안 씀.
		
	}

}
