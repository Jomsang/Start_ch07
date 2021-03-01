package ch11.exam7;

public class Example3 {

	public static void main(String[] args) {
//		Integer var1 = new Integer(500);
//		Integer var2 = new Integer(500);
		
//		System.out.println(var1 == var2);	//false가 나옴 (번지가 다르기 때문)
//		System.out.println(var1.equals(var2));// true 값만 비교
// -----------------------------------------------------------------------		
//		Integer var1 = 500;
//		Integer var2 = 500;
//		
//		System.out.println(var1 == var2);	//false (자동 박싱 됨)
//		System.out.println(var1.equals(var2));// true 값만 비교
		
		Integer var1 = 128;
		Integer var2 = 128;
		
		System.out.println(var1 == var2);	//true -128 ~ 127 범위를 가질 때는 같은 객체를 참조한다.
		System.out.println(var1.equals(var2));// true 값만 비교, **결국 포장된 값을 비교할 때는 꼭 equals만 사용해라!++
		//Math.pow, Math.random
	}

}
