package ch11.exam8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {

	public static void main(String[] args) {
		
		Board board = new Board();
		board.setBno(1);
		board.setTitle("제목 1");
		board.setContent("내용 1");
		board.setWriter("글쓴이");
		board.setWriteDate(new Date());
		
		service(board);
	}
		//board 객체를 만들어서 매개변수를 객체로 넘기는게 훨 간결하고 보기 조음
	
	public static void service(Board board) { // int bno, String Title, ~ 보다
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
		System.out.println(board.getWriter());
		System.out.println(board.getWriteDate());// Thu Feb 25 15:32:19 KST 2021 컴퓨터형으로 뜨기 때문에 밑에 SimpleDateFormat으로 걸러줌
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd"); //2021. 02. 25를 얻고 싶으면 이렇게 사용 //!웹에서 중요!
		String strDate = sdf.format(board.getWriteDate());
		System.out.println(strDate);
	}

}
