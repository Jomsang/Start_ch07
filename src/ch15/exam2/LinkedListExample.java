package ch15.exam2;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		List<String> list1 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: "+ (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: "+ (endTime - startTime) + "ns");
	} // -- 링크드리스트가 훨씬 빠름 (웹에서 ArrayList를 거의 다 씀 (중간에 삭제하고 추가할 일이 없다는 소리)

}
