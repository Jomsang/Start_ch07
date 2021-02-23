package ch07Start.exam03;

public class Parent {	//객체가 만들어질때는 필드와 메소드만 존재
	//필드
	public String lastname;
	public String firstname;
	//생성자
	public Parent(String lastname, String firstname) {
		System.out.println("Parent 객체 생성");
		this.lastname = lastname;
		this.firstname = firstname;
	}
	//메소드
	 void sound() {
		System.out.println("공부해라~~~");
	}
}
