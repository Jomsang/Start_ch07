package ch15.exam7;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();
		
		set.add(new Person("È«±æµ¿", 27));
		set.add(new Person("±èÀÚ¹Ù", 30));
		set.add(new Person("¹ÚÀÚ¹Ù", 28));
		
		for(Person p : set) {
			System.out.println(p.name + " , " + p.age);
		}
		
		TreeMap<Person, Integer> map = new TreeMap<>();
		map.put(new Person("È«±æµ¿", 27), 95);
		map.put(new Person("±èÀÚ¹Ù", 30), 80);
		map.put(new Person("¹ÚÀÚ¹Ù", 28), 90);
		
		System.out.println();
		
		Set<Person> keys = map.keySet();
		for(Person p : keys) {
			System.out.println(p.name + ", "+ p.age+" : "+map.get(p));
		}
	}

}
