package ch07Start.exam10;

public class Example {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		if(parent instanceof Child) { //�θ� -> �ڽ� ���� ����ȯ �� �̷��� ����
			Child child = (Child)parent;
			child.field2 = 10; 
			parent.method2();
			child.method2();
		}else {
			parent.method2();
		}
		//---------------------------------���� else�� �Ѿ
		Parent parent2 = new Child();
		parent2.method2();
		Child child2 = (Child)parent2;
		child2.method1(); //��������ȯ�� �����ؼ� Child��ü�� method1 ��� ����
	
		
		
		/*
		Child child = (child) parent;
		child.field1 = 5;
		child.method1();
		child.method1();
		child.field2;
		child.method3;
		*/ // �ʱ��ϴٰ� �� ���� ��ǿ��� ���� ���� Ÿ�� ��ȯ�� �ڽ� ��ü ���� �� ���� ����� ����Ÿ�Ժ�ȯ �����ϴٴ� �Ҹ�  (Child�� Parent �� ����� ��)
	}

}
