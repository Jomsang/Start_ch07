package ch10.exam7;

public class Example {

	public static void main(String[] args) {
		try {
		
		method();
		}
		catch(Exception e) {
			String message = e.getMessage();
			//���� �޼������� ����ó���� �� �� ���	//���� �������� ���϶��� �̰ɷ� ������ �޼����� ������
			System.out.println(message);
			//������� �� ����� �� �ִ� ���� ����
			System.out.println(e.toString());
			
			e.printStackTrace();	//���� �� ���� �̰��� ���� ���
			if(message.contains("0001")) {
				//....
			}
			else {
				//....
			}
		}
	}
	
	
	
	
	public static void method() throws NoAccountException{
		throw new NoAccountException("�Ա� ���°� ����.");
	}
}
