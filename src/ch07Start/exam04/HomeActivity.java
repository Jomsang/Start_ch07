package ch07Start.exam04;

public class HomeActivity extends Activity {
	//필드
	//생성자
	public HomeActivity(){
		
	}
	//메소드
	@Override
	public void onCreate() {
		
		super.onCreate(); //부모 클래스의 onCreate() 메소드 호출
		System.out.println("자식이 UI요소를 생성합니다.");
		System.out.println("자식이 UI요소의 이벤트를 처리합니다.");
	}
}
