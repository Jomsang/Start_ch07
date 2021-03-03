package ch15.exam4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		Map<User, Board> map = new HashMap<>();
		
		map.put(new User("winter", "겨울비"), new Board(1, "겨울비"));
		map.put(new User("winter", "봄들이"), new Board(2, "입춘"));
		System.out.println(map.size()); // User의 해시코드를 재정의 했기 때문에(id를 같다고 했음) size가 1이 나옴(동등 객체로 판단)
		
		Board board = map.get(new User("winter", null));	//
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
	}

}
