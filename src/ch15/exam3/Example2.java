package ch15.exam3;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		
		Set<User> set = new HashSet<>();
		
		User user1 = new User("winter", "한겨울");
		User user2 = new User("winter", "한겨울");
		set.add(user1);
		set.add(user2);
		System.out.println(user1.hashCode() == user2.hashCode());//객체는 고유식별번호가 있음. 고유식별번호가 같은지 hashcode로 사용
		System.out.println(user1.equals(user2));				//Object 갖고 있는 equals는 ==과 같음 //hashcode를 통해서 둘다 같지 않음이 나옴
		System.out.println(set.size());	
	}			//hashcode도 Object의 메소드이기 때문에 같게하려면 재정의를 해야 함.(최종적으로 재정의 함) 재정의 전에 size에는 2로 나왓는데 동등하게 하기 위해 재정의 한 후에는 1로 나옴

}
