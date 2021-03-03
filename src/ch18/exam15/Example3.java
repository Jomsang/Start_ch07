package ch18.exam15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example3 {

	public static void main(String[] args) {
		File file = new File("C:/Temp"); 
		
		String[] list = file.list();	//list()를 통해 파일의 정보를 얻을 수 잇음
		for(String name : list) {
			//System.out.println(name);
		}
		System.out.println();
		
		
		//----- 위는 안 씀 밑에를 사용
		
		
		File[] files = file.listFiles(); // Temp안의 파일들에 대한 정보를 출력
		for(File f : files) {
			
			long time = f.lastModified();
			Date date = new Date(time);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm" );// a는 am
			System.out.print(sdf.format(date));
			
			if(f.isDirectory()) {
				System.out.print("\t<dir>\t");
				
			}
			else {
				System.out.print("\t"+ f.length() + "\t");// 파일이면 파일의 길이를 나타 냄
			}
			System.out.println(f.getName()); 
		}
	}

}
