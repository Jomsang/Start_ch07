package ch12.exam2;

public class NetworkTask extends Thread {
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