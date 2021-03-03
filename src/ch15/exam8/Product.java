package ch15.exam8;

public class Product {
	public String name;
	public int price;
	
	public Product(String name, int price) {	//사용자 정의 클래스는 비교기능이 없기 때문에 지정해줘야하는 기능이 있음
		this.name = name;
		this.price = price;
	}
}
// comparable과 comparator 차이점 공부하기!!