package ch12.exam1;

public class MusicTask implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println("������ ���� �մϴ�.");
			try {
				Thread.sleep(1000);// ��� ����� 1000�ָ� 1��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			} 
		}
		
	}
}
