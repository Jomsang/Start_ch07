package ch11.exam7;

public class Example2 {

	public static void main(String[] args) {
		int var1 = Integer.parseInt("3");	//parseInt() - static 메소드
		double var3 = Double.parseDouble("3.5");
		
		Integer var4 = new Integer(3);
		Integer var5 = new Integer("3"); // Wrapper 클래스로 매개변수에 숫자나 문자열로 "3"도 줄 수 있음 
		Integer var6 = 3;				 //****이 문법이랑 , int var1 = Integer.parseInt("3");를 가장 많이 사용
		
	}

}
