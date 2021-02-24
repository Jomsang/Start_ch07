package ch09.exam03;

public class A {					
	public void method(int x) { //final int x 인데 자바 8부터 생략 가능하게 함.
		int y = 2;
		
		//x = 10;  - 이렇게 주면 B의 method에 사용한 x 에서 에러 남(x를 받을때 final이 감춰져 있어서 한번 받으면 끝)
		// y = 20; 도 마찬가지 
		class B{
			public void method() {
				int result = x + y;
			}
		}
	}
}
