package ch12.exam1;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("메인 스레드 시작");
		
		//네트워크 작업을 하는 스레드 생성과 실행
		Thread thread1 = new Thread(new NetworkTask());//러너블 인터페이스를 구현한 객체가 올 수 있음.
		thread1.start();//start()를 하면 start 메소드를 실행하는게 아니라 객체마다 갖고있는 run()메소드가 실행
		
		
		//뮤직 작업을 하는 스레드 생성과 실행
		Thread thread2 = new Thread(new MusicTask());
		thread2.start();
		
		//채팅 작업을 하는 스레드 생성과 실행
		Thread thread3 = new Thread(new Runnable() {	//*익명 구현 객체*
			public void run() {
				while(true) {
					System.out.println("채팅 작업을 합니다.");
					try {
						Thread.sleep(1000);// 잠깐 잠들어라 1000주면 1초
					} catch (InterruptedException e) {
					}
					}
				}
		});
		thread3.start();
			//클래스를 일일히 다른 파일로 만드는 번거로움 없애기 위해 이런식으로.
				//(new Runnable() {}) - Runnable를 구현한 클래스를 선언하고나서 객체를 만든다(익명 객체)
		
		
		
		
		while(true) {
			System.out.println("메인 작업을 합니다.");
			try {
				Thread.sleep(1000);// 잠깐 잠들어라 1000주면 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			} 
		}
		
		
		//운영체제가 쓰레드마다 시간을 줘서 번갈아가면서 실행 (스케줄링)

	}

}
