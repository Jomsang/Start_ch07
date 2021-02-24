package ch10.exam6;

public class Account {
	private int balance = 10000;

	public void deposit(String account, int money) throws NoAccountException, BalanceLackException{//�Ա��� �Ϸ��� ���¿� ���� �ʿ�
		if(account == null) { //���� �Ա��Ϸ��µ� ���°� ������ "���°� �������� ����� ���ܸ� ����"

			//���� �߻� �ڵ�
			throw new NoAccountException("�Ա� ���°� �����ϴ�");
		}else if(money <= 0)	{
			throw new BalanceLackException("0�� �̻��� �Ա��Ͻʽÿ�.");
		}else {
			System.out.println("�Ա� ����");
		}
	}
	public void withdraw(String account, int money) throws NoAccountException, BalanceLackException  {

		if(account == null) { 

			//���� �߻� �ڵ�
			throw new NoAccountException("�Ա� ���°� �����ϴ�");
		}else if(money > balance)	{
			throw new BalanceLackException("�ܰ� �����մϴ�.");
		}else {
			System.out.println("��� ����");
		}



	}
}
