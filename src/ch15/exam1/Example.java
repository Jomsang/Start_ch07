package ch15.exam1;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		//��ü ����
		list.add("ȫ�浿");	//0 �ε��� 
		list.add(3); // WrapperŬ������ Integer ��ü�� ����ڽ��� �Ǽ� ������ �����. //1 �ε���
		list.add(new Board());// 2 �ε���
		System.out.println(list.size());//����Ǿ� �ִ� ��ü�� ����� - 3�� ����
		
		
		//��ü ����
		list.remove(0); // ȫ�浿 ��ü�� ����.
		list.remove(0); // �÷����� �����Ǹ� �� �ε����� ���� ���� ������ "ȫ�浿" ���� 3 �� 0�ε����� �Ǳ� ������ 3�� ������.
		System.out.println(list.size());//1�� ����
		
	//-------------------------------------------------------	
		
		//��ü ���
		
		list.add("ȫ�浿");	 
		list.add(3); 
		list.add(new Board());
		
		String name = (String)list.get(0); //Object Ÿ���ε� String���� ��ȯ �Ҽ� ����, �׷��� ����Ÿ�Ժ�ȯ�� �ؾ���.
		int value = (Integer) list.get(1); // ���� ��ڽ�
		Board board = (Board) list.get(2);
		//----------------------------��ü ������ �̷��� �� ��.
		
	}

}
