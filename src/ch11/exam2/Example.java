package ch11.exam2;
import java.util.*;
public class Example {

	public static void main(String[] args) {
		Object var1 = new Object();
		System.out.println(var1.toString());//java.lang.Object@15db9742�� ��µǴµ�
											//���� �� ������ ���� ���� �޸� ������ ��� ��.
		
		Date now = new Date();
		System.out.println(now.toString()); //���� �ð��� ��µ�.
		
		String var3 = "abc";
		System.out.println(var3.toString());// abc�� ���
		
		Member var4 = new Member("Winter", "�ʰܿ�");
		System.out.println(var4.toString()); // ������ ���� �ʾұ⶧���� �޸� ������ ��Ÿ��.
		//������ �� �Ŀ��� "Winter", "�ʰܿ�"�� ����.
		
		System.out.println(var4);//println �޼ҵ�� �ν����Ͻ� ������ ����ϸ� �ڵ����� �� ��ü��
		//tostring�� �����
		
		
		String result = var4 + " => spring: ������";
		System.out.println(result);
		// var4.tostring�� �����Ǿ�����, �׷���  "=> spring:" ������ �� ���ڿ� ������ ����
		
		
		//---------------�� Ŭ���� ���� tostring�� ���ݿ� �°� ������ �� ����
		
		//��ü ���� clone, �Ҹ��� finilize, objects, ����񱳵� ������ �� �ѰŴ� �ٻ���
		
		//comparator,hashcode�� �÷��ǿ��� ��.
	}

}
