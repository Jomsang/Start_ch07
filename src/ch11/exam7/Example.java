package ch11.exam7;



public class Example {

	public static void main(String[] args) {
		int var1 = 10;// 기본 변수 
		
		Integer var2 = new Integer(10);// 참조변수 (번지가 들어가 있음) 위와 엄연히 차이가 있음
		Integer var3 = 10;	//상식적으러 말이 안되는데 Wrapper클래스는 가능 함.
							//new Integer(10); 이 생략되있는거임! 참조변수 맞음 //Auto Boxing 이라고도 함.
		
		double var4 = 3.5;
		Double var5 = new Double(4.5);
		Double var6 = 3.5; //	Auto Boxing
		
		Integer var7 = new Integer(10);
		int var8 = var7.intValue(); // var7에 있는 10을 끄집어 내와서 int var8에 저장가능
		int var9 = var7; //Auto UnBoxing - 자동으로 박스가 풀리고 안에 값이 들어감.(intvalue() 생략
		
		Double var10 = new Double(3.5);
		double var11 = var10.doubleValue();
		double var12 = var10;
		
		
		// Wrapper 클래스의 기능들만 객체를 기본타입에 대입 가능.
		
		Object[] arr = new Object[5];
		arr[0] = "abc";		//Object는 모든 객체의 부모이기 때문에 가능
		arr[1] = 10;	//Java5 부터 가능 Integer클래스로 변환되서 객체를 생성 후 주소를 대입해줌. //Auto Boxing
		arr[2] = true;	//new Boolean이 생략돠어있음. //Auto Boxing
		
		
	}

}
