package ch09.exam02;

public class A {					
	public class B{
		public int field;
		public B() {}
		public void method() {

		}
	}
	public static class C{
		public int field;
		public C() {}
		public void method() {

		}
	}
	
	public void method() { //클래스 안에 클래스 및 메소드, 필드에 접근제어자를 붙일 수 있지만!! 메소드 안에서는 접근제어자 못 붙임.
		//public
		class D {
			public int field;
			public D() {}
			public void method() {

			}
		}
		D d = new D();
		d.field = 1;
		d.method();
	}
}
