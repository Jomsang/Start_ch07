package ch12.exam2;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("메인 스레드 시작");
		
		//네트워크 작업을 하는 스레드 생성과 실행
		Thread thread1 = new NetworkTask();
		thread1.start();//start()를 하면 start 메소드를 실행하는게 아니라 객체마다 갖고있는 run()메소드가 실행
		
		
		//뮤직 작업을 하는 스레드 생성과 실행
		Thread thread2 = new MusicTask();
		thread2.start();
		
		
		//채팅 작업을 하는 스레드 생성과 실행
				Thread thread3 = new Thread() {//Thread를 상속해서	이름 없는 *익명 자식 객체*를 만듬.
					public void run() {
						while(true) {
							System.out.println("채팅 작업을 합니다.");
							try {
								Thread.sleep(1000);// 잠깐 잠들어라 1000주면 1초
							} catch (InterruptedException e) {
							}
							}
						}
				};
				thread3.start();
		
		
		
		
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
