package ch07Start.exam01;

public class Example {

	public static void main(String[] args) {
		Child child = new Child();	//객체 생성수 번지를 child 변수에 리턴해줌
		child.field1 = 10;
		child.field2 = 20;
		child.method1();
		child.method2();
	}

}
