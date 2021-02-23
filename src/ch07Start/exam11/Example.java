package ch07Start.exam11;

public class Example {

	public static void main(String[] args) {
		// Animal animal = new Animal();   오류. 추상클래스는 객체 생성 못함. 공통적인 것만 들어가 있음
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();

		animal1.eat();
		animal1.sleep();
		animal1.sound();
		
		animal2.eat();
		animal2.sleep();
		animal2.sound();
		
	}

}
