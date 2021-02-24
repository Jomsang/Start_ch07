package ch10.exam7;

public class Example {

	public static void main(String[] args) {
		try {
		
		method();
		}
		catch(Exception e) {
			String message = e.getMessage();
			//예외 메세지별로 예외처리를 할 때 사용	//최종 고객들한테 보일때는 이걸로 간단한 메세지만 나오게
			System.out.println(message);
			//디버깅할 때 사용할 수 있는 예외 정보
			System.out.println(e.toString());
			
			e.printStackTrace();	//개발 할 때는 이것을 많이 사용
			if(message.contains("0001")) {
				//....
			}
			else {
				//....
			}
		}
	}
	
	
	
	
	public static void method() throws NoAccountException{
		throw new NoAccountException("입금 계좌가 없음.");
	}
}
