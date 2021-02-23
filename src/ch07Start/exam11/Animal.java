package ch07Start.exam11;

public abstract class Animal {	//추상클래스로 객체를 만들수 없음., 자식 클래스마다 공통된 부분이 있으면 abstract를 붙임.
								//추상 클래스여야만 추상 메소드를 가질 수 있음.(*무조건 상속을 통해서만 사용 가능.)
	public String name;
	public String kind;
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	public void eat() {
		System.out.println("먹습니다.");
	}
	
	public abstract void sound(); 	//소리는 내는데 고양이와 개의 짖는 소리가 다르기때문에 여기서 결정이 어려워서 추상으로 선언
									//여기서 결정이 어려워서 추상으로 선언하고 자식 클래스들에서 재정의 해야함
									//정의 안하면 컴파일 에러남.
	
	
}
