package ch15.exam8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		TreeSet<Product> set = new TreeSet<>(new Comparator<Product>() {	//Product 객체끼리 비교
			@Override
			public int compare(Product o1, Product o2) {	//Person자체에 비교 기능이 없어서 
				//Comparator 인터페이스로 compare()메소드 재정의 후비교
				if(o1.price < o2.price) {
					return -1;
				}
				else if(o1.price == o2.price) {
					return 0;
				}
				else {
					return 1;
				}
				
			}
		});
		
		set.add(new Product("TV", 10000));
		set.add(new Product("Audio", 5000));
		set.add(new Product("Car", 12000));
		
		for(Product p : set) {
			System.out.println(p.name + ", " + p.price);
		}
		
		System.out.println();
		
		
		TreeMap<Product, String> map = new TreeMap<>(new Comparator<Product>() {	//Product 객체끼리 비교
			@Override
			public int compare(Product o1, Product o2) {	//Person자체에 비교 기능이 없어서 
				//Comparator 인터페이스로 compare()메소드 재정의 후비교
				if(o1.price < o2.price) {
					return -1;
				}
				else if(o1.price == o2.price) {
					return 0;
				}
				else {
					return 1;
				}
				
			}
		});
		
		map.put(new Product("TV", 10000), "LG");	//TreeMap은 키를 정렬
		map.put(new Product("Audio", 5000), "Samsung");
		map.put(new Product("Car", 12000), "Hyundai");
		
		Set<Product> pest = map.keySet();
		for(Product p : pest) {
			System.out.println(p.name + ", "+p.price + ", "+map.get(p));
		}
		
		
		
	}

}
