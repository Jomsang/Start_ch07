package ch07Start.exam07;

public class Example {

	public static void main(String[] args) {
		Child child = new Child();	//객체 생성수 번지를 child 변수에 리턴해줌
		child.method1();
		child.method2();
		child.method3();
		
		//Parent parent = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();// ***이 부분이 가장 중요
		//parent.method3(); child번지이지만, 데이터 타입은 Parent이기 떼문에 
	}

}
