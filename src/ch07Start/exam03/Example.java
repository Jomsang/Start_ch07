package ch07Start.exam03;

public class Example {

	public static void main(String[] args) {
		Child child = new Child("길동");	//객체 생성수 번지를 child 변수에 리턴해줌
		System.out.println(child.firstname);
		System.out.println(child.lastname);
		child.sound();
		child.method2();
	}

}
