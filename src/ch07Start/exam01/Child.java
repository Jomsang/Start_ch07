package ch07Start.exam01;

public class Child extends Parent{ 	//객체가 만들어질때는 필드와 메소드만 존재
	//필드
	public int field2;
	//생성자
	public Child() {
		System.out.println("child 객체 생성");
	}
	//메소드
	public void method2() {
		System.out.println("method2 실행");
	}
}
