package ch15.exam2;

import java.util.ArrayList;		//������ �ٸ� ��ü���� �� ����Ʈ�� �� ���� ����
import java.util.List;			//�׷��� ���׸��� ���

public class Example {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();	//�ڿ� ���׸��� ���� ���� //new Vector<>�ε� ��ü ����.
		List<Integer> list1 = new ArrayList<Integer>();	//�̱� ������ ȯ�濡���� ArrayList�� ����ؾ� �ϴ°� ���� ����
		//��ü ����										//��Ƽ ������ ȯ�濡���� ArrayList ���� Vector�� ����ؾ� �������� ���� ����.
														//LinkedList�� arraylist���� ��ü�� �����ɽ� ����(�ε���)�� ���ܿ��µ� �� �������� ���� ����� ������ 
		list.add(new Board(1, "����1"));					//�����Ͱ� ����, �߰��� ��ü�� ���÷� �����ϰ� ���� �ִ� �۾��� ���� ��쿡 LinkedList �� ���
		list.add(new Board(2, "����2"));
		list.add(new Board(3, "����3"));
		
		list1.add(3);	
		list1.add(5); 
		list1.add(7);
		System.out.println(list.size());
		System.out.println(list1.size());
		
		
	
		
		//��ü ���
		
		
		
		Board board1 = list.get(0);
		System.out.println(board1.getBno() + " : " + board1.getTitle());
		Board board2 = list.get(1); 
		Board board3 = list.get(2);
		
		
		//�ݺ� ó�� - �ε����� ����ؼ� ó���ؾ� �� ���� �̰Ÿ� ��� ��.
		for(int i = 0; i <list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getBno() + " : " + board.getTitle());
		}
		//-----------�� ���� ���
		for(Board board : list) {	//Iterable�� �����ϴ� ��ü�� �� ���� ������ �ü� ����.
			System.out.println(board.getBno() + " : " + board.getTitle());
		}
		
		
		
		
		
		int iin1 = list1.get(0);
		int iin2 = list1.get(1);
		int iin3 = list1.get(2);
		System.out.println(list1.get(0));
		//----------------------------�̷��� ���
		
		//----------------------------- List �������̽��� �����ϴ� ArrayList,Vector,LinkedList�� ��� ����� �޶�����,
	}

}
