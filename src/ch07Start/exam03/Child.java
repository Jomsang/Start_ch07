package ch07Start.exam03;

public class Child extends Parent{ 	//객체가 만들어질때는 필드와 메소드만 존재
	//필드
	public int field2;
	
	//생성자
	public Child(String firstname) {
		super("김", firstname); //super는 항상 첫줄에서 사용
		System.out.println("child 객체 생성");
	}
	//메소드
	public void method2() {
		System.out.println("method2 실행");
	}
	
	@Override				//어노테이션이라 말함
	public void sound() {
		
		System.out.println("씷어요!!!");
	}
}
