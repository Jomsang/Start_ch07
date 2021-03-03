package ch15.exam7;

public class Person implements Comparable {	//엔트리나 값을 객체별로 비교하고 싶으면 구현하고 재정의 해야 함.
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) { //당연히 Person이 들어온다는 가정
		Person temp = (Person) o;
		if(age < temp.age) {
			return -1;
		}
		else if(age == temp.age) {
			return 0;
		}
		else {
			return 1;				//숫자가 중요한게 아니라 부호가 중요!
		}
		
	}
}
