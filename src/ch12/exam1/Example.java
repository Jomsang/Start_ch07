package ch12.exam1;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("���� ������ ����");
		
		//��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1 = new Thread(new NetworkTask());//���ʺ� �������̽��� ������ ��ü�� �� �� ����.
		thread1.start();//start()�� �ϸ� start �޼ҵ带 �����ϴ°� �ƴ϶� ��ü���� �����ִ� run()�޼ҵ尡 ����
		
		
		//���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new Thread(new MusicTask());
		thread2.start();
		
		//ä�� �۾��� �ϴ� ������ ������ ����
		Thread thread3 = new Thread(new Runnable() {	//*�͸� ���� ��ü*
			public void run() {
				while(true) {
					System.out.println("ä�� �۾��� �մϴ�.");
					try {
						Thread.sleep(1000);// ��� ����� 1000�ָ� 1��
					} catch (InterruptedException e) {
					}
					}
				}
		});
		thread3.start();
			//Ŭ������ ������ �ٸ� ���Ϸ� ����� ���ŷο� ���ֱ� ���� �̷�������.
				//(new Runnable() {}) - Runnable�� ������ Ŭ������ �����ϰ��� ��ü�� �����(�͸� ��ü)
		
		
		
		
		while(true) {
			System.out.println("���� �۾��� �մϴ�.");
			try {
				Thread.sleep(1000);// ��� ����� 1000�ָ� 1��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			} 
		}
		
		
		//�ü���� �����帶�� �ð��� �༭ �����ư��鼭 ���� (�����ٸ�)

	}

}
