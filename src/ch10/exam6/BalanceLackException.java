package ch10.exam6;

public class BalanceLackException extends Exception { //Exception�̳� RuntimeException�� ��� ���� //��ý�̳� ý�̳�
	public BalanceLackException() {}	//�⺻ ������ ���� �� �ؿ�
	public BalanceLackException(String message) {	//����ϴ� Exception�� ����� �Ҹ�
		super(message);
	}
}
