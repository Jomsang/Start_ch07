package ch07Start.exam07;

public class Child extends Parent{ 	//객체가 만들어질때는 필드와 메소드만 존재
	//필드
	
	//생성자
	@Override
	public void method2() {
		System.out.println("Child : method2 호출");
	}
	
	public void method3() {
		System.out.println("Child : method3 호출");
	}
	
}
