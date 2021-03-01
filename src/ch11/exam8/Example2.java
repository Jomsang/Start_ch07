package ch11.exam8;

import java.util.Calendar;

public class Example2 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); //생성자가 protected여서 정적메소드 getInstance()로 싱글톤 방식으로 설정
											   //컴퓨터에 날짜는 1개밖에 없기 때문에
		
		int year = now.get(Calendar.YEAR); //년 정보를 리턴
		int month = now.get(Calendar.MONTH) + 1; //MONTH가 0~11로 지정되있기 때문에 +1를 해야 1~12 구할 수 있음.
		int date = now.get(Calendar.DAY_OF_MONTH);//1달을 28일로 봤을때 몇월이냐 (윤년을 다 알아서 해결해서 알려줌)/1달 기준으로
		int day = now.get(Calendar.DAY_OF_WEEK);//1주일 기준 일요일 1, 월요일이 2 ...//if문이나 switch문으로 요일별 출력하는거
		int amPm = now.get(Calendar.AM_PM);
		int hour= now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int ss = Calendar.HOUR_OF_DAY;
		// 날짜를 전달할때 Date();, 구체적인 날짜를 구할 때 Calendar
		System.out.println(amPm);

	}

}
