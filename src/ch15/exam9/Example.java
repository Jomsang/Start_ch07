package ch15.exam9;

import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("홍길서");
		stack.push("홍길남");
		
//		for(String name : stack) {	//출력이 후입선출이 안됨(pop을 사용하지 않았기 때문)
//			System.out.println(name);
//		}
		
		while(!stack.empty()) {	//비어있지 않을때까지 반복 즉 다 뽑아낼때까지
			String item = stack.pop();
			System.out.println(item);
		}
		
	}

}
