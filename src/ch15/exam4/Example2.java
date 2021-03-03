package ch15.exam4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		Map<User, Board> map = new HashMap<>();
		
		map.put(new User("winter", "�ܿ��"), new Board(1, "�ܿ��"));
		map.put(new User("winter", "������"), new Board(2, "����"));
		System.out.println(map.size()); // User�� �ؽ��ڵ带 ������ �߱� ������(id�� ���ٰ� ����) size�� 1�� ����(���� ��ü�� �Ǵ�)
		
		Board board = map.get(new User("winter", null));	//
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
	}

}
