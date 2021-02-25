package ch11.exam2;
import java.util.*;
public class Example {

	public static void main(String[] args) {
		Object var1 = new Object();
		System.out.println(var1.toString());//java.lang.Object@15db9742가 출력되는데
											//거의 이 정보를 쓰지 않음 메모리 번지를 출력 함.
		
		Date now = new Date();
		System.out.println(now.toString()); //현재 시간이 출력됨.
		
		String var3 = "abc";
		System.out.println(var3.toString());// abc가 출력
		
		Member var4 = new Member("Winter", "늦겨울");
		System.out.println(var4.toString()); // 재정의 하지 않았기때문에 메모리 번지가 나타남.
		//재정의 한 후에는 "Winter", "늦겨울"이 나옴.
		
		System.out.println(var4);//println 메소드로 인스ㅡ턴스 변수만 출력하면 자동으로 그 객체의
		//tostring을 출력함
		
		
		String result = var4 + " => spring: 봄들이";
		System.out.println(result);
		// var4.tostring이 생략되어있음, 그래서  "=> spring:" 봄들이 와 문자열 결합이 가능
		
		
		//---------------각 클래스 별로 tostring을 성격에 맞게 재정의 한 거임
		
		//객체 복제 clone, 소멸자 finilize, objects, 동등비교등 위에서 안 한거는 다생략
		
		//comparator,hashcode는 컬렉션에서 함.
	}

}
