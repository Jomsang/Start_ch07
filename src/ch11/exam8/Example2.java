package ch11.exam8;

import java.util.Calendar;

public class Example2 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); //�����ڰ� protected���� �����޼ҵ� getInstance()�� �̱��� ������� ����
											   //��ǻ�Ϳ� ��¥�� 1���ۿ� ���� ������
		
		int year = now.get(Calendar.YEAR); //�� ������ ����
		int month = now.get(Calendar.MONTH) + 1; //MONTH�� 0~11�� �������ֱ� ������ +1�� �ؾ� 1~12 ���� �� ����.
		int date = now.get(Calendar.DAY_OF_MONTH);//1���� 28�Ϸ� ������ ����̳� (������ �� �˾Ƽ� �ذ��ؼ� �˷���)/1�� ��������
		int day = now.get(Calendar.DAY_OF_WEEK);//1���� ���� �Ͽ��� 1, �������� 2 ...//if���̳� switch������ ���Ϻ� ����ϴ°�
		int amPm = now.get(Calendar.AM_PM);
		int hour= now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int ss = Calendar.HOUR_OF_DAY;
		// ��¥�� �����Ҷ� Date();, ��ü���� ��¥�� ���� �� Calendar
		System.out.println(amPm);

	}

}
