package ch18.exam13;

import java.io.Console;

public class Example {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("아이디 : ");
		String id = console.readLine();
		
		
		
		System.out.print("비밀번호 : ");
		String password = new String(console.readPassword()); // 입력 할 때 가려서 안 보임., Scanner에서 제공 안 하니 Console 클래스 사용
		//Scanner에서 제공 안 하니 Console 클래스 사용 - 단 이클립스에서 안됨. 터미널이나 cmd에서 가능
		System.out.println(id);
		System.out.println(password);
		
		
	} 

}
