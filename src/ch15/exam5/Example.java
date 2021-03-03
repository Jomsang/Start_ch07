package ch15.exam5;

import java.io.FileReader;
import java.util.Properties;

public class Example {

	public static void main(String[] args) throws Exception{
		Properties prop = new Properties();//키,밸류 가 스트링 타입일떼 특화된 클래스.
		String path = Example.class.getResource("database.properties").getPath(); //Example파일 기준으로 파일을 찾는데, 동적으로 절대 경로로 찾을때 씀(database파일이 어디에 있든 상관 없음)
		prop.load(new FileReader(path));
		String driver = prop.getProperty("driver");//getpath랑 getproperty 기능 다시 확인하기
		System.out.println(driver); //database,pro~ 파일은 한글을 입력하면 '아스키코드' 값으로 나타남. (한글을 포함 못 시키기 때문) - 영어,특수기호,숫자만 가능.
		
		
		String nation = prop.getProperty("nation"); //properties파일의 아스키코드로 뜨는게 정상인거임.
		System.out.println(nation);
		
	}

}
