package ch11.exam1;

public class Example {

	public static void main(String[] args) {
		Member m1 = new Member("Winter", "늦겨울");
		Member m2 = new Member("spring", "늦겨울");
		Member2 m3 = new Member2("Winter", "늦겨울");
		System.out.println(m1 == m2); //서로 다른 객체여서 false가 나옴
		System.out.println(m1.equals(m2)); //false가 나옴 객체가 갖고 있는 equals는 == 과 같음.
		//번지 비교하게 하기 싫고 데이터 값이 같으면 true로 만들고 싶으면 equlas를 재정의 해야 함.
		
		System.out.println(m1.equals(m3));
	}

}
