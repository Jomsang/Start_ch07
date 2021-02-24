package ch09.exam02;

public class Example {

	public static void main(String[] args) {
		A a = new A();
		
		 A.B b = a.new B();	//이해하면 쉬움. 들어간다 생각하면 됨. // a.new B(); 인스턴스 중첩 클래스여서 객체가 있어야 호출// 잘 안씀
		 b.field = 1;
		 b.method();
		 
		 A.C c = new A.C();//이거를 많이 씀
		 
		 
	}

}
