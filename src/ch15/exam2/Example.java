package ch15.exam2;

import java.util.ArrayList;		//종류가 다른 객체들을 한 리스트에 잘 넣지 않음
import java.util.List;			//그래서 제네릭을 사용

public class Example {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();	//뒤에 제네릭은 생략 가능 //new Vector<>로도 교체 가능.
		List<Integer> list1 = new ArrayList<Integer>();	//싱글 스레드 환경에서는 ArrayList를 사용해야 하는게 가장 좋음
		//객체 저장										//멀티 스레드 환경에서는 ArrayList 보다 Vector로 사용해야 안정성에 가장 좋음.
														//LinkedList는 arraylist에서 객체가 삭제될시 순서(인덱스)를 땡겨오는데 그 과정에서 많이 힘들기 때문에 
		list.add(new Board(1, "제목1"));					//데이터가 많고, 중간에 객체를 수시로 제거하고 집어 넣는 작업이 많을 경우에 LinkedList 를 사용
		list.add(new Board(2, "제목2"));
		list.add(new Board(3, "제목3"));
		
		list1.add(3);	
		list1.add(5); 
		list1.add(7);
		System.out.println(list.size());
		System.out.println(list1.size());
		
		
	
		
		//객체 얻기
		
		
		
		Board board1 = list.get(0);
		System.out.println(board1.getBno() + " : " + board1.getTitle());
		Board board2 = list.get(1); 
		Board board3 = list.get(2);
		
		
		//반복 처리 - 인덱스를 사용해서 처리해야 할 때는 이거를 써야 함.
		for(int i = 0; i <list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getBno() + " : " + board.getTitle());
		}
		//-----------더 쉬운 방법
		for(Board board : list) {	//Iterable를 구현하는 객체는 다 향상된 포문에 올수 있음.
			System.out.println(board.getBno() + " : " + board.getTitle());
		}
		
		
		
		
		
		int iin1 = list1.get(0);
		int iin2 = list1.get(1);
		int iin3 = list1.get(2);
		System.out.println(list1.get(0));
		//----------------------------이렇게 사용
		
		//----------------------------- List 인터페이스를 구현하는 ArrayList,Vector,LinkedList는 사용 방법이 달라진다,
	}

}
