package ch12.exam1;

public class NetworkTask implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println("��Ʈ��ũ ����� �մϴ�.");
			try {
				Thread.sleep(1000);// ��� ����� 1000�ָ� 1��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			} 
		}
		
	}
}
