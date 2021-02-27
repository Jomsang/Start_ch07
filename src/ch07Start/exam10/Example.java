package ch07Start.exam10;

public class Example {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		if(parent instanceof Child) { //부모 -> 자식 강제 형변환 때 이렇게 선언
			Child child = (Child)parent;
			child.field2 = 10; 
			parent.method2();
			child.method2();
		}else {
			parent.method2();
		}
		//---------------------------------위에 else로 넘어감
		Parent parent2 = new Child();
		parent2.method2();
		Child child2 = (Child)parent2;
		child2.method1(); //강제형변환에 성공해서 Child객체의 method1 사용 가능
	
		
		
		/*
		Child child = (child) parent;
		child.field1 = 5;
		child.method1();
		child.method1();
		child.field2;
		child.method3;
		*/ // 필기하다가 못 따라감 노션에서 보면 강제 타입 변환때 자식 객체 생성 후 대입 해줘야 강제타입변환 가능하다는 소리  (Child와 Parent 손 봐줘야 함)
	}

}
