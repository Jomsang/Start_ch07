package ch15.exam6;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();//���� �տ� Set�� �ְ� �ߴµ� TreeSet����� �� ���� - Set�� �Z���� Set�� �������̽��� ����� �����ؼ� TreeSet�� ����� ����, 
												//�˻������ ���� �޼ҵ�� TreeSet���� �ֱ� ������!
		set.add("ȫ�浿");
		set.add("���ڹ�");
		set.add("�浹��");
		set.add("�ڱ��");
		
		
		for(String item : set) { //���� ������ ����. - �����ϴ� ���� ��Ҹ� ��(������ ����, ū�� ������) - ��������
			System.out.println(item);
		}
		//descendingSet() ������������ �����ϰ� ���� ��
		
		System.out.println();
		
		NavigableSet<String> nset = set.descendingSet(); //descendingSet()�� TreeSet���� ����
		
		for(String item : nset) { 
			System.out.println(item);
		
		}
		System.out.println();
		NavigableSet<String> sset = set.subSet("��", false, "��", false); // ������ �� ���� ���� ���� ���ϰ�, �浵 ���� ���� 
																//�׷��� ����� ���ڹ�,�ڱ���� ����
		for(String item : sset) { 
			System.out.println(item);
		
		}
		//Ʈ���� - �����ϰ� ���� ��, subset���� ���� ������ �����ؼ� ���� ���� �� ���

	}
}