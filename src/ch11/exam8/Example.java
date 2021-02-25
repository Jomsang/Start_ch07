package ch11.exam8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {

	public static void main(String[] args) {
		
		Board board = new Board();
		board.setBno(1);
		board.setTitle("���� 1");
		board.setContent("���� 1");
		board.setWriter("�۾���");
		board.setWriteDate(new Date());
		
		service(board);
	}
		//board ��ü�� ���� �Ű������� ��ü�� �ѱ�°� �� �����ϰ� ���� ����
	
	public static void service(Board board) { // int bno, String Title, ~ ����
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
		System.out.println(board.getWriter());
		System.out.println(board.getWriteDate());// Thu Feb 25 15:32:19 KST 2021 ��ǻ�������� �߱� ������ �ؿ� SimpleDateFormat���� �ɷ���
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd"); //2021. 02. 25�� ��� ������ �̷��� ��� //!������ �߿�!
		String strDate = sdf.format(board.getWriteDate());
		System.out.println(strDate);
	}

}
