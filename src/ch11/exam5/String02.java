package ch11.exam5;

import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {
		
		String ssn = "123456-1234567";
		
		//어떤 위치의 문자 1개를 얻기
		char sex = ssn.charAt(7);
		if(sex == '1' || sex == '3') {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		
		//문자열 잘라내기 : 방법 1 
		String first = ssn.substring(0, 6);// 인덱스 0부터 6전 까지를 저장
		String second = ssn.substring(0, 7);// 인덱스 0부터 7전 까지를 저장
		System.out.println(first);
		System.out.println(second);
		
		
		//문자열 잘라내기 : 방법 2
		String[] parts = ssn.split("-"); // 
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		//문자열 분리하기 : 방법 3 // 중요함1!!!! //잘라내기 보다는 분리하기가 맞음.
		StringTokenizer st = new StringTokenizer(ssn, "-");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		/*first = st.nextToken();
		second = st.nextToken();*/
	
		//String third = st.nextToken();//오류가 남 확인해보기
		
		
		
		//포함 여부 : 방법 1
		String title = "이것은 자바 책입니다.";	//12개 길이의 문자
		boolean result = title.contains("자바");
		System.out.println(result);
		
		//포함 여부 : 방법 2 //좀 중요하니 알아 둠
		int index = title.indexOf("자바");//이 문자열이 시작하는 index번호를 return 해줌.(4가 나옴.)
		if(index != -1) {	//indexOf(String st)는 없는 문자열을 줄 시에는 -1을 리턴해줌 이 if에서는 있는 문자열일 경우 참

		}
		else {

		}
		
		//문자열의 길이
		int length = title.length();
		System.out.println(length);
		
		//대치하기
		String modifiedContent = title.replace("자바", "Java"); //**문자열은 불변의 법칙임. 원래 title에 "자바"가 있기 때문에 
		System.out.println(modifiedContent);			//새로운 변수를 선언해주고 replace를 해야 대치된 modifiedContent 문자열 출력 가능.
		
		
		
	}

}
