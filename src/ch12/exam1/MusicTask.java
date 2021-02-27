package ch12.exam1;

public class MusicTask implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println("음악을 연주 합니다.");
			try {
				Thread.sleep(1000);// 잠깐 잠들어라 1000주면 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			} 
		}
		
	}
}
