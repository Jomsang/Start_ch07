package ch11.exam3;

public class Example {
	public static void method() {
		long sum = 0;
		for(int i = 0; i < 1000000; i++) {	//1000000까지 시간이 얼마나 걸리는지 테스트하기 위해
			sum += i;
		}
	}
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		method();
		long end = System.nanoTime();
		
		System.out.println("실행 시간 :"+ (end - start) + " ns "); //0.002~ 10 -9 값이 출력
	}	//기능마다 시간을 조사 할 수 있음. 

}
